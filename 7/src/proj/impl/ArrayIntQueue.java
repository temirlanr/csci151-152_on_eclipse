package proj.impl;

import proj.adt.IntQueue;

public class ArrayIntQueue implements IntQueue {
	
	private int[] values;
	private int size;
	private int front;
	private int back;
	
	public ArrayIntQueue(){
		size=0;
		values=new int[5];
		front=0;
		back=0;
	}

	@Override
	public void enqueue(int value) {
		values[back] = value;
        back++;
        back%=values.length;
        size++;
        
        if(back==front) {
        	int[] x=new int[size*2];
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
	public int dequeue() throws Exception {
		if(size==0) {
			throw new Exception("queue is already empty");
		}else {
			int result=values[front];
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
