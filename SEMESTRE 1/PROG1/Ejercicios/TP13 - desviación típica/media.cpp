#include <program1.h>
#include "media.h"
funcion real media(){
	archivo datos;
	real suma=0, x, media=0;
	entero contador = 0;
	abrir (datos,"datos1.txt", ALEER);
	iterar
		datos >> x;
	salirSi(datos.eof());
	suma += x;
	contador ++;
	finIterar
		
		media = suma/contador;
	mostrar << contador << salto;
	
	regresa (media);
}
