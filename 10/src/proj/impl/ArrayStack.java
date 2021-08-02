package proj.impl;

import proj.adt.Stack;

public class ArrayStack<T> implements Stack<T> {

	private T[] values;
    private int size, sizeLimit;


    public ArrayStack(){
        sizeLimit = 1;
        values = (T[]) new Object[sizeLimit];
        size = 0;
    }

    @Override
    public void push(T value) {
        if(size==sizeLimit) {
        	sizeLimit++;
        	T[] copy;
        	copy=(T[]) new Object[sizeLimit];
        	int i;
        	for(i=0;i<size;i++) {
        		copy[i]=values[i];
        	}
        	copy[i++]= value;
        	values = (T[]) new Object[sizeLimit];
        	for(i=0;i<sizeLimit;i++) {
        		values[i]=copy[i];
        	}
        	size++;
        } else {
        	values[size] = value;
        	size++;
        }
    }

    @Override
    public T pop() throws Exception {
        if(size == 0){
            throw new Exception("The stack is already empty!!");
        }else{
        	T result = values[size-1];
        	//values[size-1]=0;
        	sizeLimit--;
        	size--;
        	return result;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        sizeLimit=0;
        values = (T[]) new Object[sizeLimit];
    }

    @Override
    public String toString() {
        String string = " ";
        for (int i = 0; i < sizeLimit; i++){
           string += values[i] + " ";
        }
        return "bottom[" + string + "]top";
    }
}
