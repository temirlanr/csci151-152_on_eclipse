	#include<stdio.h>

	double power(double x, int n){
		if(n==0){
			return 1.0;
		}else if(n>0){
			if(n%2==0){
				return power(x,n/2)*power(x,n/2);
			}else{
				return power(x,n-1)*x;
			}
		}else if(n<0){
			if(n%2==0){
				return (1/power(x,-n/2))*(1/power(x,-n/2));
			}else{
				return (1/x)*(1/power(x,-n-1));
			}
		}
	}

	int main(){
		double v;
		int j;
		for(j=0;j<5;j++){
			for(v=1.0;v<=5.0;v=v+0.5){
				printf(" %.1f^%i = %.3f \n",v,j,power(v,j));
			}
		}
		return 0;
	}
