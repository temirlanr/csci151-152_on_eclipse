package proj.impl;

import proj.adt.Set;

public class BSTSet<T extends Comparable<T>> implements Set<T> {
	
	private TreeNode<T> root;
	private int size;
	
	public BSTSet() {
		root=null;
		size=0;
	}

	@Override
	public void add(T value) {
		if(!contains(value)) {
			size++;
			TreeNode<T> newItem=new TreeNode<T>(value);
			if(root==null) {
				root=newItem;
			}else {
				
				TreeNode<T> x = root;    
	            while(x!=null){
	                if(x.getValue().compareTo(newItem.getValue())>=0){
	                    
	                    if(x.getLeft()==null) {
	                        x.setLeft(newItem);
	                        return;
	                    }
	                    x = x.getLeft();
	                } else if(x.getValue().compareTo(newItem.getValue())<0){
	                    
	                    if(x.getRight()==null) {
	                        x.setRight(newItem);
	                        return;
	                    }
	                    x = x.getRight();
	                }
	            }
			}
		}else return;
	}

	@Override
	public boolean contains(T value) {
		
		if(root==null) return false;
		else {
			
			TreeNode<T> x = root;    
            while(true){
                
            	if(x.getValue().compareTo(value)>0){
                    
                    if(x.getLeft()==null) {
                        return false;
                    }
                    x = x.getLeft();
                } else if(x.getValue().compareTo(value)<0){
                    
                    if(x.getRight()==null) {
                        return false;
                    }
                    x = x.getRight();
                }else return true;
            }
		}
	}

	@Override
	public boolean remove(T value) {
		if(!contains(value)) return false;
		else {
			TreeNode<T> x = root;
			TreeNode<T> par=null;
			boolean isLeft=false;
			while(true){
                
            	if(x.getValue().compareTo(value)>0){
                    
                    if(x.getLeft()==null) {
                        return false;
                    }
                    par=x;
                    x = x.getLeft();
                    isLeft=true;
                } else if(x.getValue().compareTo(value)<0){
                    
                    if(x.getRight()==null) {
                        return false;
                    }
                    par=x;
                    x = x.getRight();
                    isLeft=false;
                }else {
                	
                	size--;
                	if(size==0) {
            			root=null;
            			return true;
            		}
                	if(x.getLeft()==null && x.getRight()==null) {
                		
                		if(isLeft==true){
                			par.setLeft(null);
                			return true;
                		}else {
                			par.setRight(null);
                			return true;
                		}
                	}
                	
                	if(x.getLeft()==null) {
                		
                		if(isLeft==true) {
                			par.setLeft(x.getRight());
                			x=null;
                			return true;
                		}else {
                			par.setRight(x.getRight());
                			x=null;
                			return true;
                		}
                	}else if(x.getRight()==null) {
                		
                		if(isLeft==true) {
                			par.setLeft(x.getLeft());
                			x=null;
                			return true;
                		}else {
                			par.setRight(x.getLeft());
                			x=null;
                			return true;
                		}
                	}
                	
                	if(x.getLeft()!=null && x.getRight()!=null) {
                		TreeNode<T> min=x;
                		while(true) {
                			min=min.getRight();
                    		while(min.getLeft()!=null) {
                    			min=min.getLeft();
                    			return true;
                    		}
                    		if(min.getRight()!=null) {
                    			return false;
                    		}
                    		x.setValue(min.getValue());
                    		min=null;
                		}
                		
                	}
                }
            }
		}
	}

	@Override
	public T removeAny() throws Exception {
		if(size==0) throw new Exception("the set is empty");
		T res=null;
		res=root.getValue();
		remove(res);
		return res;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		root=null;
		size=0;
	}

	public String toString() {
		return toStringHelper(root);
	}
	
	private String toStringHelper(TreeNode<T> node) {
		if(node==null) {
			return "";
		}
		
		return toStringHelper(node.getLeft())+" "+
				node.getValue()+" "+
				toStringHelper(node.getRight());
	}
}
