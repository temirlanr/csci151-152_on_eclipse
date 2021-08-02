#include"complexSuperEnh.h"
#include"complex.h"
#include"complexEnh.h"

complex conjugate(complex x){

	x.im=-x.im;
	return x;
}

complex multiply(complex x, complex y){

	complex result;
	result.re = x.re*y.re-x.im*y.im;
	result.im = x.im*y.re+x.re*y.im;
	return result;
}

complex divide(complex x, complex y){

	complex result;
	result.re = (x.re*y.re+x.im*y.im)/(y.re*y.re+y.im*y.im);
	result.im = (x.im*y.re-x.re*y.im)/(y.re*y.re+y.im*y.im);
	return result;
}
