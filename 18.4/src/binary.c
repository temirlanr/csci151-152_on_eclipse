#include<stdio.h>

int printBinary(int n){
	if(n==0){
		return 0;
	}else{
		return (n%2+10*printBinary(n/2));
	}
}

int main(){
	int x=53, bin;
	bin=printBinary(x);
	printf("%i",bin);
	return 0;
}
