#include <program1.h>
#include "tamMatriz.h"
#include "calcVect.h"
procedimiento muestProMatC(entero cFi,entero cCo,real m[TAMFILA][TAMCOLU]) {
real v[TAMFILA];
entero f,c;
variar(c,0,cCo-1,1)
    variar(f,0,cFi-1,1)
        v[f] = m [f][c];
        finVariar
    mostrar << "El promedio de la columna "<< c+1 << " es " << promedio(cFi,v) << salto;
    finVariar
}

procedimiento muestProMatF(entero cFi,entero cCo,real m[TAMFILA][TAMCOLU]) {
real v[TAMFILA];
entero f,c;
variar(f,0,cFi-1,1)
    variar(c,0,cCo-1,1)
        v[c] = m [f][c];
        finVariar
    mostrar << "El promedio de la fila "<< f+1 << " es " << promedio(cFi,v) << salto;
    finVariar
}