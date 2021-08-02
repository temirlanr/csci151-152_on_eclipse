#include<stdio.h>

long choose(int n, int k){
		if(k==0){
			return 1;
		}else{
			return (choose(n,k-1)*((n-k+1)/k));
		}
}

int main(){
	long bin;
	bin=choose(3,1);
	printf("%li",bin);
	return 0;
}
