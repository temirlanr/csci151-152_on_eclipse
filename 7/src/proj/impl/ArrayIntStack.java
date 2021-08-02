package proj.impl;

import proj.adt.IntStack;

public class ArrayIntStack implements IntStack{
    private int[] values;
    private int size, sizeLimit;


    public ArrayIntStack(){
        this.sizeLimit = 1;
        this.values = new int[sizeLimit];
        this.size = 0;
    }

    @Override
    public void push(int value) {
        if(size==sizeLimit) {
        	sizeLimit++;
        	int[] copy;
        	copy=new int[sizeLimit];
        	int i;
        	for(i=0;i<size;i++) {
        		copy[i]=this.values[i];
        	}
        	copy[i++]=value;
        	this.values = new int[sizeLimit];
        	for(i=0;i<sizeLimit;i++) {
        		this.values[i]=copy[i];
        	}
        	this.size++;
        } else {
        	this.values[size] = value;
        	this.size++;
        }
    }

    @Override
    public int pop() throws Exception {
        if(this.size == 0){
            throw new Exception("The stack is already empty!!");
        }else{
        	int result = values[this.size-1];
        	this.values[size-1]=0;
        	this.sizeLimit--;
        	this.size--;
        	return result;
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void clear() {
        this.size = 0;
        sizeLimit=0;
        this.values = new int[sizeLimit];
    }

    @Override
    public String toString() {
        String string = " ";
        for (int i = 0; i < sizeLimit; i++){
           string += this.values[i] + " ";
        }
        return "bottom[" + string + "]top";
    }
}

