/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada una matriz de hasta 15 filas por 10 columnas, ordenarla en serpentina, empezando por la primer columna desde la primer fila.
*/
#include "../leerVar.h"
#include "../leeyMuesMat.h"
#include "../tamMatriz.h"
#include "../vectoriza.h"
#include "../leemuestvec.h"
#include "../ordena.h"
#include "../intercambiar.h"

procedimiento ordenaSerpentina(entero,entero,real[MAXFILAS][MAXCOLUMNAS]);
procedimiento poneEnSerpentina(entero,entero,real[],real[MAXFILAS][MAXCOLUMNAS]);

principal                                                                            // Unidad de programa principal
real mat[MAXFILAS][MAXCOLUMNAS];                                                     // Matriz (dato a leer);
entero cantFilas,cantColumnas;                                                       // Cantidad de filas y columnas a usar
limpiar;                                                                             // Limpia la pantalla.
leerVar(cantFilas,2,MAXFILAS,"Cantidad de filas");                                   // 2 <= Cantidad de filas <= MAXFILAS
leerVar(cantColumnas,2,MAXCOLUMNAS,"Cantidad de columnas");                          // 2 <= Cantidad de columnas <= MAXCOLUMNAS
leeMat(cantFilas,cantColumnas,mat);                                                  // Se lee la matriz
muestMat(cantFilas,cantColumnas,mat);                                                // y se muestra.
ordenaSerpentina(cantFilas,cantColumnas,mat);
muestMat(cantFilas,cantColumnas,mat);                                                // y se muestra.
pausa;                                                                               // Pausa antes de finalizar. 
finPrincipal                                                                         // Fin de unidad de programa principal

procedimiento ordenaSerpentina(entero cF, entero cC, real m[MAXFILAS][MAXCOLUMNAS]) {
real vec[MAXFILAS*MAXCOLUMNAS];
vectoriza(cF,cC,vec,m);
//muestraVec(cF*cC,vec);
ordena(cF*cC,vec);
//muestraVec(cF*cC,vec);
poneEnSerpentina(cF,cC,vec,m);
}

procedimiento poneEnSerpentina(entero cF, entero cC, real v[], real m[MAXFILAS][MAXCOLUMNAS]) {
entero posVec = 0                                                                    // PosiciÃ³n a tomar del vector
      ,f,c
      ,fI = 0
      ,fF = cF-1
      ,inc = 1;                                                                          // Fila y columna de la matriz
variar(c,0,cC-1,1)
    variar(f,fI,fF,inc)
        m[f][c] = v[posVec++];
        finVariar
    intercambiar(fI,fF);
    inc = (-inc);
    finVariar
}
