package proj.impl;

import proj.adt.Set;

public class testLLQHashTableSet {

	public static void main(String[] args) {
		
		Set<Integer> set= new LLQHashTableSet<Integer>(10); 
		try {
			set.removeAny();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		for(int i=1;i<=20;i++) {
			set.add(i);
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		for(int i=2;i<=20;i=i+2) {
			set.remove(i);
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		System.out.println(set.remove(10));
		System.out.println(set.remove(100));
		System.out.println(set);
		System.out.println(set.getSize());
		
		for(int i=1;i<=30;i++) {
			set.add(i);
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		for(int i=0;i<10;i++) {
			try {
				set.removeAny();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.clear();
		System.out.println(set);
		System.out.println(set.getSize());
		
		for(int i=51;i<80;i=i+2) {
			set.add(i);
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		/*set.clear();
		
		System.out.println("Starting timing tests...");
	    long time1, time2, duration;
	    time1 = System.currentTimeMillis();
	     
	    for (int i = 0; i < 500000; i++) {
	         set.add(i);
	    }
   
	    time2 = System.currentTimeMillis();
	    duration = time2 - time1;
	 
	    System.out.println("Time taken in ms: " + duration);*/
	}
}
