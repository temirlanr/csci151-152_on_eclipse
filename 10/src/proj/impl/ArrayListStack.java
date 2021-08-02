package proj.impl;

import proj.adt.Stack;
import java.util.*;

public class ArrayListStack<T> implements Stack<T> {

	ArrayList<T> stack;
	private int index;
	
	public ArrayListStack() {
		stack=new ArrayList<T>();
		index=0;
	}
	
	@Override
	public void push(T value) {
		stack.add(index, value);
		index++;
	}

	@Override
	public T pop() throws Exception {
		if(stack.size()==0) throw new Exception("Stack is empty");
		index--;
		return stack.remove(index);
	}

	@Override
	public int getSize() {
		return stack.size();
	}

	@Override
	public void clear() {
		stack=new ArrayList<T>();
		index=0;
	}

	public String toString() {
		return stack.toString();
	}
}
