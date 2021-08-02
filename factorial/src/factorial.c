#include<stdio.h>
#include<math.h>

int main(){

	setvbuf (stdout, NULL, _IONBF, 0);

	int x[]={0,1,2,3,4,5,6,7,8,9};
	int y;

	int j;
	for(j=0;j<10;j++){
		if(j==0 || j==1){
			y=1;
		}else{
		y=x[j]*y;
		}
		printf("%i \n",y);
	}

	return 0;
}
