package proj.impl;

import proj.adt.Set;

public class testBST2Set {

public static void main(String[] args) {
		
		Set<Integer> s=new BST2Set<Integer>();
		
		s.add(5);
		s.add(12);
		s.add(3);
		s.add(6);
		s.add(14);
		s.add(2);
		s.add(-6);
		s.add(8);
		s.add(0);
		System.out.println(s);
		System.out.println(s.getSize());
		
		s.add(14);
		s.add(-6);
		s.add(5);	
		System.out.println(s);
		System.out.println(s.getSize());
		
		System.out.println(s.contains(12));
		System.out.println(s.contains(7));
		System.out.println(s.contains(2));
		System.out.println(s.contains(-8));
		System.out.println(s.contains(5));
		System.out.println(s);
		System.out.println(s.getSize());
		
		s.remove(0);
		s.remove(6);
		s.remove(3);
		System.out.println(s);
		System.out.println(s.getSize());
		
		s.add(6);
		s.add(13);
		s.add(99);
		s.add(11);
		System.out.println(s);
		System.out.println(s.getSize());
		
		s.remove(12);
		System.out.println(s);
		System.out.println(s.getSize());
		
		s.remove(5);
		System.out.println(s);
		System.out.println(s.getSize());
		
		try {
			s.removeAny();
			s.removeAny();
			s.removeAny();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(s);
		System.out.println(s.getSize());
		
		s.clear();
		System.out.println(s);
		System.out.println(s.getSize());
		
		s.add(55);
		s.add(24);
		s.add(78);
		s.add(51);
		System.out.println(s);
		System.out.println(s.getSize());
		
		Set<Student> set=new BSTSet<Student>();
		
		set.add(new Student("Bob",5555));
		set.add(new Student("Wanda",1234));
		set.add(new Student("Mark",1111));
		set.add(new Student("Nick",2222));
		set.add(new Student("Sheldon",3333));
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
		
		set.clear();
		System.out.println(set);
		System.out.println(set.getSize());
		
		set.add(new Student("Sumail",2228));
		set.add(new Student("Arteezy",3222));
		System.out.println(set);
		System.out.println(set.getSize());
	}
}
