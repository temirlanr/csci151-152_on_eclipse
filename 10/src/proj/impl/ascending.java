package proj.impl;

import proj.adt.Stack;

public class ascending {
	
	public static boolean isIncreasing(Stack<Double> st) {
		
		Stack<Double> x = st;
		double ex1=0, ex2=0;
		int bool=0;
		
		for(int i=0;i<st.getSize();i++) {
			
			if(i==0) {
				try{
					ex1=x.pop();
				} catch (Exception ex){
		            System.out.println(ex.getMessage());
		        }
				ex2=ex1;
			}else {
				try{
					ex1=x.pop();
				} catch (Exception ex){
		            System.out.println(ex.getMessage());
		        }
				if(ex1>ex2) bool++;
				ex2=ex1;
			}
		}
		if(bool==0) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Stack<Double> stack=new LinkedListStack<Double>();
		for (double i = 0; i < 12; i++){
            stack.push(i);
        }
		
		stack.push(11.0);
		System.out.println(stack);
		System.out.println(isIncreasing(stack));
	}
}
