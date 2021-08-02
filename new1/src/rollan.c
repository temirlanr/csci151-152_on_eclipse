#include <stdio.h>
#include <string.h>

 void encrypt( FILE *fin, FILE *fout, char subarr[], char pass[] ){
	 //add ascii values of text in file to those in password
	 int i=0;
			 //char str[];
			 while(pass[i]!='\0'){
				i++;
			 }
			 int j=0,k=0;
	char ch;
	int x;
			 do {
		 ch=getc(fin);
		 x=ch;

		 int y=pass[k],sum=x+y;
		 subarr[j]=sum%255;

		 if(k==i){
			 k=-1;
		 };
		 k++;
		 j++;
	 } while (ch != EOF);
	int n;
	 for(n=0;n<j;n++){
		 putc(subarr[n], fout);
	 }
 }

 void decrypt( FILE *fin, FILE *fout, char subarr[], char pass[] );

 /*char* key(FILE *fkey) {
	 char ch[254];
	 for(int i=1;i<=254;i++){
		 ch[i]=getc(fkey);
	 }
	 return ch;
 }*/

int main() {

	FILE *fin, *fout, *fkey;

	fkey = fopen("key.254","r");
	char ch[254];
	int i;
		 for(i=0;i<254;i++){
			 ch[i]=getc(fkey);
		 }

	printf("Welcome to encryption and decryption service!");

	printf("Please enter your password");

	char pass[255],comm;

	scanf("%s", pass);

	do{

	printf("MENU: <e>ncode, <d>ecode,<q>uit");

	scanf("%c",&comm);

	char input[512];
	char output[512]; //because why not

	if(comm=='e'){
		printf("Enter a file to encrypt");
		scanf("%s", input);
		printf("Enter a filename for the encrypted file.");
		scanf("%s", output);

		fin = fopen(input,"r");
		fout = fopen(output, "w");

		encrypt(fin,fout,ch,pass);

		fclose(fin);
		fclose(fout);

	}else if(comm=='d'){
		printf("Enter a file to decrypt");
		scanf("%s",input);
		printf("Enter a filename for the decrypted file.");
		scanf("%s", output);

		fin = fopen(input,"r");
		fout = fopen(output, "w");

		fclose(fin);
		fclose(fout);

	}else if(comm=='q'){
		printf("Bye!");

	}else {
		printf("ERROR\n");
	}

	}while(comm!='q');
	return 0;
}

