package proj.impl;

import proj.adt.Queue;
import proj.adt.Stack;

public class test {
	public static void main(String[] args) {
		
		Stack<Integer> stack=new ArrayListStack<Integer>();
		
		try {
            stack.pop();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        for (int i = 0; i < 12; i++){
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.getSize());
        try{
        	stack.pop();
        	stack.pop();
        }catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }
        
        System.out.println(stack);
        System.out.println(stack.getSize());
        
        stack.clear();
        System.out.println(stack);
        System.out.println(stack.getSize());
        
        for (int j = 0; j < 22; j++){
            stack.push(j);
        }
        System.out.println(stack);
        System.out.println(stack.getSize());
        
        Queue<Integer> queue=new LinkedListQueue<Integer>();
    	
    	try {
    		queue.dequeue();
    	}catch(Exception ex) {
    		System.out.println(ex.getMessage());
    	}
    	for (int i = 0; i < 8; i++){
            queue.enqueue(i);
        }
        System.out.println(queue);
        System.out.println(queue.getSize());
        try{
        	queue.dequeue();
        	queue.dequeue();
        	queue.dequeue();
        }catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }
        
        System.out.println(queue);
        System.out.println(queue.getSize());
        
        for(int i=0; i<9; i++) {
        	queue.enqueue(33);
        	queue.enqueue(44);
        	try {
        		queue.dequeue();
        		queue.dequeue();
        	}catch(Exception ex) {
        		System.out.println(ex.getMessage());
        	}
        	System.out.println(queue);
            System.out.println(queue.getSize());
        }
        
        queue.clear();
        System.out.println(queue);
        System.out.println(queue.getSize());
        
        for (int j = 0; j < 22; j++){
            queue.enqueue(j);
        }
        System.out.println(queue);
        System.out.println(queue.getSize());
        
	}
}
