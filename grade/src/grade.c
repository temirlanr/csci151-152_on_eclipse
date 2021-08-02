#include<stdio.h>
#include<math.h>

int main (void){

	setvbuf(stdout, NULL, _IONBF, 0);

	double grade;

	printf("Your final grade percentage is ");
	scanf("%lf",&grade);

	if(grade>100){
		printf("Error.");
	}else if(grade<0){
		printf("Error.");
	}else if(95<=grade){
		printf("A");
	}else if(90<=grade){
		printf("A-");
	}else if(85<=grade){
		printf("B+");
	}else if (80<=grade){
		printf("B");
	}else if(75<=grade){
		printf("B-");
	}else if (70<=grade){
		printf("C+");
	}else if (65<=grade){
		printf("C");
	}else if (60<=grade){
		printf("C-");
	}else if (55<=grade){
		printf("D+");
	}else if (50<=grade){
		printf("D");
	}else if (0<=grade){
		printf("F");
	}else if(grade>100){
		printf("Error.");
	}else if(grade<0){
		printf("Error.");
	}

	return 0;
}

