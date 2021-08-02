
package proj.impl;

import proj.adt.Stack;

public class TowerOfHanoi {

	private Stack<Integer>[] post = new ArrayListStack[3];
	private int numMoves = 0;
	
	public TowerOfHanoi(int numDiscs) {
		
		for(int i=0;i<3;i++) {
			post[i]=new ArrayListStack<Integer>();
		}
		
		for(int i=numDiscs;i>=1;i--) {
			post[0].push(i);
		}
		post[1].clear();
		post[2].clear();
	}
	
	public void moveDisc(int from, int to) throws Exception {
		/* 
		 TODO:  Moves the integer from the top of post[from] to 
		 post[to].  Throws an exception if either index is not
		 0, 1, or 2; or if post[from] is empty; or if the value
		 on top of post[from] is bigger than the topmost item of
		 post[to].
		 */
		
		if(from!=0 || from!=1 || from!=2 ||
				to!=0 || to!=1 || to!=2) {
			throw new Exception("index is not correct");
		}else if(post[from].getSize()==0) {
			throw new Exception("post[from] is empty");
		}else if(getTopmost(from)>getTopmost(to)) {
			throw new Exception("topmost item of post[from] is bigger than of post[to]");
		}else {
			post[to].push(post[from].pop());
			numMoves++;	
		}
		post[to].push(post[from].pop());
		numMoves++;	
	}
	
	public ArrayListStack<Integer> getPost(int n){
		return (ArrayListStack<Integer>) post[n];
	}
	
	public int getTopmost(int n) {
		
		int x=0;
		try {
			x=post[n].pop();
			post[n].push(x);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return x;
	}
	
	public boolean isFinished() {
		/*
		 TODO:  Returns true if and only if all of the discs are
		 on post[2] (i.e., post[0] and post[1] are empty)
		 */
		if(post[0].getSize()==0 && post[1].getSize()==0) return true;
		else return false;
	}
	
	public int getNumMoves() {
		return numMoves;
	}
	
	public String toString() {
		/* 
		 TODO:  Returns some string representation of the current
		 game state.... this should help with debugging
		 */
		return "1) "+post[0].toString()+"\n"+
		 "2) "+post[1].toString()+"\n"+
		"3) "+post[2].toString();
	}
	
}
