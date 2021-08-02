#include <stdio.h>

	typedef struct {
		int red, green, blue;
	} Color;

	typedef struct {
	int x, y;
	} Coords;\

	typedef struct {
	Coords point1;
	Coords point2;
	} LineSegment;

	typedef struct {
	Color color;
	Coords point[5];
	} Pentagon;

	int main () {
	Pentagon shape;
	FILE *file;
	file = fopen("store.txt", "r");

	fscanf(file,"%i %i %i %i %i %i %i %i %i %i %i %i %i", &shape.color.red, &shape.color.green, &shape.color.blue, &shape.point[0].x, &shape.point[0].y, &shape.point[1].x, &shape.point[1].y, &shape.point[2].x, &shape.point[2].y, &shape.point[3].x, &shape.point[3].y, &shape.point[4].x, &shape.point[4].y);
	printf("%i %i %i\n%i %i\n%i %i\n%i %i\n%i %i\n%i %i", shape.color.red, shape.color.green, shape.color.blue, shape.point[0].x, shape.point[0].y, shape.point[1].x, shape.point[1].y, shape.point[2].x, shape.point[2].y, shape.point[3].x, shape.point[3].y, shape.point[4].x, shape.point[4].y);
	fclose(file);
	return 0;
}


