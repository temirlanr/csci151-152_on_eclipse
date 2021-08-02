#include<stdio.h>

int main(){

	int R = 3, C = 4;
	int a[R][C];

	int i, j, val1 = 100;

	printf("Matrix a\n");

	for (i = 0; i < R; i++) {
		for (j = 0; j < C; j++) {
			a[i][j] = val1;
			val1++;
		}
	}

	for (i = 0; i < R; i++) {
		for (j = 0; j < C; j++) {
			printf("%5d", a[i][j]);
		}
		printf("\n");
	}

	int val2=125;

	printf("Matrix b\n");

	for(j=0;j<R;j++){
		for(i=0;i<C;i++){
			a[i][j]=val2;
			val2++;
		}
	}

	for(i=0;i<C;i++){
		for(j=0;j<R;j++){
			printf("%5d",a[i][j]);
		}
		printf("\n");
	}

	return 0;
}
