/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un conjunto de hasta 100 valores, ordenarlos.
*/
#include "../leerVar.h"
#include "../leemuestvec.h"
#include "../intercambiar.h"

procedimiento ordena(entero,real[]);
funcion entero posMenor(entero,real[],entero);

constante entero TAM = 100000;

principal                                                       // Unidad de programa principal
real conj[TAM];
entero cant;
limpiar;                                                        // Limpia la pantalla.
leerVar(cant,2,TAM,"Cantidad de valores");
leerVec(cant,conj);
muestraVec(cant,conj);
ordena(cant,conj);
muestraVec(cant,conj);
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

procedimiento ordena(entero t, real v[]) {
entero pos;
variar(pos,0,(t-1),1)
    intercambiar(v[pos],v[posMenor(t,v,pos)]);
    finVariar
}

funcion entero posMenor(entero t,real v[],entero posIni) {
entero resul = posIni
      ,ind;
variar(ind,posIni+1,t-1,1)
    si(v[ind] < v[resul]) entonces
        resul = ind;
        finSi
    finVariar
regresa(resul);
}