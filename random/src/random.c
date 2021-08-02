#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main(){

	setvbuf (stdout, NULL, _IONBF, 0);

	int n[20], max, min;
	double ave, sum=0;

		int i;
		for(i=0;i<20;i++){
			n[i]=(rand()%51)+50;
			printf("%i \n",n[i]);
			if(i==0){
						max=n[i];
						min=n[i];
					}
			if(n[i]>=max){
						max=n[i];
					}
			if(n[i]<=min){
						min=n[i];
					}
			sum+=n[i];
		}

		ave=sum/20;

	printf("The minimum value is %i \n", min);
	printf("The maximum value is %i \n", max);
	printf("The average value is %lf", ave);

	return 0;
}

