package proj.impl;

import proj.adt.Queue;

public class ArrayQueue<T> implements Queue<T> {
	
	private T[] values;
	private int size;
	private int front;
	private int back;

	public ArrayQueue(){
		size=0;
		values=(T[]) new Object[5];
		front=0;
		back=0;
	}
	
	@Override
	public void enqueue(T value) {
		values[back] = value;
        back++;
        back%=values.length;
        size++;
        
        if(back==front) {
        	T[] x=(T[]) new Object[size*2];
        	for(int i=front;i<size;i++) {
        		x[i-front]=values[i];
        	}
        	for(int i=0;i<back;i++) {
        		x[size-front+i]=values[i];
        	}
        	values=x;
        	front=0;
        	back=size;
        }
	}

	@Override
	public T dequeue() throws Exception {
		if(size==0) {
			throw new Exception("queue is already empty");
		}else {
			T result=values[front];
			front++;
			if(front==values.length) front=0;
			size--;
			return result;
		}
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		size=0;
		front=0;
		back=0;
	}
	
	public String toString() {
		String res = "front[ ";
        for(int i=0;i<size;i++){
            if(i+front<values.length)res += values[i+front] + " ";
            else res += values[i-(values.length-front)] + " ";
        }
        res += " ] end";
        
        return res;
	}
}
