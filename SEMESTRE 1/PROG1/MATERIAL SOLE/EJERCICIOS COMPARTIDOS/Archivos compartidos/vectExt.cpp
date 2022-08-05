#include <program1.h>

funcion real mayorVec(entero t,real v[]) {
real resul = v[0];
entero i;
variar(i,1,t-1,1)
    si(v[i] > resul) entonces
        resul = v[i];
        finSi
    finVariar
regresa(resul);
}

funcion real menorVec(entero t,real v[]) {
real resul = v[0];
entero i;
variar(i,1,t-1,1)
    si(v[i] < resul) entonces
        resul = v[i];
        finSi
    finVariar
regresa(resul);
}

funcion entero posMayorVec(entero t,entero v[]) {
entero resul = 0;
entero i;
variar(i,1,t-1,1)
    si(v[i] > resul) entonces
        resul = i;
        finSi
    finVariar
regresa(resul);
}

funcion entero posMenorVec(entero t,entero v[]) {
entero resul = 0;
entero i;
variar(i,1,t-1,1)
    si(v[i] < resul) entonces
        resul = i;
        finSi
    finVariar
regresa(resul);
}
