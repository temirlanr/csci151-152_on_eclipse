package proj.impl;

import proj.adt.Deque;

public class LinkedListDeque<T> implements Deque<T> {
	
	private DoublyLinkedNode<T> front;
	private DoublyLinkedNode<T> back;
	
	private int size;
	
	public LinkedListDeque() {
		front=null;
		back=null;
		size=0;
	}

	@Override
	public void pushToFront(T value) {
		
		DoublyLinkedNode<T> x = new DoublyLinkedNode<T>(value);
		
		if(size==0) {
			back=x;
			front=x;
		} else {
			front.setPrevious(x);
			x.setNext(front);
		}
		front=x;
		size++;
	}

	@Override
	public void pushToBack(T value) {
		
		DoublyLinkedNode<T> x=new DoublyLinkedNode<T>(value);
		if(size==0) {
			back=x;
			front=x;
		} else {
			back.setNext(x);
			x.setPrevious(back);
		}
		back = x;
		size++;
	}

	@Override
	public T popFromFront() throws Exception {
		
		if(size==0) throw new Exception("The deque is already empty!");
		else {
			T x = front.getValue();
			if(size==1) {
				front=null;
				back=null;
				size=0;
			}else {
				front.setValue(front.getNext().getValue());
				front.setNext(front.getNext().getNext());
				front.setPrevious(null);
				size--;
			}
			return x;
		}
	}

	@Override
	public T popFromBack() throws Exception {

		if(size==0) throw new Exception("The deque is already empty!");
		else {
			T x = back.getValue();
			if(size==1) {
				front=null;
				back=null;
				size=0;
			}else {
				back=back.getPrevious();
				back.setNext(null);
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
		front=null;
		back=null;
		size=0;
	}

	public String toString() {
		
		String x="front[ ";
        DoublyLinkedNode<T> ex = front;
        while(ex != null){
            x += ex.getValue()+" ";
            ex = ex.getNext();
        }
        
        return x+"]back";
    }
}
