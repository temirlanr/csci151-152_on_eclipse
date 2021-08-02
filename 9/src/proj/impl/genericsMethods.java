package proj.impl;

import proj.impl.ArrayQueue;
import proj.impl.ArrayStack;
import proj.adt.Queue;
import proj.adt.Stack;

public class genericsMethods {
	
	public static int evenCount(Stack<Integer> stk) throws Exception{
        int res = 0;
        Stack<Integer> temp = new ArrayStack<Integer>();
        while(stk.getSize()>0){
            int top = stk.pop();
            if(top % 2 == 0)res++;
            temp.push(top);
        }
        
        while(temp.getSize()>0){
            stk.push(temp.pop());
        }
        return res;
        
    }
    
    public static Queue<Integer> copyQueue(Queue<Integer> orig) throws Exception{
        Queue<Integer> res = new ArrayQueue<Integer>();
        
        for(int i=0;i<orig.getSize();i++){
            int next = orig.dequeue();
            res.enqueue(next);
            orig.enqueue(next);
        }
        
        return res;
        
    }
    
    public static void reverseQueue(Queue<Integer> toRev) throws Exception{
        
    	Stack<Integer> temp = new ArrayStack<Integer>();
        
        while(toRev.getSize() > 0){
            temp.push(toRev.dequeue());
        }
        
        while(temp.getSize() > 0){
            toRev.enqueue(temp.pop());
        }
    }
    
    public static boolean isPalindrome(Queue<Integer> q) throws Exception{
        Queue<Integer> temp = copyQueue(q);
        reverseQueue(temp);
        boolean res = true;
        for(int i=0;i<q.getSize();i++){
            int next =  q.dequeue();
            if(next != temp.dequeue())res = false;
            
            q.enqueue(next);
        }
        return res;
    }
    
    public static void main(String args[]) throws Exception{
        
        Stack<Integer> stk = new ArrayStack<Integer>();
        
        for(int i=0;i<10;i++){
            stk.push(i);
        }
       
        System.out.println("Even: " + evenCount(stk));
        
        Queue<Integer> que = new ArrayQueue<Integer>();
        
        for(int i=0;i<5;i++){
            que.enqueue(i);
        }
        for(int i=3;i>=0;i--){
            que.enqueue(i);
        }
        
        System.out.println(que + " | Is Palindrome: " + isPalindrome(que));
    }
}
