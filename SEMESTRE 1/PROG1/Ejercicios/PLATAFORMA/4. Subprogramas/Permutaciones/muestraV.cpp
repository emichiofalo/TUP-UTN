#include "muestraV.h"
plantilla(Tipo)
procedimiento muestraV(vectorDin(Tipo) v) {
paraCadaValor(ele,v)
    mostrar << ele << tabulado;
    finPara
mostrar << salto;
}
implementa procedimiento muestraV(vectorDin(entero));

plantilla(Tipo)
procedimiento muestraV(matrizDin2D(Tipo) m) {
paraCadaValor(v,m)
    muestraV(v);
    finPara
mostrar << salto;
}
implementa procedimiento muestraV(matrizDin2D(entero));
