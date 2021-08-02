#include <stdio.h>

int main() {

	FILE *file;
	file = fopen("datafile.txt", "w");

	if (file == NULL) {
		printf("Problem opening file.");
		return 1;
	}

	printf("File opened successfully.");

	fprintf(file, "Hello there!");

	fclose(file);

    return 0;
}
