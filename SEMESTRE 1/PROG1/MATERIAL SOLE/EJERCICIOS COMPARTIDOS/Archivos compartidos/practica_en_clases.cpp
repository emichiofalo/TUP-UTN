/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado:  dado un numero entero , mostrar :
                                                  si tiene un digito
												 si tiene dos digitos
												si tiene tres digitos 
												si tiene cuatro o mas..
*/
principal                                                       // Unidad de programa principal
	entero num1;
	// Declaraciones: A continuación se declaran las variables del programa...
limpiar;                                                        // Limpia la pantalla.
	leerM(num1, "por favor ingrese numero:");
si  (num1 < 10 )entonces ;
   mostrar<<" el numero es de un digito..."<< salto;
   sinoSi (num1 >= 10 Y num1 < 100)entonces;
   mostrar<<"el numero ingresado es de dos digitos... "<<salto;
   sinoSi (num1 >=100 Y num1 < 1000)entonces;
   mostrar<<"el numero ingresado es de tres digitos..."<<salto;
   sinoSi ( num1 >=1000 Y num1 > 10000)entonces;
   mostrar<<"el numero ingresado es de cuatro o mas digitos..."<<salto;
 finSi  
   


																//Código: (a continuación de este comentario...)
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
