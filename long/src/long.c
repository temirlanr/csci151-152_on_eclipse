#include<stdio.h>

int main(){

	setvbuf (stdout, NULL, _IONBF, 0);

	char ch;
	int x=0,y=0;

	printf("Please enter text: ");

	do{
		ch=getchar();

		if(ch==' ' || ch=='\n'){

			if(x!=0){
				printf("%i \n",x);
			}
			x=0;
		}else{
			x++;

			if(y<=x){
				y=x;
			}
		}
	}while(ch!='\n');

	printf("The longest one is %i",y);

	return 0;
}


