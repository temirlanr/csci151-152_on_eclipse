#include<stdio.h>
#include<stdlib.h>

char* stringCopy(char *fromStr){
	char *toStr=(char*)malloc(sizeof(toStr));
	toStr=fromStr;
	return toStr;
}

int main(){
	char *from="brick bread",*to;

	to=stringCopy(from);

	printf("%s", to);

	return 0;
}
