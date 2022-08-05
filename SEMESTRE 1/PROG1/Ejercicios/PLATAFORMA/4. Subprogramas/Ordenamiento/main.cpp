#include <program1.h>
#include "leeVecD.h"
#include "muestraV.h"
/**
*    Enunciado: Dado un conjunto de hasta 100 valores, mostrarlo ordenado.
*/
plantilla(Tipo)
procedimiento ordena(vectorDin(Tipo) porRef);

plantilla(Tipo)
procedimiento ordenaMezcla(largo,largo,vectorDin(Tipo) porRef);

constante largo T = 5000000;

principal                                                       // Unidad de programa principal
vectorDin(real) datos(T);
limpiar;                                                        // Limpia la pantalla.
//leeVecD(datos);
generaVecAlAzar(datos);
ordena(datos);
muestraV(datos);
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

plantilla(Tipo)
procedimiento ordena(vectorDin(Tipo) porRef v) {
ordenaMezcla(0,tamanio(v)-1,v);
}
//implementa procedimiento ordena()
plantilla(Tipo)
procedimiento juntaVec(largo izq,largo med,largo der,vectorDin(Tipo) porRef v) {
vectorDin(Tipo) vAux(der-izq+1);
largo i1 = izq
     ,i2 = med + 1;
paraCada(ele,vAux)
    si((i1 <= med) Y ((i2 > der) O (v[i1] <= v[i2]))) entonces
        ele = v[i1++];
        sino
        ele = v[i2++];
        finSi
    finPara
i1 = izq;
paraCadaValor(ele,vAux)
    v[i1++] = ele;
    finPara
}

plantilla(Tipo)
procedimiento ordenaMezcla(largo izq, largo der,vectorDin(Tipo) porRef v) {
si(izq+2 <= der) entonces
    largo med = (izq + der) / 2;
    ordenaMezcla(izq,med,v);
    ordenaMezcla(med+1,der,v);
    juntaVec(izq,med,der,v);
    sinoSi(izq+1 ES der Y v[izq] > v[der]) entonces
    swap(v[izq],v[der]);
    finSi
}