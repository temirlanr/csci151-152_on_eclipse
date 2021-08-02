
#include <stdio.h>
#include<math.h>

int main() {

	int i=1, a1=0, a2=1, a3;
	printf("%i \n",a1);
	printf("%i \n",a1+a2);
	while(i<=18){
		a3=a1+a2;
		a1=a2;
		a2=a3;
		printf("%i \n",a2);
		i++;
	}

    return 0;
}


