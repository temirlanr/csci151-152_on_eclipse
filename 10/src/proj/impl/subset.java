package proj.impl;

import proj.adt.Set;

public class subset {
	
	public static boolean isSubset(Set<Integer> set1,Set<Integer> set2) {
		
		Set<Integer> ex1=set1, ex2=set2;
		if(set1.getSize()==0) return true;
		else {
			int size=set1.getSize();
			for(int i=0;i<size;i++) {
				try {
					int x=ex1.removeAny();
					if(!ex2.contains(x)) {
						return false;
					}
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		return true;
	}
	
	public static Set<String> union(Set<String> set1, Set<String> set2){
		Set<String> ex1=set1, ex2=set2;
		String ex=null;
		try {
			int size=ex1.getSize();
			for(int i=0;i<size;i++) {
				ex=ex1.removeAny();
				ex2.add(ex);
			}
		}catch(Exception e) {
			
		}
		return ex2;
	}
	
	public static Set<Integer> intersection(Set<Integer> set1,Set<Integer> set2){
		Set<Integer> ex1=set1, ex2=set2,res=new LLStackSet<Integer>();
		int size=ex1.getSize(), ex=0;
		try {
			for(int i=0;i<size;i++) {
				ex = ex1.removeAny();
				if(ex2.contains(ex)) {
					res.add(ex);
				}
			}
		}catch(Exception e) {
			
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		Set<Integer> ex1=new LLStackSet<Integer>();
		Set<Integer> ex2=new LLStackSet<Integer>();
		
		ex1.add(22);
		ex1.add(11);
		
		ex2.add(22);
		ex2.add(11);
		ex2.add(33);
		ex2.add(44);
		
		System.out.println(ex1);
		System.out.println(ex2);
		
		System.out.println(intersection(ex1,ex2));
		
		System.out.println(isSubset(ex1,ex2));
		
		ex1.clear();
		System.out.println(isSubset(ex1,ex2));
		
		Set<String> string1=new LLQueueSet<String>();
		Set<String> string2=new LLQueueSet<String>();
		
		string1.add("bot");
		string1.add("top");
		
		string2.add("hey");
		string2.add("ho");
		
		System.out.println(union(string1,string2));
	}
}
