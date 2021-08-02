package proj.impl;

import proj.adt.Deque;
import proj.impl.LinkedListDeque;

public class testDeque {
	
	public static void main(String[] args) {
		
		Deque<Integer> deque=new LinkedListDeque<Integer>();
		
		try {
			deque.popFromFront();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		try {
			deque.popFromBack();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(deque);
		System.out.println(deque.getSize());
		
		for(int i=1;i<6;i++) {
			deque.pushToFront(i);
			System.out.println(deque);
			System.out.println(deque.getSize());
		}
		
		
		for(int i=0;i<5;i++) {
			try {
				deque.popFromFront();
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println(deque);
			System.out.println(deque.getSize());
		}
		
		for(int i=1;i<7;i++) {
			deque.pushToFront(i);
			System.out.println(deque);
			System.out.println(deque.getSize());
		}
		
		
		for(int i=0;i<6;i++) {
			try {
				deque.popFromBack();
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println(deque);
			System.out.println(deque.getSize());
		}
		
		for(int i=1;i<8;i++) {
			deque.pushToBack(i);
			System.out.println(deque);
			System.out.println(deque.getSize());
		}
		
		
		for(int i=0;i<7;i++) {
			try {
				deque.popFromBack();
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println(deque);
			System.out.println(deque.getSize());
		}
		
		for(int i=1;i<9;i++) {
			deque.pushToBack(i);
			System.out.println(deque);
			System.out.println(deque.getSize());
		}
		
		
		for(int i=0;i<8;i++) {
			try {
				deque.popFromFront();
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println(deque);
			System.out.println(deque.getSize());
		}
		
		for(int i=1;i<=10;i++) {
			deque.pushToFront(i);
			deque.pushToBack(i);
			System.out.println(deque);
			System.out.println(deque.getSize());
		}
		
		for(int i=1;i<=8;i++) {
			try {
				deque.popFromFront();
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			try {
				deque.popFromBack();
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println(deque);
			System.out.println(deque.getSize());
		}
		
		deque.clear();
		System.out.println(deque);
		System.out.println(deque.getSize());
		
		deque.pushToBack(33);
		deque.pushToFront(55);
		deque.pushToBack(44);
		System.out.println(deque);
		System.out.println(deque.getSize());
		
	}
	
	
}
