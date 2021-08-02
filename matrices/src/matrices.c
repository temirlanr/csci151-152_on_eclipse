#include<stdio.h>
#include<stdlib.h>
int main(){
	int a[3][3],b[3][3],i,j;
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			a[i][j]=(rand()%10)+1;
			b[i][j]=(rand()%10)+1;
		}
	}
	printf("The matrix A:\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			a[i][j]=(rand()%10)+1;
			b[i][j]=(rand()%10)+1;
			printf("%i ",a[i][j]);
		}
		printf("\n");
	}
	printf("The matrix B:\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("%i ",b[i][j]);
		}
		printf("\n");
	}
	printf("The A*B:\n");
	int k,ans[3][3];
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			int val=0;
			for(k=0;k<3;k++){
				val+=a[i][k]*b[k][j];
			}
			ans[i][j]=val;
			printf("%3i ",ans[i][j]);
		}
		printf("\n");
	}
	return 0;
}
