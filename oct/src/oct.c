
#include<stdio.h>

int main (void) {

	setvbuf(stdout, NULL, _IONBF, 0);

	int decNum;
	printf("Please enter an integer: ");
	scanf("%i",&decNum);

	do{
		int i=0;
		printf("%i =  ",decNum);
	do {
		int octal = decNum % 8;

		decNum = decNum / 8;

		printf("+ (%i*8^%i) ", octal,i);
		i++;
	} while (decNum > 0);

	printf("\nPlease enter and integer: ");
	scanf("%i",&decNum);
	}while(decNum>=0);

	printf("Done.");
	return 0;
}


