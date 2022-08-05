#include <program1.h>
/**
*  Enunciado:  el mayores de los pares y el promedio de los impares de una serie de numeros no nulos.
*/
principal                                                       // Unidad de programa principal
	int numero, mayor = 0, sumaImpares = 0;
	entero acumulador = 0;
limpiar;                                                        // Limpia la pantalla.
	
leerM(numero,"Ingrese un numero: ");
mientras (numero>0)
	si (esPar(numero)) entonces
		si (numero>mayor) entonces
			mayor = numero;
		finSi
	sino
		sumaImpares += numero;
		acumulador++;
	finSi
	leerM(numero,"Ingrese otro número: ");
	finMientras

si (mayor>0) entonces
	mostrar << "El mayor de los pares es: " << mayor << salto;
finSi	

si (acumulador>0) entonces
	mostrar << "El promedio de los impares es :" << sumaImpares/acumulador << salto;
finSi
	
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


