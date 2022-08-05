#include <program1.h>
funcion real promedio(entero t,real v[]) {
real resul = 0.0;
entero ind;
variar(ind,0,t-1,1)
    resul += v[ind];
    finVariar
resul /= t;
regresa(resul);
}

