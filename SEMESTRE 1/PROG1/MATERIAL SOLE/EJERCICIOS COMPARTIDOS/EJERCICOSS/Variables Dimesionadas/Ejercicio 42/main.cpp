/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada una matriz de hasta 10 filas por 15 columnas, mostrar el promedio de sus columnas.
*/

#include "../leerVar.h"
#include "../leeyMuesMat.h"
#include "../calcVect.h"
#include "../calcMat.h"

principal                                                                            // Unidad de programa principal
real mat[TAMFILA][TAMCOLU];                                                          // DAtos (a leer)
entero cantF                                                                         // Cantidad de filas (a leer)
      ,cantC;                                                                        // Cantidad de columnas (a leer)
limpiar;                                                                             // Limpia la pantalla.
leerVar(cantF,2,TAMFILA,"Cantidad de filas");                                        // Lee la cantidad de filas
leerVar(cantC,2,TAMCOLU,"Cantidad de columnas");                                     // Lee la cantidad de columnas
leeMat(cantF,cantC,mat);                                                             // Lee la matriz 
muestMat(cantF,cantC,mat);                                                           // Muestra la matriz
muestProMatC(cantF,cantC,mat);                                                       // Muestra los promedios por columna.
muestProMatF(cantF,cantC,mat);                                                       // Muestra los promedios por columna.
pausa;                                                                               // Pausa antes de finalizar. 
finPrincipal                                                                         // Fin de unidad de programa principal
