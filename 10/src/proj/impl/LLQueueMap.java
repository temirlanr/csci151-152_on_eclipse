package proj.impl;

import proj.adt.KeyValuePair;
import proj.adt.Map;

public class LLQueueMap<K, V> implements Map<K, V> {

	private LinkedListQueue<KeyValuePair<K, V>> pairs;
	
	public LLQueueMap() {
		pairs=new LinkedListQueue<KeyValuePair<K, V>>();
	}
	
	@Override
	public void define(K key, V value) {
		
		KeyValuePair<K, V> x=new KeyValuePair<K, V>(key, value);
		int bool=0;
		for(int i=0;i<pairs.getSize();i++) {
			try {
				KeyValuePair<K, V> ex=pairs.dequeue();
				pairs.enqueue(ex);
				if(ex.getKey().equals(key)) {
					ex.setValue(value);
					bool++;
				}
			} catch (Exception e) {
				
			}
		}
		if(bool==0) {
			pairs.enqueue(x);
		}
	}

	@Override
	public V getValue(K key) {
		
		V v=null;
		for(int i=0;i<pairs.getSize();i++) {
			try {
				KeyValuePair<K, V> x=pairs.dequeue();
				pairs.enqueue(x);
				if(x.getKey().equals(key)) {
					v=x.getValue();
				}
			} catch (Exception e) {
				
			}
		}
		return v;
	}

	@Override
	public V remove(K key) {
		
		V v=null;
		for(int i=0;i<pairs.getSize();i++) {
			try {
				KeyValuePair<K, V> x=pairs.dequeue();
				if(x.getKey().equals(key)) {
					v=x.getValue();
				}else {
					pairs.enqueue(x);
				}
			} catch (Exception e) {
				
			}
		}
		return v;
	}

	@Override
	public KeyValuePair<K, V> removeAny() throws Exception {
		if(pairs.getSize()==0) {
			throw new Exception("Map is empty");
		}else {
			return pairs.dequeue();
		}
	}

	@Override
	public int getSize() {
		return pairs.getSize();
	}

	@Override
	public void clear() {
		pairs.clear();
	}
	
	public String toString() {
		return pairs.toString();
	}
}
