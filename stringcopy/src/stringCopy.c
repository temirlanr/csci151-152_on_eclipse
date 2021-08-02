#include<stdio.h>

void stringCopy(char fromStr[],char toStr[]){
	int i=0;
	char text;
	while(fromStr[i]!='\0'){
		text=fromStr[i];
		toStr[i]=text;
		i++;
	}
	toStr[i]='\0';
}

int main(){
	char from[6]={'h','o','h','e','y','\0'};
	char to[32];
	stringCopy(from,to);
	printf("from = %s \nto = %s \n",from,to);
	return 0;
}
