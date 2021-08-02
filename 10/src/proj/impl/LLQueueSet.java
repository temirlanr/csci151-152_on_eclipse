package proj.impl;

import proj.adt.Set;
import proj.impl.LinkedListQueue;

public class LLQueueSet<T> implements Set<T> {
	
	private LinkedListQueue<T> queue;
	
	public LLQueueSet() {
		this.queue=new LinkedListQueue<T>();
	}
	
	@Override
	public void add(T value) {
		if(!contains(value)) {
			queue.enqueue(value);
		}
	}

	@Override
	public boolean contains(T value) {
		
		for(int i=0;i<queue.getSize();i++) {
			try {
				T x = queue.dequeue();
				queue.enqueue(x);
				
				if(x.equals(value)) return true;
			}catch(Exception ex) {
				
			}
		}
		return false;
	}

	@Override
	public boolean remove(T value) {
		if(contains(value)) {
			 for(int i=0;i<queue.getSize();i++) {
				try{
					T x=queue.dequeue();
					if(!x.equals(value)) {
						queue.enqueue(x);
					}
				}catch(Exception ex) {
					
				}
				
			}
			return true;
		}else return false;
	}

	@Override
	public T removeAny() throws Exception {
		if(queue.getSize()==0) throw new Exception("set is empty");
		T res=queue.dequeue();
		return res;
	}

	@Override
	public int getSize() {
		return queue.getSize();
	}

	@Override
	public void clear() {
		queue.clear();
	}

	public String toString() {
		return queue.toString();
	}
}
