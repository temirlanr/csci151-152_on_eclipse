#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct _Node {
	char strData[50];
	struct _Node *next;
} Node;

int countFileLines(char file[]) {

	FILE *filein;
	filein = fopen(file, "r");
	int count = 0;
	if (filein == NULL) {
		printf("Problem opening file.");
	} else {
		char ch;

		do {
			ch = fgetc(filein);
			if (ch == '\n') {
				count++;
			}

		} while (ch != EOF);
	}
	fclose(filein);
	return count;
}
/*
 * Takes in the filename
 в—‹ Opens the file
 в—‹ Counts and saves the number of lines
 в—‹ Closes File
 в—‹ Returns the number
 */

void writeFile2(char fileName[], char ssData[], Node **oLinkedList) {
	FILE *fileWrite;
	fileWrite = fopen(fileName, "a");

	if (fileWrite == NULL) {
		printf("Problem opening file.");
	} else {
		fprintf(fileWrite, "%s\n", ssData);
		Node *node;
		for (node = *oLinkedList; node != NULL; node = node->next) {
			fprintf(fileWrite, "%s", node->strData);
		}
		fputc('\n', fileWrite);
	}
}

/*Takes in the output fileвЂ™s name, and the checked substring, output data in the linked list
 в—‹ Opens the file
 в—‹ Writes the checked substring to the file
 в—‹ Writes the data in the output linked list out to the file
 в—‹ Closes the file
 */
/* */
int isPalindrome(char str[]) { //works

	int i= strlen(str), //for counting number of chars in a string
			k, //loop variable
			bool; //equals to 1(true) or 0(false)
 //counts number of chars in a string

	if (i % 2 == 0) { //checks for a string that has even number of chars

		for (k = 0; k <= i / 2; k++) {
			if (str[k] == str[i - k - 1]) {
				bool = 1;
			} else {
				bool = 0;
			}
		}
	} else {
		for (k = 1; k <= i / 2; k++) { //checks for a string that has odd number of chars
			if (str[k - 1] == str[i - k]) {
				bool = 1;
			} else {
				bool = 0;
			}
		}
	}
	return bool;
}
/*This function check if the string passed in is a palindrome, from the sample text file below, an example parameter is isPalendrome(вЂњowlwoвЂќ)
 в—‹ Returns True if it is a palindrome
 в—‹ Returns False if not
 */

char *getPalindrome(char str[]) { //works

	char *pal[15];
	if (isPalindrome(str) == 1) {
		*pal = "Is_Palindrome";
	} else if (isPalindrome(str) == 0) {
		*pal = "Not_Palindrome";
	}
	return *pal;
}

/*
 * This function calls isPalindrome(txt) to check if the string is palindrome
 в—‹ It returns "Is_Palindrome", when the string is a palindrome
 в—‹ Returns "Not_Palindrome", when the string is not a palindrome
 */

int howManySubstrings(char subStr[], char str[]) { //works
	int strcount = strlen(str);
	int howMany = 0;
	int k;

	for (k = 0; k <= strcount - 3; k++) {
		if (str[k] == subStr[0] && str[k + 1] == subStr[1]
				&& str[k + 2] == subStr[2]) {
			howMany++;
			k = k + 2; //non-overlapping occurence condition
		}
	}

	return howMany;
}
/*
 This function check if how many non-overlapping occurrences of the three-letter substring
 occur in the string passed in, from the sample text file below, an example parameter is howManySubstrings(вЂњstaвЂќ,вЂњAstana AstanaвЂќ)
 в—‹ Returns the number of occurrences
 */
void freeLinkedlist(Node *head) {
	if (head != NULL) {
		freeLinkedlist(head->next);
		free(head);
	}
	//Free each node consecutively, after taking the head of the linked list
}

void printLinkedlist(Node *head) {
	if (head != NULL) {
		printf("%s ", head->strData);
		printLinkedlist(head->next);
	}
	//Print each node consecutively, after taking the head of the linked list
}
void appendNode(Node **oLinkedList, char outputLine[]) {

	Node *newNode = malloc(sizeof(Node));
int i;
	for(i = 0; i < 50; i++){
	        newNode->strData[i] = '\0';
	    }

	strcpy(newNode->strData, outputLine);
	(*oLinkedList)->next = newNode;
	newNode->next = NULL;
	(*oLinkedList) = newNode;

	/*
	 Create a node
	 o Save the output string line to the node
	 o Append the node to the output linked list
	 */
}

void checkSubstringPalindrome2(char ssData[], char *iStringData[],
		Node **oLinkedList, int nrIOfileLines) {

	int j;
	*oLinkedList = NULL;
	Node **one = malloc(nrIOfileLines * sizeof(Node));
	 Node *previous = NULL;
	int count, i = 0;
	char ch[2];

	while (i < nrIOfileLines) {
		count = howManySubstrings(ssData, *iStringData);

		if (count >= 10) {
			ch[0] = (count / 10) + '0';
			ch[1] = (count % 10) + '0';
		} else {
			ch[0] = count + '0';
			ch[1] = '\0';
		}

		char oString[50];
				for (j = 0; j < 50; j++) {
					oString[j] = '\0';
				}

		char tab[] = "\t";
		char nline[] = "\n";
		strcpy(oString, iStringData[i]);
		strcat(oString, tab);
		strcat(oString, ch);
		strcat(oString, tab);
		strcat(oString, getPalindrome(*iStringData));
		strcat(oString, nline);
		appendNode(oLinkedList, oString);
		i++;
		if(*oLinkedList == NULL){
		            *oLinkedList = *one;
		        }
		        else
		        {
		            previous->next = *one;
		        }
		        previous = *one;

	}
}
/* For each string line,
 в—‹ This function calls howManySubstrings() to check if there are how many substrings in each line
 в—‹ This function calls getPalindrome()
 в—‹ Write each output line to the oLinkedList linked list using the output format by calling appendNode()
 for each line
 (i.e., Original_data_without_leading_or_trailing_whitespace + вЂњ\tвЂќ + str(count) + вЂњ\tвЂќ + is_or_not_Palindrome + вЂњ\nвЂќ )*/

void readFile2(char filename[], char *ArrayPtr[]) {

	FILE *file;
	file = fopen(filename, "r");

	if (file == NULL) {
		printf("Problem opening file.");

	} else {
		int count = countFileLines(filename);
		int j = 0;

		while (j != count) {
			fgets(ArrayPtr[j], 50, file);
			j++;
		}

	}
	fclose(file);

}

/*
 Takes in the filename and the array of pointers
 в—‹ Opens the file
 Reads and saves the file data to the array of pointers
 в—‹ Closes File
 */

int main() {

	printf("kokokookokokokokok");

	Node **outlist = malloc(sizeof(Node));

	int countstr = countFileLines("iStrings.txt");
	int countsub = countFileLines("subStrings.txt");
	int j;

	char *arrstr[countstr];

	int i;
	for (i = 0; i < countstr; i++) {
	arrstr[i] = malloc(50 * sizeof(char));
	}

	for(i = 0; i < countstr; i++) {
		for ( j = 0; j < 50; j++) {
			arrstr[i][j] = '\0';
		}
	}
	readFile2("iStrings.txt", arrstr);

	for (i = 0; i<countstr; i++) {
		arrstr[i][strlen(arrstr[i]) - 1] = '\0';
		//arrstr[i][strlen(arrstr[i]) ] = '\0';
	}

	for ( j = 0; j < countstr; j++) {
				printf("%s", arrstr[j]);
			}

	char *arrsub[countsub];
	for (i = 0; i < countsub; i++) {
		arrsub[i] = malloc(50 * sizeof(char));
		}

	for(i = 0; i < countsub; i++) {
			for (j = 0; j < 50; j++) {
				arrstr[i][j] = '\0';
			}
		}

	readFile2("subStrings.txt", arrsub);

	for (i = 0; i<countsub; i++) {
			arrsub[i][strlen(arrsub[i]) - 1] = '\0';
			//arrstr[i][strlen(arrstr[i]) ] = '\0';
		}


	for (i = 0; i < countsub; i++){
		//printf("kok");
	checkSubstringPalindrome2(arrsub[i], arrstr, outlist, countstr);
	writeFile2("oStrings.txt", arrsub[i], outlist);
	}

	printLinkedlist(*outlist);
	freeLinkedlist(*outlist);

	return 0;
}

