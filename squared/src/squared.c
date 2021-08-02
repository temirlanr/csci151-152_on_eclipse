#include<stdio.h>
#include<math.h>

int main(){

	setvbuf(stdout, NULL, _IONBF, 0);

	int a;
	printf("Please enter an integer: ");
	scanf("%i", &a);

	do{
		int b=pow(a,2);
		printf("The number squared is %i\n",b);

		printf("Please enter an integer: ");
		scanf("%i", &a);
	}while(a>=0);
	printf("Done.");

	return 0;
}


