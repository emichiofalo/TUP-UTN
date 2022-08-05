/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un conjunto de hasta 100000 valores reales, ordenarlo.
*/

#include "../leerVar.h"
#include "../leemuestvec.h"
#include "../ordena.h"
#include "../tam.h"

principal                                                                            // Unidad de programa principal
real conj[TAM];
entero cant;
limpiar;                                                                             // Limpia la pantalla.
leerVar(cant,2,TAM,"Cantidad de valores");                                           // Leo el tamaÃ±o real de los datos a ordenar
leerVec(cant,conj);                                                                  // Se leen (o generan) los valores
//muestraVec(cant,conj);
ordena(cant,conj);
muestraVec(cant,conj);
pausa;                                                                               // Pausa antes de finalizar. 
finPrincipal                                                                         // Fin de unidad de programa principal
