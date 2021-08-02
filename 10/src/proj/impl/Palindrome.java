package proj.impl;

import proj.adt.Queue;
import proj.adt.Stack;
import proj.impl.LinkedListStack;
import proj.impl.LinkedListQueue;

public class Palindrome {
	
	public static boolean isPalindrome(Queue<Character> q) {
		Stack<Character> x = new LinkedListStack<Character>();
        Queue<Character> z = new LinkedListQueue<Character>();
        int size = q.getSize(); 
        int bool=0;
        for(int i=0; i<size; i++){
            try {
                char c = q.dequeue();
                x.push(c);
                z.enqueue(c);
                q.enqueue(c);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            
		}
		for(int i=0;i<size;i++) {
			char a='a', b='b';
			try {
				a = z.dequeue();
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			try {
				b = x.pop();
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			if(a!=b) {
				bool++;
			}
		}
		if(bool==0) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Queue<Character> queue=new LinkedListQueue<Character>();
		for(int i=0;i>10;i++) {
			queue.enqueue('a');
		}
		
		System.out.println(isPalindrome(queue));
		queue.enqueue('a');
		System.out.println(isPalindrome(queue));
		queue.enqueue('a');
		System.out.println(isPalindrome(queue));
	}
}
