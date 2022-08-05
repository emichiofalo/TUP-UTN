#include <program1.h>

principal
	entero num,aux=0,max=0;
	entero resul;
	mostrar<<"Ingrese la cantidad de numeros enteros q desee utilizar, para terminar ingrese 0"<<salto;
	iterar
		salirSi(num==0);
		leer(num);
		si(num%2==0)entonces
			si(num>=max)entonces
				max=num;
			finSi
		sino
			aux=aux+1;
			resul=resul+num;
		finSi
	finIterar;
	resul=resul/aux;
	mostrar<<"El maximo es "<<max<<salto<<"El promedio es "<<resul<<salto;
finPrincipal
