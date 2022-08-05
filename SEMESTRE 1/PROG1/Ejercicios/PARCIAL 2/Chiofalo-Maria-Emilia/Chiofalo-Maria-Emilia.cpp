#include <program1.h>
/**
*   Enunciado: Dada una secuencia de valores a leer del archivo, calcular la 
	menor suma entre 2 valores consecutivos.
*/
principal
	archivo datos;
	real anterior = 0.0, actual, suma, menorSuma;
	logico hay2 = FALSO;
limpiar;

abrir(datos,"datos07.txt", ALEER);

iterar
	datos >> actual;
	salirSi(datos.eof());
	si(anterior != 0.0) entonces
		si(hay2) entonces
			suma = anterior + actual;
		si(suma < menorSuma) entonces
			menorSuma = suma;
		finSi
	sino
		hay2 = VERDADERO;
		menorSuma = anterior + actual;
	finSi
	finSi
	anterior = actual;
	finIterar
	
si(hay2) entonces
	mostrar << "La menor suma entre 2 valores consecutivos es: " << menorSuma << salto;
finSi
	
pausa;
finPrincipal
	
