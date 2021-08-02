#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){

	setvbuf (stdout, NULL, _IONBF, 0);

	FILE *input1;
	input1=fopen("input1.txt","r");

	char a[50];

	int x=0;

	do{
		fscanf(input1, "%s", a);
		x+=atoi(a);
	}while(!feof(input1));

	printf("%i", x);

	fclose(input1);

	return 0;
}


