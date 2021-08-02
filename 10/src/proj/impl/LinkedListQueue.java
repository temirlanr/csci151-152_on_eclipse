package proj.impl;

import proj.adt.Queue;

public class LinkedListQueue<T> implements Queue<T> {

	private Node<T> back;
	private Node<T> front;
	private int size;
	
	public LinkedListQueue(){
		back=null;
		front=null;
		size=0;
	}
	
	@Override
	public void enqueue(T value) {
		
		Node<T> x=new Node<T>(value);
		if(size==0) {
			back=x;
			front=x;
		}
		if(size>0) back.setLink(x);
		back = x;
		size++;
	}
	
	@Override
	public T dequeue() throws Exception {
		if(size==0) throw new Exception("The queue is already empty!");
		else{
			T x = front.getValue();
			if(size==1) {
				front=null;
				back=null;
				size=0;
			}else {
				front.setValue(front.getLink().getValue());
				front.setLink(front.getLink().getLink());
				size--;
			}
			return x;
		}
	}
	@Override
	public int getSize() {
		return size;
	}
	@Override
	public void clear() {
		back=null;
		front=null;
		size=0;
	}
	
	public String toString() {
		String x = "";
		Node<T> ex = front;
		while(ex!=null) {
			x+=ex.getValue()+" ";
			ex=ex.getLink();
		}
		return x;
	}
}
