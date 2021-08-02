#include<stdio.h>

typedef struct {
	int ID;
	char gender;
	double grade1,grade2,grade3,grade4,grade5,finalgrade;
} student;

int main(){

	setvbuf (stdout, NULL, _IONBF, 0);

	student x;

	printf("enter ID ");
	scanf("%i",&x.ID);

	printf("gender(m/f): ");
	scanf(" %c",&x.gender);

	printf("grades for 5 quizzes ");
	scanf(" %lf %lf %lf %lf %lf",&x.grade1,&x.grade2,&x.grade3,&x.grade4,&x.grade5);

	x.finalgrade=(x.grade1+x.grade2+x.grade3+x.grade4+x.grade5)/5;

	printf("the final grade of student with ID %i",x.ID);
	printf(", gender %c",x.gender);
	printf(" and grades %lf %lf %lf %lf %lf",x.grade1,x.grade2,x.grade3,x.grade4,x.grade5);
	printf(" is %lf",x.finalgrade);

	return 0;
}
