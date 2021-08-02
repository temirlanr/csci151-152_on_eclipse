package proj.impl;

import java.util.*;

public class MapTester {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(1, "Lana");
		map.put(2, "Helena");
		map.put(3, "Casper");
		map.put(4, "Josh");
		map.put(5, "Drake");
		System.out.println(map);
		System.out.println(map.size());
		
		map.remove(3);
		System.out.println(map);
		System.out.println(map.size());
		
		map.remove(6);
		System.out.println(map);
		System.out.println(map.size());
		
		map.put(2, "Sam");
		map.put(3, "Cat");
		System.out.println(map);
		System.out.println(map.size());
		
		map.put(7, "Nick");
		map.put(8, "Adil");
		map.put(9, "Yernur");
		System.out.println(map);
		System.out.println(map.size());
		
		map.clear();
		System.out.println(map);
		System.out.println(map.size());
		
		map.put(10, "Sandi");
		map.put(11, "Saadat");
		System.out.println(map);
		System.out.println(map.size());
	}
}
