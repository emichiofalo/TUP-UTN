/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada una serie de valores no nulos, calcular:

El mayor de los pares
El promedio de los impares
Demostrar que el algoritmo funcionará correctamente
*/
principal                                                       // Unidad de programa principal
// Declaraciones: A continuación se declaran las variables del programa...
	entero valor1;
    entero valor2;
	entero valor3;
	
	
	
limpiar;                                                        // Limpia la pantalla.
//Código: (a continuación de este comentario...)
leerM(valor1, "por favor ingrese el primer valor: ");
leerM(valor2, "por favor ingrese el segundo valor: ");
leerM(valor3, "por favor ingrese el tercer valor: ");

si (valor1 NOES 0 Y valor2 NOES 0 Y valor3 NOES 0 )entonces;
	si (valor1*2/2 ES valor1 Y valor1>valor2 Y valor1>valor3 )entonces;
		mostrar<<"el mayor de los pares es : "<< valor1<< salto;
    sinoSi (valor2*2/2 ES valor2 Y valor2>valor1 Y valor2>valor3 )entonces;
		mostrar<<"el mayor de los pares es : "<<valor2<< salto ;
	sinoSi (valor3 *2/2 ES valor3 Y valor3 > valor1 Y valor3 > valor2 )entonces;
		mostrar<<"el mayor de los pares es : "<<valor3<< salto;
	finSi
sino 
	mostrar<<"el valor ingresado debe ser mayor que cero"<<salto;
finSi
	


pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
