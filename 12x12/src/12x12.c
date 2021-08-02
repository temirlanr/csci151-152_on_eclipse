#include <stdio.h>

int main(){

	setvbuf (stdout, NULL, _IONBF, 0);

	int i,j,a,b=1,in;

	printf("Please provide an integer number: ");
	scanf("%i", &in);

	a=in-1;
	for(i=0;i<in;i++){

		for(j=0;j<a;j++){
			printf(" ");
		}
		for(j=0;j<b;j++){
			printf("* ");
		}
		a--;
		b++;
		printf("\n");
	}

	return 0;
}


