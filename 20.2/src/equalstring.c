#include<stdio.h>

_Bool areEqual(char str1[],char str2[]){
	int i=0,p=0;
	char c;
	while(str1[i]!='\0'){
		c=str1[i];
		if(str2[i]==c){
			p=0;
		}else{
			p++;
		}
		i++;
	}
	if(p==0){
		return 1;
	}else{
		return 0;
	}
}

int main(){
	char first[8]={'G','u','l','d','a','n','a','\0'};
	char second[8]={'G','u','l','d','a','n','a','\0'};
	int f;
	f=areEqual(first,second);
	if(f==1){
		printf("they are equal");
	}else printf("they are not equal");
	return 0;
}
