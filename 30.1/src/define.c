#include<stdio.h>

#define QUIZZES 6
#define LABS 6
#define DROP_LOWEST_QUIZ 1

int main(){

	setvbuf (stdout, NULL, _IONBF, 0);

	int i;
	double q[QUIZZES],l[LABS],fe;

	printf("please enter grades for quizzes: ");
	for(i=0;i<QUIZZES;i++){
		scanf("%lf", &q[i]);
	}
	printf("please enter grades for labs: ");
	for(i=0;i<LABS;i++){
		scanf("%lf", &l[i]);
	}
	printf("please enter grade for final exam: ");
	scanf("%lf", &fe);

	double lowest,sumQ=0;
	for(i=0;i<QUIZZES;i++){
		if(i==0){
			lowest=q[i];
		}else{
			if(q[i]<lowest){
				lowest=q[i];
			}
		}
		sumQ+=q[i];
	}

	double sumL=0;
	for(i=0;i<LABS;i++){
		sumL+=l[i];
	}

	double aveQ,aveL,fg;
	if(DROP_LOWEST_QUIZ==1){
		sumQ-=lowest;
		aveQ=sumQ/(QUIZZES-1);
		aveL=sumL/LABS;
		fg=(0.5*aveQ)+(0.2*aveL)+(0.3*fe);
	}else{
		aveQ=sumQ/QUIZZES;
		aveL=aveL/LABS;
		fg=(0.5*aveQ)+(0.2*aveL)+(0.3*fe);
	}

	printf("your final grade is %lf", fg);

	return 0;
}
