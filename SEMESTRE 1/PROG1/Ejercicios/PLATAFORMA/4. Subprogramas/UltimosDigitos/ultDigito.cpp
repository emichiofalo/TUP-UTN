#include <program1.h>
#include "ultDigito.h"

funcion entero ultDigito(real x) {
entero resul = ultDigito((entero)x);
regresa(resul);
}

funcion entero ultDigito(entero x) {
//entero resul = x - x / 10 * 10;
entero resul = x % 10;
regresa(resul);
}


funcion entero potEnte10(entero exp) {
entero resul;
si(exp ES 0) entonces
    resul = 1;
    sinoSi(exp > 0) entonces
    resul = 10 * potEnte10(exp-1);
    sino
    resul = 0;
    finSi
regresa (resul);
}

funcion entero ultDigito(real x, entero digs) {
entero resul = ultDigito((entero)x,digs);
regresa(resul);
}

funcion entero ultDigito(entero x, entero digs) {
//entero resul = x - x / 10 * 10;
entero resul = x % potEnte10(digs);
regresa(resul);
}
