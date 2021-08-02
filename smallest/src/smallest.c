#include<stdio.h>

double smallest(int size,double arr[]){
	int k;
	double min;
	for(k=0;k<size;k++){
		if(k==0){
			min=arr[k];
		}else if(arr[k]<arr[k-1]){
			min=arr[k];
		}
	}
	return min;
}

int main(){
	double vals[4] = {70,36,828,1};
	double output;
	output = smallest(4, vals);
	printf("The smallest item is %lf",output);
	return 0;
}
