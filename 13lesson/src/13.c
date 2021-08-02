#include<stdio.h>

typedef struct{
	int hours;
	int minutes;
	char amORpm;
} time;

int main (){

	setvbuf (stdout, NULL, _IONBF, 0);

	time now = {11,22,'a'};

	printf("the time is %i hours ", now.hours);
	printf("and %i minutes ", now.minutes);

	if(now.amORpm=='a'){
		printf("in the morning\n");
	}else{
		printf("in the afternoon\n");
	}

	int advMins;

	printf("How many minutes passed?");
	scanf("%i",&advMins);

	now.minutes+=advMins;
	while(now.minutes>=60){
		now.minutes=now.minutes-60;
		now.hours++;
	}

	printf("the time is %i hours ", now.hours);
	printf("and %i minutes ", now.minutes);

	return 0;
}
