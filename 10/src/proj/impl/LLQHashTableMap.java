package proj.impl;

import proj.adt.HashTableMap;
import proj.adt.KeyValuePair;

public class LLQHashTableMap<K,V> implements HashTableMap<K,V> {

	private LinkedListQueue<KeyValuePair<K,V>>[] buckets;
	private int size;
	
	public LLQHashTableMap(int a) {
		buckets=new LinkedListQueue[a];
		size=0;
	}
	
	@Override
	public void define(K key, V value) {
		
		int bool=0;
		size++;
		int x= Math.abs(key.hashCode());
		x=x%buckets.length;
		KeyValuePair<K,V> newKVP=new KeyValuePair<K,V>(key, value);
		if(buckets[x]==null) {
			buckets[x]=new LinkedListQueue<KeyValuePair<K,V>>();
			buckets[x].enqueue(newKVP);
		}else {
			for(int i=0;i<buckets[x].getSize();i++) {
				try {
					KeyValuePair<K,V> ex= buckets[x].dequeue();
					if(ex.getKey().equals(key)) {
						ex.setValue(value);
						bool++;
					}
					buckets[x].enqueue(ex);
				} catch (Exception e) {
					
				}
			}
			if(bool==0) {
				buckets[x].enqueue(newKVP);
			}
		}
	}

	@Override
	public V getValue(K key) {
		
		V v=null;
		int x= Math.abs(key.hashCode());
		x=x%buckets.length;
		if(buckets[x]!=null) {
			for(int i=0;i<buckets[x].getSize();i++) {
				try {
					KeyValuePair<K,V> ex= buckets[x].dequeue();
					if(ex.getKey().equals(key)) {
						return v;
					}
					buckets[x].enqueue(ex);
				} catch (Exception e) {
					
				}
			}
		}
		return v;
	}

	@Override
	public V remove(K key) {
		
		size--;
		V v=null;
		int x= Math.abs(key.hashCode());
		x=x%buckets.length;
		if(buckets[x]!=null) {
			for(int i=0;i<buckets[x].getSize();i++) {
				try {
					KeyValuePair<K,V> ex= buckets[x].dequeue();
					if(ex.getKey().equals(key)) {
						return v;
					}else {
						buckets[x].enqueue(ex);
					}
				} catch (Exception e) {
					
				}
			}
		}
		return v;
	}

	@Override
	public KeyValuePair<K, V> removeAny() throws Exception {
		if(size==0) throw new Exception("Map is empty");
		KeyValuePair<K,V> ex=null;
		int i=0;
		while(i<buckets.length) {
			if(buckets[i]==null) {
				i++;
			}else {
				try{
					ex=buckets[i].dequeue();
				}catch(Exception e) {
					
				}
				i=i+buckets.length;
			}
		}
		size--;
		return ex;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		buckets=new LinkedListQueue[buckets.length];
		size=0;
	}
	public String toString() {
		
		String res="[ ";
		for(int i=0;i<buckets.length;i++) {
			res+=buckets[i].toString();
		}
		return res+"]";
	}

	@Override
	public int getNumberOfBuckets() {
		return buckets.length;
	}

	@Override
	public int getBucketSize(int index) throws Exception {
		if(buckets[index].getSize()==0) throw new Exception("the bucket is empty");
		return buckets[index].getSize();
	}

	@Override
	public double getLoadFactor() {
		return size/buckets.length;
	}

	@Override
	public double getBucketSizeStandardDev() {
		double sd=0,sum=0,mean=0;
		for(int i=0;i<buckets.length;i++) {
			int x = buckets[i].getSize();
			sum+=x;
		}
		mean=sum/getNumberOfBuckets();
		
		int sumOfSquares=0;
        
        for (int i = 0; i < buckets.length; i++) {
            int x = 0;
            if(buckets[i]!=null) {
            	x = buckets[i].getSize(); 
            }
            sumOfSquares += Math.pow(x - mean , 2);
        }
		sd=Math.sqrt(sumOfSquares/buckets.length);
		return sd;
	}

	@Override
	public String bucketsToString() {
		
		String res="[ ";
		for(int i=0;i<buckets.length;i++) {
			res+=buckets[i].toString();
		}
		return res+"]";
	}
	
	
}
