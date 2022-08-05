#include <program1.h>
/**
*  Enunciado:  
*/
principal                                                       // Unidad de programa principal
	caracter letra, letraAnterior = '*';
	cadena palabra;
	entero cantPalabras = 0, cantPalabrasTermVocal = 0;
limpiar;                                                        // Limpia la pantalla.

mostrar << "Ingrese un texto terminado en punto." << salto;

iterar
	leeTecla(letra);  
	si(esFinPal(letraAnterior,letra)) entonces                          
	    cantPalabras++;
		si(esVocal(letraAnterior)) entonces
			cantPalabrasTermVocal++;
		finSi
	finSi
	salirSi(letra == '.');
    letraAnterior = letra;                                      
	finIterar;

mostrar << salto; 
mostrar << "Hay " << cantPalabras << " palabras en el texto ingresado." << salto;
mostrar << "Hay " << cantPalabrasTermVocal << " palabras terminadas en vocal." << salto;

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
	
