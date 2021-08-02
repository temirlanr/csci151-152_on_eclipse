package proj.impl;

import proj.impl.ArrayIntQueue;
import proj.impl.ArrayIntStack;
import proj.adt.IntQueue;
import proj.adt.IntStack;

public class Methods {
    
	public static int evenCount(IntStack stk) throws Exception{
        int res = 0;
        IntStack temp = new ArrayIntStack();
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
    
    public static IntQueue copyQueue(IntQueue orig) throws Exception{
        IntQueue res = new ArrayIntQueue();
        
        for(int i=0;i<orig.getSize();i++){
            int next = orig.dequeue();
            res.enqueue(next);
            orig.enqueue(next);
        }
        
        return res;
        
    }
    
    public static void reverseQueue(IntQueue toRev) throws Exception{
        
    	IntStack temp = new ArrayIntStack();
        
        while(toRev.getSize() > 0){
            temp.push(toRev.dequeue());
        }
        
        while(temp.getSize() > 0){
            toRev.enqueue(temp.pop());
        }
    }
    
    public static boolean isPalindrome(IntQueue q) throws Exception{
        IntQueue temp = copyQueue(q);
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
        
        IntStack stk = new ArrayIntStack();
        
        for(int i=0;i<10;i++){
            stk.push(i);
        }
       
        System.out.println("Even: " + evenCount(stk));
        
        IntQueue que = new ArrayIntQueue();
        
        for(int i=0;i<5;i++){
            que.enqueue(i);
        }
        for(int i=3;i>=0;i--){
            que.enqueue(i);
        }
        
        System.out.println(que + " | Is Palindrome: " + isPalindrome(que));
    }
}
