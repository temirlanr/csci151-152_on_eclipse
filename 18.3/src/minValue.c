#include<stdio.h>


double minValue(double arr[], int from, int to){
	double min;
	if(from==to){
		return arr[from];
	}else{
		min=minValue(arr,from,to-1);
		if(min<arr[to-1]){
			return min;
		}else{
			return arr[to-1];
		}
	}
}

int main(){
	double arr[8]={4.0,3.3,-2.2,7.4,2.32,5.43,-1.2,0.0};

	printf("minimum = %lf \n",minValue(arr,4,6));
	return 0;
}
