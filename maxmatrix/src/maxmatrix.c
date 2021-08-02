#include<stdio.h>
#include<stdlib.h>

int main(){

	setvbuf (stdout, NULL, _IONBF, 0);

	int x,y,a[2][2];
	int i,j;
	int max;

	for(i=0;i<2;i++){
		for(j=0;j<2;j++){
			a[i][j]=rand()%10;
		}
	}

	for(i=0;i<2;i++){
		if(a[i][j]>a[i-1][j]){
			max=a[i][j];
			x=i;
			y=j;
		}
		for(j=0;j<2;j++){
			printf("%i ",a[i][j]);
			if(a[i][j]>a[i][j-1]){
				max=a[i][j];
				x=i;
				y=j;
			}
		}
		printf("\n");
	}

	printf("the max value is %i\n",max);
	printf("it is located at a[%i][%i]",x,y);

	return 0;
}

