package proj.impl;

import java.util.Random;

import proj.adt.HashTableSet;

public class TimeTesting {
	 public static void main(String[] args) {
		 
		 Random rand=new Random();
	      
	      HashTableSet<Integer> set = new BSTHashTableSet(10);
	  
	      System.out.println("Starting timing tests...");
	      long time1, time2, duration;
	      time1 = System.currentTimeMillis();
	      
	      for (int i = 0; i < 50000; i++) {
	    	 int x=rand.nextInt(50000);
	           set.add(x);
	      }
	    
	      time2 = System.currentTimeMillis();
	      duration = time2 - time1;
	  
	      System.out.println("Time taken in ms: " + duration);
	      
	      System.out.println(set.getLoadFactor());
	      System.out.println(set.getBucketSizeStandardDev());
	 }
}
