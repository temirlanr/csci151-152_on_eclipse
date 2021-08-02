package proj.impl;

public class TOHSolution {
	
	public static void main(String[] args) {
		
		TowerOfHanoi toh=new TowerOfHanoi(10);	
		
		solve(toh,10);
	}
	
	public static void solve(TowerOfHanoi x, int size) {
		
		for(int i=1;i<=((Math.pow(2, size)-1)/3);i++) {
			
			if(i==1) {
				try {
					x.moveDisc(0, 1);
					x.moveDisc(0, 2);
					x.moveDisc(1, 2);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(i%2==1) {
				try {
					x.moveDisc(0, 1);
					x.moveDisc(0, 2);
					x.moveDisc(1, 2);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else {
				
				if(x.getPost(1).getSize()==0 || x.getTopmost(1)>x.getTopmost(0)) {
					try {
						x.moveDisc(0, 1);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else {
					try {
						x.moveDisc(1, 0);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				if(x.getPost(2).getSize()==0 || x.getTopmost(2)>x.getTopmost(0)) {
					try {
						x.moveDisc(0, 2);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else {
					try {
						x.moveDisc(2, 0);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				if(x.getPost(2).getSize()==0 || x.getTopmost(2)>x.getTopmost(1)) {
					try {
						x.moveDisc(1, 2);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}else {
					try {
						x.moveDisc(2, 1);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
		System.out.println(x.getNumMoves());
		System.out.println(x.toString());
	}
}
