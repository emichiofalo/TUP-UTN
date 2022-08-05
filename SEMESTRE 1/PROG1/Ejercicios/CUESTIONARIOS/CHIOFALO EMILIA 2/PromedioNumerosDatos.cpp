#include <program1.h>
/**
*  Enunciado a resolver: Dada una secuencia de valores a leer del siguiente archivo de datos (datos.txt), calcular el promedio.
*  Guarde el archivo datos.txt y ejecute con "programa < datos.txt" y complete la pregunta.
*  Adjunte un archivo comprimido con el código fuente. 
*/

principal
	
	archivo datos;																	
	entero cantidadNumeros = 0;	
	real totalSumaNumeros = 0;

abrir(datos,"datos04.txt", ALEER);												
		
	si (estaAbierto(datos)) entonces											
		real numero;															
		mientras (!datos.eof())													
		datos >> numero;														
			totalSumaNumeros += numero;
			cantidadNumeros++;
		finMientras		
	finSi
	mostrar << totalSumaNumeros/(cantidadNumeros-2) << salto;																
pausa;                                                      					// Pausa antes de finalizar. 
finPrincipal                                                    				// Fin de unidad de programa principal
	
	
	

