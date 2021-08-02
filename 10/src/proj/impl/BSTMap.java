package proj.impl;

import proj.adt.KeyValuePair;
import proj.adt.Map;

public class BSTMap<K, V extends Comparable<K>> implements Map<K, V> {
	
	private TreeNode<KeyValuePair<K,V>> root;
	private int size;
	 
	public BSTMap() {
		root = null;
		size = 0;
	}
	 
	 @Override
	public void define(K key, V value) {
		 
		 size++;
		 TreeNode<KeyValuePair<K,V>> newKVP=new TreeNode<KeyValuePair<K,V>>(new KeyValuePair<K,V>(key, value)); 
		 if(root==null) {
			 root=newKVP;
		 }else {
			 TreeNode<KeyValuePair<K,V>> x=root;
			 while(x!=null) {
				 if(((Comparable<K>) x.getValue().getKey()).compareTo(newKVP.getValue().getKey())>0){
	                    
					 	if(x.getLeft()==null) {
	                        x.setLeft(newKVP);
	                        return;
	                    }
	                    x = x.getLeft();
				 } else if(((Comparable<K>) x.getValue().getKey()).compareTo(newKVP.getValue().getKey())<0){
	                    
	                    if(x.getRight()==null) {
	                        x.setRight(newKVP);
	                        return;
	                    }
	                    x = x.getRight();
	                }else {
	                	x.getValue().setValue(value);
	                }
			 }
		 }
	}
	
	@Override
	public V getValue(K key) {
		
		V v=null;
		if(root==null) {
			 return v;
		 }else {
			 TreeNode<KeyValuePair<K,V>> x=root;
			 while(x!=null) {
				 if(((Comparable<K>) x.getValue().getKey()).compareTo(key)>0){
	                    
					 	if(x.getLeft()==null) {
	                        return v;
	                    }
	                    x = x.getLeft();
				 } else if(((Comparable<K>) x.getValue().getKey()).compareTo(key)<0){
	                    
	                    if(x.getRight()==null) {
	                        return v;
	                    }
	                    x = x.getRight();
	                }else {
	                	v=x.getValue().getValue();
	                }
			 }
		 }
		return v;
	}
	 
	@Override
	public V remove(K key) {
		return null;
	}
	 
	@Override
	public KeyValuePair<K, V> removeAny() throws Exception {
		if(size==0) throw new Exception("Map is empty");
		KeyValuePair<K, V> x=root.getValue();
		remove(root.getValue().getKey());
		return x;
	}
	 
	@Override
	public int getSize() {
		return size;
	}
	 
	@Override
	public void clear() {
		root = null;
		size = 0;
	}
	 
	@Override
	public String toString() {
		return "";
	}
}
