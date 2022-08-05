// Archivo de traducción de seudocódigo a C++
#include "program1.h"
#include <program1.h>
/**
*    Enunciado: dado un texto determinado en "." contar las letras "a"
*/
principal                                                       // Unidad de programa principal
// Declaraciones: A continuación se declaran las variables del programa...
	caracter tecla;
entero cantA=0;

limpiar;                                                        // Limpia la pantalla.
//Código: (a continuación de este comentario...)
mostrar<<"ingrese texto terminado en '.': "<<salto;
iterar
	leeTecla(tecla);
     salirSi(tecla ES '.');
	 si (tecla ES 'a' O tecla ES (-61))entonces
		 cantA++;
     finSi
finIterar;
	 mostrar<<salto<<"la cantidad de 'a 'para \"" <<"\"es:"<< cantA << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
