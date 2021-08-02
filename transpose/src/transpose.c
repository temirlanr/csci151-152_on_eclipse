#include<stdio.h>
#include<stdlib.h>

void transpose(int row, int col, double orig[row][col], double result[col][row]){
	int i,j;
	for(i=0;i<row;i++){
		for(j=0;j<col;j++){
			result[j][i]=orig[i][j];
			printf("%lf ",orig[i][j]);
		}
		printf("\n");
	}
	printf("\n");

	for(i=0;i<col;i++){
		for(j=0;j<row;j++){
			printf("%lf ",result[i][j]);
		}
		printf("\n");
	}
}

int main(){
	double x[3][4];
	int a,b;
	for(a=0;a<3;a++){
		for(b=0;b<4;b++){
			x[a][b]=rand()%12;
		}
	}
	double y[4][3];
	transpose(3,4,x,y);
	return 0;
}

