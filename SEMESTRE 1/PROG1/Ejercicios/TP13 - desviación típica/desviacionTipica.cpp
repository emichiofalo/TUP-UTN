#include <program1.h>
#include "desviacionTipica.h"
funcion real desviacionTipica (real media){
	archivo datos;
	real desvTipica=0, x, aux=0;
	entero contador = 0;
	abrir (datos,"datos1.txt", ALEER);
	iterar
		datos >> x;
	salirSi(datos.eof());
	aux+=cuadrado(x-media);
	contador ++;
	finIterar
		
		desvTipica = raiz2(aux/contador);
	mostrar << contador << salto;
	
	regresa (desvTipica);
}
