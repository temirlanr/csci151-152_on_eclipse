#include<stdio.h>
#include<stdlib.h>

typedef struct{
	double rain;
	double temp;
	double wind;
} weather;

void totalRain(weather *year){
	int i;
	double sum=0;
	for(i=0;i<12;i++){
		sum+=(year+i)->rain;
	}
	printf("Total Rain = %.0f cm\n", sum);
}

void lowestTemp(weather *year){
	int i;
	double min=year->temp;
	for(i=0;i<12;i++){
		if(min>(year+i)->temp){
			min=(year+i)->temp;
		}
	}
	printf("Lowest Temperature = %.1f C\n", min);
}

void averWind(weather *year){
	int i;
	double sum=0;

	for(i=0;i<12;i++){
		sum+=(year+i)->wind;
	}
	printf("Average Wind Speed = %lf m/s\n", sum/12);
}

void printMonth(weather *year){
	int i=0;
	printf("------------------------------------------\n");
	printf("| Rain(cm) | Avg.Temp(C) | Avg.Wind(m/s) |\n");
	printf("------------------------------------------\n");
	do{
		printf("| %8.0f | %11.1f | %13.1f | \n", (year+i)->rain, (year+i)->temp, (year+i)->wind);
		i++;
	}while(i<12);
	printf("------------------------------------------\n");
}

int main(){

	weather *astana=(weather*)malloc(12*sizeof(weather));

	FILE *file;
	file=fopen("astana.txt","r");

	int i=0;
	while(!feof(file)){
		fscanf(file,"%lf %lf %lf", &(astana+i)->rain, &(astana+i)->temp, &(astana+i)->wind);
		i++;
	}

	totalRain(astana);
	lowestTemp(astana);
	averWind(astana);

	printMonth(astana);

	fclose(file);

	return 0;
}
