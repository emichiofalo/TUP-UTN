/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada una matriz de hasta 20 filas por 25 columnas, ordenarla en espiral.
*/
#include "../leerVar.h"
#include "../leeyMuesMat.h"
#include "../tamMatriz.h"
#include "../vectoriza.h"
#include "../ordena.h"

procedimiento ordenaEnEspiral(entero,entero,real[CANTFILAS][CANTCOLUS]);

principal                                                                       // Unidad de programa principal
real mat[CANTFILAS][CANTCOLUS];                                                 // Datos (a leer)
entero cantF, cantC;                                                            // TamaÃ±o (a leer) a usar de la matriz
limpiar;                                                                        // Limpia la pantalla.
leerVar(cantF,2,CANTFILAS,"Filas");
leerVar(cantC,2,CANTCOLUS,"Columnas");
leeMat(cantF,cantC,mat);
muestMat(cantF,cantC,mat);
ordenaEnEspiral(cantF,cantC,mat);
muestMat(cantF,cantC,mat);
pausa;                                                                          // Pausa antes de finalizar. 
finPrincipal                                                                    // Fin de unidad de programa principal

procedimiento poneEnEspiral(entero cF, entero cC, real v[], real m[CANTFILAS][CANTCOLUS]) {
entero filaInicial = 0                                                                   // Fila inicial
      ,colInicial = 0                                                                   // Columna inicial
      ,filaFinal = cF-1                                                                // Fila final
      ,colFinal = cC-1                                                                // Columna final
      ,posV = 0                                                                 // PosiciÃ³n del vector
      ,f,c;
//mientras(posV < colFinal*cC)
mientras(filaInicial <= filaFinal Y colInicial <= colFinal)
    variar(c,colInicial,colFinal,1)  // Bucle de la fila superior
        m[filaInicial][c] = v[posV++];
        finVariar
    filaInicial++;
    variar(f,filaInicial,filaFinal,1)
        m[f][colFinal] = v[posV++];
        finVariar
    colFinal--;
    variar(c,colFinal,colInicial,(-1))
        m[filaFinal][c] = v[posV++];
        finVariar
    filaFinal--;
    variar(f,filaFinal,filaInicial,(-1))
        m[f][colInicial] = v[posV++];
        finVariar
    colInicial++;
    finMientras
}

procedimiento ordenaEnEspiral(entero cF,entero cC,real m[CANTFILAS][CANTCOLUS]) {
real vecAux[CANTFILAS*CANTCOLUS];                                               // Vector auxiliar con el mismo tamaÃ±o de la matriz
vectoriza(cF,cC,vecAux,m);                                                      // Copiamos la matriz al vector
ordena(cF*cC,vecAux);                                                           // Ordenamos el vector
poneEnEspiral(cF,cC,vecAux,m);
}