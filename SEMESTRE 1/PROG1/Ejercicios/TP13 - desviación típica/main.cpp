#include <program1.h>
#include "media.h"
#include "desviacionTipica.h"
/**
*  Enunciado: Dada una secuencia de hasta 100 valores, calcular su desviación típica. 
*/
principal                                                       					// Unidad de programa principal
	real media, desvTipica;
limpiar;                                                       		 				// Limpia la pantalla.
	media = media();
	desvTipica = desviacionTipica(media);

	mostrar << "La desviacion tipica de los valores es: " << desvTipica << salto;
pausa;                                                          					// Pausa antes de finalizar. 
finPrincipal                                                    					// Fin de unidad de programa principal

