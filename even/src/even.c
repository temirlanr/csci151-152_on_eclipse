#include <stdio.h>

int main(void){

	setvbuf(stdout, NULL, _IONBF, 0);

	int n,a=2,remainder;

	printf("Please, enter the number: ");
	scanf("%i", &n);

	while(a<n){

		remainder=n%a;

		if(remainder==0){

			printf("%i ", a);
			a++;
		}else{
			a++;
		}
	}

	return 0;
}

