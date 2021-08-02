package proj.impl;

import proj.adt.SortedQueue;


public class LinkedListSortedQueue<T extends Comparable<T>> implements SortedQueue<T> {

	private Node<T> front;
	private int size;
	
	public LinkedListSortedQueue() {
		front=null;
		size=0;
	}
	
	@Override
	public void insert(T value) {
		
		Node<T> newItem = new Node<T>(value); 
        
        if(size == 0) {
            front = newItem;
        }else{
        	
           if(value.compareTo(front.getValue()) <=0){
              newItem.setLink(front);
              front = newItem;
           } else{
               Node<T> current = front;
               Node<T> before = null;
               while(current !=null){
                   if(value.compareTo(current.getValue()) <=0){
                       newItem.setLink(current);
                       before.setLink(newItem);                       
                       break;
                   }
                   before = current;
                   current = current.getLink();
               }
               
               if(current == null){
                   before.setLink(newItem);
               }
               
           }
        }
        size++;
	}

	@Override
	public T dequeue() throws Exception {
		if(size==0) throw new Exception("The queue is already empty!");
		T x = front.getValue();
		if(size==1) {
			front=null;
			size=0;
		}else {
			front=front.getLink();
			size--;
		}
		return x;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		front=null;
		size=0;
	}
	
	public String toString(){
        String x="front[ ";
        Node<T> ex = front;
        while(ex != null){
            x += ex.getValue()+" ";
            ex = ex.getLink();
        }
        
        return x+"]back";
    }
}
