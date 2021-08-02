package proj.impl;

import proj.adt.Queue;
import proj.adt.Stack;

public class Testing {
	public static void main(String[] args) {
		Queue<Integer> queue= new ArrayQueue<Integer>();
		int x=0;
		try {
			x=queue.dequeue();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		for(int i=0;i<8;i++) {
			queue.enqueue(i);
		}
		System.out.println(queue);
		System.out.println(queue.getSize());
		try {
			x=queue.dequeue();
			x=queue.dequeue();
			x=queue.dequeue();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(queue);
		System.out.println(queue.getSize());
		for(int i=0;i<9;i++) {
			
			queue.enqueue(44);
			
			queue.enqueue(33);
			
			try{
				x=queue.dequeue();
				x=queue.dequeue();
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println(queue);
			System.out.println(queue.getSize());
		}
		queue.clear();
		System.out.println(queue);
		System.out.println(queue.getSize());
		for(int i=0;i<22;i++) {
			queue.enqueue(i);
		}
		System.out.println(queue);
		System.out.println(queue.getSize());
		
		Stack<Integer> stack = new ArrayStack<Integer>();
        try {
            stack.pop();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        for (int i = 0; i < 7; i++){
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
        
        try {
			System.out.println(stack.pop());
		} catch (Exception e) {
			System.out.println(e.getMessage());
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
        stack.push(44);
        stack.push(55);

        try{
        	x= stack.pop();
        }catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }
        stack.push(88);
        stack.push(x);
        System.out.println(stack);
	}
}

