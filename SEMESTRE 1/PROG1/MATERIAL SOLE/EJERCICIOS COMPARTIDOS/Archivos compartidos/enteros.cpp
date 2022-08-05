#include <program1.h>
#include "enteros.h"
funcion entero primerDig(entero n) {
entero resul;
si(n < 0) entonces
    resul = primerDig(-n);
    sinoSi(n >= 10) entonces
    resul = primerDig(n / 10);
    sino
    resul = n;
    finSi
regresa (resul);
}

funcion entero ultimoDig(entero n) {
entero resul = fSi(n >= 0,n - n / 10 * 10
                         ,ultimoDig(-n));
regresa (resul);
}

funcion entero sinUltimoDig(entero n) {
entero resul = (n / 10);
regresa (resul);
}

funcion entero pot10(entero n) {
entero resul;
si(n < 0 ) entonces
    resul = 0;
    sinoSi(n > 0) entonces
    resul = 10 * pot10(n-1);
    sino
    resul = 1;
    finSi
regresa (resul);
}

funcion entero cantDig(entero n) {
entero resul;
si(n >= 10) entonces
    resul = 1 + cantDig( sinUltimoDig(n));
    sinoSi(n < 0) entonces
    resul = cantDig(-n);
    sino
    resul = 1;
    finSi
regresa(resul);
}

funcion entero poneCerosDcha(entero n) {
entero resul = primerDig(n) * pot10(cantDig(n)-1);
regresa (resul);
}

funcion entero sinPrimerDig(entero n) {
entero resul = n - poneCerosDcha(n);
regresa(resul);
}

funcion logico esCapicua(entero n) {
logico resul;
si(n < 0) entonces // Si es negativo, lo volvemos positivo
    resul = esCapicua(-n);
    sinoSi(n < 10) entonces // Si tiene un solo dígito es capicua
    resul = VERDADERO;
    sino
    resul = primerDig(n) ES ultimoDig(n) Y esCapicua(sinPrimerDig(sinUltimoDig(n)));
    finSi
regresa (resul);
}