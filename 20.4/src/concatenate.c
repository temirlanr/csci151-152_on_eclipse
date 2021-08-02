#include<stdio.h>

void concat(char str1[],char str2[],char resultStr[]){
	int i,j,k,l,a,b,c;
	i=0;
	while(str1[i]!='\0'){
		i++;
	}
	char first[i];
	j=0;
	while(str2[j]!='\0'){
		j++;
	}
	char second[j];
	k=i+j;
	for(a=0;str1[a]!='\0';a++){
		first[a]=str1[a];
	}
	for(b=0;str2[b]!='\0';b++){
		second[b]=str2[b];
	}
	for(l=0;l<i;l++){
		resultStr[l]=first[l];
	}
	for(l=i,c=0;l<k,c<j;l++,c++){
		resultStr[l]=second[c];
	}
	resultStr[k]='\0';
}

int main(){
	char f[4]={'h','e','y','\0'};
	char s[4]={'m','a','n','\0'};
	char res[32];
	concat(f,s,res);
	printf("1: %s \n2: %s \nresult: %s",f,s,res);
	return 0;
}
