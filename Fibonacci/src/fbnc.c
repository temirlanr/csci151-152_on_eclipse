#include <stdio.h>

int main (){

	int a = 0, b = 1, c = 1;

	while (c <= 10){

		printf ("%i\n", a);
		printf ("%i\n", b);
		a = a + b;
		b = a + b;
		c++;
	}

	return 0;
}

