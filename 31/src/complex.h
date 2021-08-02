
#ifndef SRC_COMPLEX_H_
#define SRC_COMPLEX_H_

typedef struct{
	double re;
	double im;
} complex;

complex add(complex x, complex y);

complex sub(complex x, complex y);

void print(complex x);

#endif
