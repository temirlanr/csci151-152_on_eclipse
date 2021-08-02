#include<stdio.h>

void print(int size, double arr[size]){
	int i;
	for(i=0;i<size;i++){
		printf("%lf ",arr[i]);
	}
	printf("\n");
}

void func(int size, double arr1[size], double arr2[size]){
	int i,j;
	for(i=size-1,j=0;i>=0;i--,j++){
		arr2[j]=arr1[i];
	}
	for(i=0;i<size;i++){
		arr1[i]=arr2[i];
	}
}

int main(){
	double x[4]={4.3,53.5,32.4,4.5},y[4];
	print(4,x);
	func(4,x,y);
	print(4,x);
	return 0;
}
