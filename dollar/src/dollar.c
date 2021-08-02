#include <stdio.h>

int main() {

	FILE *values;
	FILE *story,*output;
	values = fopen("values.txt", "r");
	story = fopen("story.txt", "r");
	output = fopen("output.txt","w");

	if (values == NULL || story == NULL) {
			printf("Problem opening files.");
			return 1;
	}

	printf("Files opened successfully. \n");

	char ch,ch1[100];

	do {
		fscanf(values,"%s",ch1);
		do{
			fscanf(story,"%c",&ch);
			if(ch=='$'){
				fprintf(output,"%c ",ch);
				break;
			}else{
				fprintf(output,"%s",ch1);
			}
		}while(!feof(story));
	} while (!feof(values));

	fclose(values);
	fclose(story);
	fclose(output);

    return 0;
}
