#include <program1.h>
/**
*  Enunciado: 
*/
principal                                                       // Unidad de programa principal
	caracter letra, letraAnterior = 'a';
	entero cantVocales = 0, cantVocalesPrec = 0;
limpiar;                                                        // Limpia la pantalla.

mostrar << "Ingrese un texto terminado en punto." << salto;

iterar
	leeTecla(letra);
	salirSi (letra=='.');
	si(esVocal(letra))entonces
		cantVocales++;
	finSi
	si(esVocal(letra) Y esConso(letraAnterior))entonces
		cantVocalesPrec++;
	finSi
	letraAnterior = letra;
	finIterar

mostrar << salto; 
mostrar << "Hay " << cantVocales << " vocales en el texto ingresado." << salto;
mostrar << "Hay " << cantVocalesPrec << " vocales precedidas por consonante." << salto;

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

