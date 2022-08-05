#include <program1.h>
/*
   Módulo que copia los valores de una matriz sobre un vector
*/
#include "tamMatriz.h"

procedimiento vectoriza(entero cF, entero cC, real v[], real m[MAXFILAS][MAXCOLUMNAS]) {
entero f,c
      ,iVec = 0;                                            // Empezamos por la posición cero.
variar(f,0,cF-1,1)
    variar(c,0,cC-1,1)
        v[iVec++] = m[f][c];
        finVariar
    finVariar
}
