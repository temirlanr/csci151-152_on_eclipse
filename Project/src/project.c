/*#include<stdio.h>
#include<math.h>

int main(){

	setvbuf(stdout, NULL, _IONBF, 0);

	int c;
	double f;


	for(c=-50;c<=40;c++){
		f=(double)c*9/5+32;
		printf("%i Celsius degrees = %f Fahrenheit degrees \n",c,f);
	}

	return 0;
}

*/
#include<stdio.h>

long choose(int n, int k){
	if(k==n){
		return 1;
	}else if(k<n){
		if(k==1){
			return n;
		}else{
			return (choose(n,k-1)*((n-k+1)/k));
		}
	}
	return 0;
}

int main(){
	long bin;
	bin=choose(52,5);
	printf("%ld",bin);
	return 0;
}

