#include<stdio.h>

#define ARRAY 4
#define ELEMENT_TYPE int

int main(){

	setvbuf (stdout, NULL, _IONBF, 0);

	double y=3, z=2, b=y/z;
	ELEMENT_TYPE a[ARRAY], min, x=b;

	int i;
	if(x>1){
		printf("please enter %i values of type double for array: ", ARRAY);
		for(i=0;i<ARRAY;i++){
			scanf("%lf", &a[i]);
		}
	}else if(x==1){
		printf("please enter %i values of type int for array: ", ARRAY);
		for(i=0;i<ARRAY;i++){
			scanf("%i", &a[i]);
		}
	}

	for(i=0;i<ARRAY;i++){
		if(i==0){
			min=a[i];
		}else{
			if(a[i]<min){
				min=a[i];
			}
		}
	}

	if(x>1){
		printf("the minimum value is %lf", min);
	}else if(x==1){
		printf("the minimum value is %i", min);
	}

	return 0;
}
