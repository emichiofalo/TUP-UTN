#include <program1.h>
/**
*    Procedimiento de ordenamiento de vectores mediante el método de mezcla (versión UTN-FRM)
*/
#include "tam.h"
#include "intercambiar.h"

plantilla(Tipo)
procedimiento juntar(entero t, Tipo v[], entero izq, entero med, entero der) {
Tipo aux[TAM];
entero i1 = izq                                                                 // Posición inicial del subvector izquierdo
      ,i2 = med + 1                                                             // Posicion inicial del subvector derecho
      ,ind;
variar(ind,0,der-izq+1,1)
    si( i2 > der O i1 <= med Y v[i1] <= v[i2] ) entonces                        // Si debe tomar del lado izquierdo
        aux[ind] = v[i1++];
        sino
        aux[ind] = v[i2++];
        finSi
    finVariar
variar(ind,0,der-izq,1)
    v[izq+ind] = aux[ind];
    finVariar
}

implementa procedimiento juntar(entero,real[],entero,entero,entero);

plantilla(Tipo) 
procedimiento ordenaID(entero t, Tipo v[], entero izq, entero der) {
entero med;
si(izq + 1 < der) entonces
    med = (izq + der) / 2;
    ordenaID(t,v,izq,med);                                                      // Ordena la parte izquierda
    ordenaID(t,v,med+1,der);
    juntar(t,v,izq,med,der);
    sinoSi(izq+1 ES der Y v[der] < v[izq]) entonces                             // Es un subvctor de 2 elementos desordenados
    intercambiar(v[izq],v[der]);                                                // y el intercambio lo ordena.
    finSi
}

implementa procedimiento ordenaID(entero,real[],entero,entero);

plantilla(Tipo)
procedimiento ordena(entero t, Tipo v[]) {
ordenaID(t,v,0,t-1);
}

implementa procedimiento ordena(entero,real[]);
