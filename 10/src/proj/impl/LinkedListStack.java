package proj.impl;

import proj.adt.Stack;

public class LinkedListStack<T> implements Stack<T> {
	
	private Node<T> top;
	private int size;
	
	public LinkedListStack() {
		top=null;
		size=0;
	}

	@Override
	public void push(T value) {
		
		Node<T> x = new Node<T>(value);
		if(size>0) x.setLink(top);
		top=x;
		size++;
	}

	@Override
	public T pop() throws Exception {
		if(size==0) {
			throw new Exception("The stack is already empty!");
		}else {
			T x = top.getValue();
			//if(size==1) {
			//	top=null;
		//	}else {
				top.setValue(top.getLink().getValue());
				top.setLink(top.getLink().getLink());
			//}
			size--;
			return x;
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		top=null;
		size=0;
	}
	
	public String toString() {
		String x = " ";
		Node<T> ex = top;
		while(ex!=null) {
			x+=ex+" ";
			ex=ex.getLink();
		}
		return "top["+x+"]bottom";
	}
}
