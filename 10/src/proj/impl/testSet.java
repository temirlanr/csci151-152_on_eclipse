package proj.impl;

import proj.adt.Set;

public class testSet {
	
	public static void main(String[] args) {
		/*Set<Student> set=new LLQueueSet<Student>();
		try {
			set.removeAny();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.clear();
		
		set.add(new Student("Bob",5555));
		System.out.println(set);
		System.out.println(set.getSize());
		set.add(new Student("Wanda",1234));
		System.out.println(set);
		System.out.println(set.getSize());
		set.add(new Student("Mark",1111));
		System.out.println(set);
		System.out.println(set.getSize());
		set.add(new Student("Nick",2222));
		System.out.println(set);
		System.out.println(set.getSize());
		set.add(new Student("Sheldon",3333));
		System.out.println(set);
		System.out.println(set.getSize());
		
		try {
			set.removeAny();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.remove(new Student("Wanda",1234));
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.remove(new Student("jdfnsf",4434));
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.add(new Student("Bob",5555));
		set.add(new Student("Wanda",1234));
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.add(new Student("Habar",8923));
		set.add(new Student("Jerax",2392));
		System.out.println(set);
		System.out.println(set.getSize());
		
		for(int i=0;i<2;i++) {
			try {
				Student ex=set.removeAny();
				System.out.println(ex);
			}catch(Exception e) {
				
			}
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.clear();
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.add(new Student("Sumail",2228));
		set.add(new Student("Arteezy",3222));
		System.out.println(set);
		System.out.println(set.getSize());*/
		
		
		Set<Student> set=new LLStackSet<Student>();
		try {
			set.removeAny();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.clear();
		
		set.add(new Student("Bob",5555));
		System.out.println(set);
		System.out.println(set.getSize());
		set.add(new Student("Wanda",1234));
		System.out.println(set);
		System.out.println(set.getSize());
		set.add(new Student("Mark",1111));
		System.out.println(set);
		System.out.println(set.getSize());
		set.add(new Student("Nick",2222));
		System.out.println(set);
		System.out.println(set.getSize());
		set.add(new Student("Sheldon",3333));
		System.out.println(set);
		System.out.println(set.getSize());
		
		try {
			set.removeAny();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.remove(new Student("Wanda",1234));
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.remove(new Student("jdfnsf",4434));
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.add(new Student("Bob",5555));
		set.add(new Student("Wanda",1234));
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.add(new Student("Habar",8923));
		set.add(new Student("Jerax",2392));
		System.out.println(set);
		System.out.println(set.getSize());
		
		for(int i=0;i<2;i++) {
			try {
				Student ex=set.removeAny();
				System.out.println(ex);
			}catch(Exception e) {
				
			}
		}
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.clear();
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.add(new Student("Sumail",2228));
		set.add(new Student("Arteezy",3222));
		System.out.println(set);
		System.out.println(set.getSize());
	}
}
