#include<stdio.h>
#include<stdlib.h>

double maxVal(int len, double arr[len][len]){
	int i=0,j=0;
	double max;
	for(i=0;i<len;i++){
		if(i==0){
			max=arr[i][j];
		}else if(arr[i][j]>arr[i-1][j]){
			max=arr[i][j];
		}
		for(j=0;j<len;j++){
			if(j==0){
				max=arr[i][j];
			}else if(arr[i][j]>arr[i][j-1]){
				max=arr[i][j];
			}
		}
	}
	return max;
}

int main(){
	double biggest[3][3];
	double x;
	int i,j;
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			biggest[i][j]=rand()%20;
			printf("%lf ",biggest[i][j]);
		}
		printf("\n");
	}
	x=maxVal(3,biggest);
	printf("%lf",x);
	return 0;
}

