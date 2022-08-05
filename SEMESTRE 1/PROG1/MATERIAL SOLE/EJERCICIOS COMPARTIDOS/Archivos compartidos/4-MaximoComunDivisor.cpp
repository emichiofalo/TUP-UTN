/*
program1.h es el archivo de traducción de seudocódigo a C++
Copiarlo (en Linux): /usr/local/include
o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dados dos numeros calcular el maximo comun divisor.Algoritmo de Euclides
*/
principal                                                       // Unidad de programa principal
	// Declaraciones: A continuación se declaran las variables del programa...
entero Divisor,
	Dividendo,
	Cociente = 0,
	AuxiliarCociente,
	resto;
	limpiar;                                                        // Limpia la pantalla.
//Código: (a continuación de este comentario...)
leerM(Dividendo,"Ingrese el dividendo ");	
leerM(Divisor,"Ingrese el divisor ");
si (Divisor < Dividendo) entonces;
	Cociente = Dividendo/Divisor;
	resto = Dividendo - (Cociente * Divisor);
	sino mostrar << "el divisor debe ser menor que el dividendo "<< salto;
	finSi;
si (resto ES 0 Y Dividendo > Divisor) entonces;
	mostrar << "El maximo comun Divisor es :" << Divisor << salto;
	sinoSi (resto < Divisor Y resto > 0 Y Dividendo >Divisor) entonces;
	AuxiliarCociente = Divisor / resto;
	mostrar << "El maximo comun Divisor es :" << Divisor / AuxiliarCociente << salto;
	finSi;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
