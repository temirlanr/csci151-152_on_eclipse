#include <stdio.h>

int main(){

	int n,k = 0,y = 1;

	setvbuf (stdout, NULL, _IONBF, 0);

	printf ("n:\n ");
	scanf ("%i", &n);

	while(y <= n){
		while(y <= n){

		y *= 2;
		k++;
		}
		k--;
	}

	printf ("k is %i\n", k);

	return 0;
}

