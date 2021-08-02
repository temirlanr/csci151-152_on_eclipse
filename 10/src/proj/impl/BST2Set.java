package proj.impl;

import proj.adt.Set;

public class BST2Set<T extends Comparable<T>> implements Set<T> {
    private OnOffTreeNode<T> root;
    private int size;
    
    public BST2Set(){
        root = null;
        size = 0;
    }
    
    @Override
    public void add(T value) {
        if(root == null){
            root = new OnOffTreeNode<T>(value);
            size++;
        }
        else if(addHelper(value, root)) size++;
    }
    
    private boolean addHelper(T value, OnOffTreeNode<T> x){
         if(value.equals(x.getValue())){
             boolean res = !x.isActive();
             x.switchOn();
             return res;
         }
         else if(value.compareTo(x.getValue()) <= 0){
            if(x.getLeft() == null){
                x.setLeft(new OnOffTreeNode<T>(value));
                return true;
            }
            else return addHelper(value, x.getLeft());
         }
         else{
            if(x.getRight() == null){
                x.setRight(new OnOffTreeNode<T>(value));
                return true;
            }
            else return addHelper(value, x.getRight());
        }
    }
    
    private boolean containsHelper(T value, OnOffTreeNode<T> x){
    	if(x == null)return false;
    	else if(value.equals(x.getValue()))return x.isActive();
    	else if(value.compareTo(x.getValue()) <= 0)return containsHelper(value, x.getLeft());
        else  return containsHelper(value, x.getRight());
    }
    
    @Override
    public boolean contains(T value) {
        return containsHelper(value, root);
    }
    
    @Override
    public boolean remove(T value) {
        OnOffTreeNode<T> x = root;
        
        while(x!=null && !value.equals(x.getValue())){
            if(value.compareTo(x.getValue()) <= 0)x = x.getLeft();
            else x = x.getRight();
        }
        if(x == null || !x.isActive())return false;
        x.switchOff();
        size--;
        return true;
    }

    @Override
    public T removeAny() throws Exception {
        if(size == 0)throw new Exception("the set is empty");
        size--;
        OnOffTreeNode<T> res = removeActive(root);
        res.switchOff();
        return res.getValue();
    }
    
    private OnOffTreeNode<T> removeActive(OnOffTreeNode<T> x){
        if(x == null)return null;
        else if(x.isActive())return x;
        else{
            OnOffTreeNode<T> res = removeActive(x.getLeft());
            if(res == null)return removeActive(x.getRight());
            else return res;
        }
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
    public String toString(){
        return findString(root);
    }
    
    private String findString(OnOffTreeNode<T> nd){
        if(nd == null)return "";
        String res = findString(nd.getLeft());
        if(nd.isActive())res += nd.toString() + " ";
        res += findString(nd.getRight());
        return res;
    }

    
}

