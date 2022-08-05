/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado:  Enunciado: leer 2 valores y:
- Si se puede, dividir el primero por el segundo.
- Dividir el mayor de los dos por el menor.
*/
principal                                                       // Unidad de programa principal
	
	real num1;
    real num2;
		 
	
	
																	// Declaraciones: A continuación se declaran las variables del programa...
limpiar;                                                        // Limpia la pantalla.
		
leerM(num1, " por favor ingresar primer numero: ");
leerM(num2, " por favor ingresar segundo numero: ");


si (num1 > num2 Y num1 NOES 0.0 ) entonces;

    
       mostrar<<(num1/num2)<< salto;

sino mostrar<<"el numero 2 es mayor que el primero..vuelva a ingresar valores.."<< salto;

finSi
	

																//Código: (a continuación de este comentario...)
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
