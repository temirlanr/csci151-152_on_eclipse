#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>

double strToDouble(char str[]) {
	int i=0, pn=1;
	double result=0;

	if(str[0]=='-') pn=-1,i++;

	for (; str[i]>='0' && str[i]<='9' ; i++) {
		result = result * 10 + (str[i] - '0');
	}

	if(str[i]=='.'){
		double nm=0;
		int k=i;

		for (i=k+1; str[i]>='0' && str[i]<='9' ; i++) {
			nm = nm * 10 + (str[i] - '0');
		}

		nm/=pow(10,i-(k+1));
		result+=nm;
	}

	if(str[i]=='e'){
		int nm=0,k=i,pk=1;
		if(str[k+1]=='-') pk=-1,k++;

		for (i=k+1; str[i]>='0' && str[i]<='9' ; i++) {
			nm = nm * 10 + (str[i] - '0');
		}
		if(pk==-1) result/=pow(10,nm);
		else result*=pow(10,nm);
	}

	result*=pn;
	return result;
}

int main() {
	printf("%lf\n", strToDouble("34.32e3"));
	printf("%lf\n", strToDouble("-487.4"));
	return 0;
}
