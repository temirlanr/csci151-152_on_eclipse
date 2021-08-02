#include<stdio.h>

void reverse(char fromStr[],char toStr[]){
	int i=0,k,j,l=0;
	while(fromStr[i]!='\0'){
		i++;
	}
	char c[i];
	while(fromStr[l]!='\0'){
			c[l]=fromStr[l];
			l++;
		}
	for(k=i-1,j=0;k>=0,j<i;k--,j++){
		toStr[j]=c[k];
	}
	toStr[i]='\0';
}

int main(){
	char from[6]={'h','o','h','e','y','\0'};
	char to[32];
	reverse(from,to);
	printf("from - %s \nto - %s",from,to);
	return 0;
}
