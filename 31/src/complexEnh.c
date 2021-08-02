#include<math.h>
#include"complexEnh.h"
#include"complex.h"

double mag(complex x){
	return sqrt(x.re*x.re + x.im*x.im);
}

complex norm(complex x){

	complex result;
	double norm = mag(x);
	result.re = x.re/norm;
	result.im = x.im/norm;
	return result;
}
