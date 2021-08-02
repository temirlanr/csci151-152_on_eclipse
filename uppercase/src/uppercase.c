#include<stdio.h>

int main(){

	setvbuf (stdout, NULL, _IONBF, 0);


	int i;


	do{
		i=getchar();
		if(i>=97 && i<=122){
			i=i-32;
			putchar(i);
		}else{
			putchar(i);
		}
	}while(i!='\n');

	return 0;
}
