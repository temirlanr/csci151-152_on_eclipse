#include<stdio.h>

void writeln(char letters[]) {

	int i;

	for(i=0; letters[i]!='\0'; i++){
		printf("%c", letters[i]);
	}

	putchar('\n');
}

int main( ) {

	char arr[] = "abcdef";
	char *ptr = "ghijklmnop";

	writeln(arr);
	writeln(ptr);
	writeln("qrstuv");

	return 0;
}
