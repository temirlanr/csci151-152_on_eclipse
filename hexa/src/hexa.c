#include<stdio.h>

int main (void) {

	setvbuf(stdout, NULL, _IONBF, 0);

	int decNum;
	printf("Please enter and integer: ");
	scanf("%i",&decNum);

	do{
		int i=0;
		printf("%i =  ",decNum);
	do {
		int hdec = decNum % 16;
		decNum = decNum / 16;

		printf("+ (%i*16^%i) ", hdec,i);
		i++;
	}while(decNum > 0);
	printf("\nPlease enter and integer: ");
	scanf("%i",&decNum);
	}while(decNum>=0);

	printf("Done.");
	return 0;
}


