#include <program1.h>
/**
*  Enunciado: texto terminado en punto, calcular la cant de letras 's' 
			  y la cant de vocales precedidas por consonante. 
*/
principal                                                       // Unidad de programa principal
	caracter letra, letraAnterior = 'a';
	entero cantS = 0, cantVocales = 0;
limpiar;                                                        // Limpia la pantalla.

mostrar << "Ingrese un texto terminado en punto." << salto;

iterar
	leeTecla(letra);
	salirSi (letra=='.');
	si(letra == 's')entonces
		cantS++;
	finSi
	si(esVocal(letra) Y esConso(letraAnterior))entonces
		cantVocales++;
	finSi
	letraAnterior = letra;
	finIterar

mostrar << salto; 
mostrar << "Hay " << cantS << " letras 's' en el texto ingresado." << salto;
mostrar << "Hay " << cantVocales << " vocales precedidas por consonante." << salto;

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

