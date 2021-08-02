package proj.impl;

import proj.adt.KeyValuePair;
import proj.adt.Map;

public class LLStackMap<K, V> implements Map<K, V> {

	private LinkedListStack<KeyValuePair<K, V>> pairs;
	
	public LLStackMap() {
		pairs=new LinkedListStack<KeyValuePair<K, V>>();
	}
	
	@Override
	public void define(K key, V value) {
		KeyValuePair<K, V> x=new KeyValuePair<K, V>(key, value);
		LinkedListStack<KeyValuePair<K, V>> st=new LinkedListStack<KeyValuePair<K, V>>();
		int bool=0;
		for(int i=0;i<pairs.getSize();i++) {
			try {
				KeyValuePair<K, V> ex=pairs.pop();
				if(ex.getKey().equals(key)) {
					bool++;
					ex.setValue(value);
				}
				st.push(ex);
			}catch(Exception e) {
				
			}
		}
		for(int i=0;i<pairs.getSize();i++) {
			try {
				KeyValuePair<K, V> ex=st.pop();
				pairs.push(ex);
			}catch(Exception e) {
				
			}
		}
		if(bool==0) {
			pairs.push(x);
		}
	}

	@Override
	public V getValue(K key) {
		LinkedListStack<KeyValuePair<K, V>> st=new LinkedListStack<KeyValuePair<K, V>>();
		V v=null;
		for(int i=0;i<pairs.getSize();i++) {
			try {
				KeyValuePair<K, V> ex=pairs.pop();
				if(ex.getKey().equals(key)) {
					v=ex.getValue();
				}
				st.push(ex);
			}catch(Exception e) {
				
			}
		}
		for(int i=0;i<pairs.getSize();i++) {
			try {
				KeyValuePair<K, V> ex=st.pop();
				pairs.push(ex);
			}catch(Exception e) {
				
			}
		}
		return v;
	}

	@Override
	public V remove(K key) {
		LinkedListStack<KeyValuePair<K, V>> st=new LinkedListStack<KeyValuePair<K, V>>();
		V v=null;
		for(int i=0;i<pairs.getSize();i++) {
			try {
				KeyValuePair<K, V> ex=pairs.pop();
				if(ex.getKey().equals(key)) {
					v=ex.getValue();
				}else {
					st.push(ex);
				}
			}catch(Exception e) {
				
			}
		}
		for(int i=0;i<st.getSize();i++) {
			try {
				KeyValuePair<K, V> ex=st.pop();
				pairs.push(ex);
			}catch(Exception e) {
				
			}
		}
		return v;
	}

	@Override
	public KeyValuePair<K, V> removeAny() throws Exception {
		if(pairs.getSize()==0) throw new Exception("Map is empty");
		else return pairs.pop();
	}

	@Override
	public int getSize() {
		return pairs.getSize();
	}

	@Override
	public void clear() {
		pairs=new LinkedListStack<KeyValuePair<K, V>>();
	}

	public String toString() {
		return pairs.toString();
	}
}
