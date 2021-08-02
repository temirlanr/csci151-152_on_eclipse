#include <stdio.h>

int main() {

	setvbuf (stdout, NULL, _IONBF, 0);

	char CopyName[81], PastName[81];
	printf("Enter the name of the 1st file: \n");
	scanf("%s", CopyName );
	printf("Enter the name of the 2nd file: \n");
	scanf("%s", PastName );

	FILE *copy;
	FILE *past;
	copy = fopen(CopyName, "w");
	char text[81];
	printf("Enter text for copying ");
	scanf("%s", text);
	fprintf(copy,"%s", text);
	past = fopen(PastName, "w");
	fclose(copy);
	copy = fopen(CopyName, "r");

	if (copy == NULL || past == NULL) {
		printf("Problem opening files.");
		return 1;
	}

	printf("Files opened successfully. \n");

	char ch;

	do {
		ch=getc(copy);
		fprintf(past,"%c",ch);
	} while (!feof(copy));

	fclose(copy);
	fclose(past);

    return 0;
}
