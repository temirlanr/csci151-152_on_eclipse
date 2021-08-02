package proj.impl;

import proj.adt.Set;

public class LLStackSet<T> implements Set<T> {
	
	private LinkedListStack<T> stack;
	
	public LLStackSet() {
		this.stack=new LinkedListStack<T>();
	}
	
	@Override
	public void add(T value) {
		
		if(!contains(value)) {
			stack.push(value);
		}
	}

	@Override
	public boolean contains(T value) {
		
		LinkedListStack<T> s=new LinkedListStack<T>();
		int size1=stack.getSize();
		for(int i=0;i<size1;i++) {
			try {
				T ex=stack.pop();
				s.push(ex);
				if(ex.equals(value)) {
					
					int size2=s.getSize();
					for(int j=0;j<size2;j++) {
						try {
							stack.push(s.pop());
						}catch(Exception e) {
							
						}
					}
					return true;
				}else if(stack.getSize()==0) {
					
					int size2=s.getSize();
					for(int j=0;j<size2;j++) {
						try {
							stack.push(s.pop());
						}catch(Exception e) {
							
						}
					}
				}
			}catch(Exception e) {
				
			}
		}
		
		return false;
	}

	@Override
	public boolean remove(T value) {
		if(contains(value)) {
			LinkedListStack<T> s=new LinkedListStack<T>();
			T ex=null;
			int size=stack.getSize();
			for(int i=0;i<size;i++) {
				try {
					ex=stack.pop();
					if(!ex.equals(value)) {
						s.push(ex);
					}
				}catch(Exception e) {
					
				}
			}
			for(int i=0;i<size-1;i++) {
				try {
					ex=s.pop();
					stack.push(ex);
				}catch(Exception e) {
					
				}
			}
			return true;
		}else return false;
	}

	@Override
	public T removeAny() throws Exception {
		if(stack.getSize()==0) throw new Exception("set is empty");
		T ex = stack.pop();
		return ex;
	}

	@Override
	public int getSize() {
		return stack.getSize();
	}

	@Override
	public void clear() {
		stack.clear();
	}
	
	public String toString() {
		return stack.toString();
	}
}
