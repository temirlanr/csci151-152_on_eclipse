#include <stdio.h>

int main(void) {

	setvbuf(stdout, NULL, _IONBF, 0);

	int d, dw;

	printf("Please, enter a day: ");
	scanf("%i", &d);

	if(d>=1 && d<=366) {
		dw=d%7;
		switch(dw) {
		case 1:
			printf("It is Friday, ");
			break;
		case 2:
			printf("It is Saturday, ");
			break;
		case 3:
			printf("It is Sunday, ");
			break;
		case 4:
			printf("It is Monday, ");
			break;
		case 5:
			printf("It is Tuesday, ");
			break;
		case 6:
			printf("It is Wednesday, ");
			break;
		case 0:
			printf("It is Thursday, ");
			break;
		}
	}

	if(d<1 || d>366){
		printf ("Error.");
	} else if(d<=31){
		printf("January %i", d);
	} else if (d<=60) {
		printf("February %i", d-31);
	} else if (d<=91) {
		printf("March %i", d-60);
	} else if (d<=121) {
		printf("April %i", d-91);
	} else if (d<=152) {
		printf("May %i", d-121);
	} else if (d<=182) {
		printf("June %i", d-152);
	} else if (d<=213) {
		printf("July %i", d-182);
	} else if (d<=244) {
		printf("August %i", d-213);
	} else if (d<=274) {
		printf("September %i", d-244);
	} else if (d<=305) {
		printf("October %i", d-274);
	} else if (d<=335) {
		printf("November %i", d-305);
	} else {
		printf("December %i", d-335);
	}

	return 0;
}


