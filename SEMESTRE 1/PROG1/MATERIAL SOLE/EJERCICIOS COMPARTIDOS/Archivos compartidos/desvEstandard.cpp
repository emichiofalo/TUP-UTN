#include <program1.h>
#include "DesvEstandard.h"

funcion real desvEstandard(entero t, real v[],real prom) {
	real resu
		,suma = 0.0;
	entero i;
	variar(i,0,t-1,1)
		suma += XalaY((v[i]-prom),2.);
	finVariar
		resu = XalaY((suma/t),0.5);
	retorna (resu);
}
