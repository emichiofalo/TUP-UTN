#include <program1.h>
/**
*  Enunciado a resolver: Dada una secuencia de valores a leer del siguiente archivo de datos (datos.txt), calcular el promedio.
*  Guarde el archivo datos.txt y ejecute con "programa < datos.txt" y complete la pregunta.
*  Adjunte un archivo comprimido con el código fuente. 
*/

principal
	
	archivo datos;																	
	real mayor = 0;

abrir(datos,"datos06.txt", ALEER);												
		
	si (estaAbierto(datos)) entonces											
		real numero;															
		mientras (!datos.eof())													
		datos >> numero;														
		si (numero > mayor) entonces										
			mayor = numero;													
		finSi
		finMientras		
	finSi
	promedio = totalSumaNumeros/cantidadNumeros;
	mostrar << promedio << salto;																
pausa;                                                      					// Pausa antes de finalizar. 
finPrincipal                                                    				// Fin de unidad de programa principal
	
	
	

