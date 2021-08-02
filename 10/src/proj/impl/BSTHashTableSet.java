package proj.impl;

import proj.adt.HashTableSet;

public class BSTHashTableSet<T extends Comparable<T>> implements HashTableSet<T>  {

	private BST2Set<T>[] buckets;
	private int size;
	
	public BSTHashTableSet(int k) {
		buckets = new BST2Set[k];
		size=0;
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
		return null;
	}

	@Override
	public void add(T value) {
		if(!contains(value)) {
			int x= Math.abs(value.hashCode());
			x=x%buckets.length;
			if(buckets[x]==null) { 
				buckets[x]=new BST2Set<T>();
				buckets[x].add(value);
			}else {
				buckets[x].add(value);
			}
			size++;
		}
	}

	@Override
	public boolean contains(T value) {
		int x= Math.abs(value.hashCode());
		x=x%buckets.length;
		if(buckets[x]==null) {
			return false;
		}
		return buckets[x].contains(value);
	}

	@Override
	public boolean remove(T value) {
		if(contains(value)) {
			int x= Math.abs(value.hashCode());
			x=x%buckets.length;
			size--;
			return buckets[x].remove(value);
		}else return false;
	}

	@Override
	public T removeAny() throws Exception {
		if(size==0) throw new Exception("the set is empty");
		T ex=null;
		int i=0;
		while(i<buckets.length) {
			if(buckets[i].getSize()==0) {
				i++;
			}else {
				ex=buckets[i].removeAny();
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

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		size=0;
		for(int i=0;i<buckets.length;i++) {
			buckets[i].clear();
		}
	}

	public String toString() {
		String res="[ ";
		for(int i=0;i<buckets.length;i++) {
			res+=buckets[i].toString();
		}
		return res+"]";
	}
}
