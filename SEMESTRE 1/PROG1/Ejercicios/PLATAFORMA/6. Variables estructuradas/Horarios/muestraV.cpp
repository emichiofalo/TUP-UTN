#include <program1.h>                                           // Archivo de traducción de seudocódigo a C++
plantilla(Tipo)
procedimiento muestraV(vectorDin(Tipo) v) {
paraCada(ele,v)
    mostrar << ele << "  ";
    finParaCada
mostrar << salto;
}
implementa procedimiento muestraV(vectorDin(entero));
implementa procedimiento muestraV(vectorDin(caracter));
implementa procedimiento muestraV(vectorDin(cadena));

//#include "./Dia11/DireccionHex.h"
//implementa procedimiento muestraV(vectorDin(Direccion));
plantilla(Tipo)
procedimiento muestraV(matrizDin2D(Tipo) m) {
paraCada(v,m)
    muestraV(v);
    finParaCada
}
implementa procedimiento muestraV(matrizDin2D(entero));

plantilla(Tipo)
procedimiento muestraV(entero t, Tipo v[]) {
entero ind;
variarMas1(ind,0,t-1)
    mostrar << v[ind] << "  ";
    finVariar
mostrar << salto;
}
implementa procedimiento muestraV(entero,entero[]);