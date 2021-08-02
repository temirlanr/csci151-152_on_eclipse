package proj.impl;

import proj.adt.Deque;

public class Merge {
	
	public static void main(String[] args) {
		
		Deque<Integer> ex=new LinkedListDeque<Integer>();
		
		for(int i=0;i<10;i++) {
			ex.pushToFront(i);
			ex.pushToBack(i);
		}
		System.out.println(mergeSort(ex));
		
	}
	
	public static Deque<Integer> merge(Deque<Integer> d1, Deque<Integer> d2) {
		
		Deque<Integer> deque=new LinkedListDeque<Integer>();
		int size1=d1.getSize();
		int size2=d2.getSize();
		int length = d1.getSize()+d2.getSize();
		int sc1=0, sc2=0;
		int x1=0, x2=0;
		
		for(int i=0; i<length; i++){
	         
	         try {
	        	 x1 = d1.popFromFront();
	         } catch (Exception ex) {
	        	 //System.out.println(ex.getMessage());
	         }
	         try {
	        	 x2 = d2.popFromFront();
	         } catch (Exception ex) {
	        	 //System.out.println(ex.getMessage());
	         }
	         
	         if(sc1==size1){
	        	 
	             deque.pushToBack(x2);
	             sc2++;
	         	} else if (sc2==size2) {
	        	 
	             deque.pushToBack(x1);
	             sc1++;
	         } else if (x1<x2) {
	        	 
	             deque.pushToBack(x1);
	             sc1++;
	             d2.pushToFront(x2);
	         } else {
	        	 
	        	 deque.pushToBack(x2);
	        	 d1.pushToFront(x1);
	        	 sc2++; 
	         }
	         
	     }
		
		return deque;
	} 
	 
	 
	public static Deque<Integer> mergeSort(Deque<Integer> deq) {
		
		int size = deq.getSize();
		if(size <=1) {
			return deq;
		}else {
            
        	int mid = (deq.getSize()/ 2);
        	Deque<Integer> d1 = new LinkedListDeque<Integer>();
            for (int i = 0; i < mid; i++) {
            	try {
            		d1.pushToBack(deq.popFromFront());
            	} catch (Exception ex) {
            		
            	}
            }
            
            Deque<Integer> d2 = new LinkedListDeque<Integer>();
            for (int i = mid; i < size; i++) {
            	try {
            	   d2.pushToBack(deq.popFromFront());
            	} catch (Exception ex) {
            		
            	}
            }
            
            d1 = mergeSort(d1);
            d2 = mergeSort(d2);
            
            return merge(d1, d2);        
        }
		
	     /* Step 0:  base case???
	        Step 1:  split deq into two Deques of relatively equal size
	        Step 2:  pass both of these Deques into mergeSort
	        Step 3:  pass the resulting Deques into merge, and return the result
	     */
	} 
	
	

}
