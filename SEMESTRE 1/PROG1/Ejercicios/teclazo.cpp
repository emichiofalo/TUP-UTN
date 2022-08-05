#include <program1.h>
#include <stdio.h>
principal                                                       // Unidad de programa principal
	caracter x;
	cadena y;
limpiar;                                                        // Limpia la pantalla.


	iterar
		leeTecSinEco(x);
		si(esDigito(x))entonces
			y += x;
		finSi
		salirSi(esFinDarch(stdin));
	finIterar

	mostrar << y;

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
