#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

typedef struct {
	_Bool hasMine;
	int count;
	_Bool view;
} minesweeper;

void addProximities(minesweeper ex[12][30]) {

	int r, c;
	for (r = 0; r < 12; r++) {
		for (c = 0; c < 30; c++) {

			int count = 0;
			if (ex[r - 1][c - 1].hasMine == 1 && r != 0 && c != 0) {
				count++;
			}
			if (ex[r - 1][c].hasMine == 1 && r != 0) {
				count++;
			}
			if (ex[r - 1][c + 1].hasMine == 1 && r != 0 && c != 29) {
				count++;
			}
			if (ex[r][c - 1].hasMine == 1 && c != 0) {
				count++;
			}
			if (ex[r][c + 1].hasMine == 1 && c != 29) {
				count++;
			}
			if (ex[r + 1][c - 1].hasMine == 1 && r != 11 && c != 0) {
				count++;
			}
			if (ex[r + 1][c].hasMine == 1 && r != 11) {
				count++;
			}
			if (ex[r + 1][c + 1].hasMine == 1 && r != 11 && c != 29) {
				count++;
			}

			ex[r][c].count = count;

		}
	}
}
int main() {

	setvbuf(stdout, NULL, _IONBF, 0);

	minesweeper grid[12][30];

	int i;
	int row, column;

	for (row = 0; row < 12; row++) {
		for (column = 0; column < 30; column++) {
			grid[row][column].hasMine = 0;
		}
	}

	for (i = 0; i < 10; i++) {
		do {
			row = rand() % 12;
			column = rand() % 30;
		} while (grid[row][column].hasMine);

		grid[row][column].hasMine = 1;
	}

	addProximities(grid);

	for (row = 0; row < 12; row++) {
						for (column = 0; column < 30; column++) {
							grid[row][column].view = 0;
						}
					}

	int guess = 350;

	do {

		int k, j, n=0;
		printf("--------------------------------\n");
		for (k = 0; k < 12; k++) {
			printf("|");
			for (j = 0; j < 30; j++) {
				if (grid[k][j].view == 1) {
					if (grid[k][j].hasMine == 1) {
						printf("*");
					} else if (grid[k][j].hasMine == 0) {
						if (grid[k][j].count == 0) {
							printf(".");
						} else
							printf("%i", grid[k][j].count);
					}
				} else if(grid[k][j].view==0) printf("?");
			}
			printf("%i",n);
			n++;
			printf("\n");
		}
		printf("-012345678911111111112222222222-\n");
		printf("           01234567890123456789 \n");

		int a,b;
		printf("Enter coordinates in the area 12X30:\n");
		scanf("%i %i", &a, &b);

		if (a < 12 && a >= 0 && b < 30 && b >= 0) {

			if (grid[a][b].hasMine == 0) {
				guess--;
				grid[a][b].view = 1;

			} else if (grid[a][b].hasMine == 1) {
				printf("BOOOOOOM!!!\n");
				printf("________________________________\n");
				for (k = 0; k < 12; k++) {
					printf("|");
					for (j = 0; j < 30; j++) {
						if (grid[k][j].hasMine == 1) {
							printf("*");
						} else if (grid[k][j].hasMine == 0) {
							if (grid[k][j].count == 0) {
								printf(".");
							} else
								printf("%i", grid[k][j].count);
						}

					}
					printf("|");
					printf("\n");
				}
				printf("--------------------------------\n");

				guess = -1;
			}
		}else printf("error");

		if(guess==0) printf("YOU WON!");
	} while (guess > 0);

	return 0;
}
