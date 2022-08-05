#ifndef PUNTO1D_H
#define PUNTO1D_H
#include <program1.h>
clase Punto1D {
privado:
    campo cadena id;
    campo real x;
publico:
    Punto1D();
    Punto1D(cadena);
    Punto1D(cadena,real);
    Punto1D(real);
    funcion real distancia1D(Punto1D);
    procedimiento leePunto();
    procedimiento muestraPunto();
    procedimiento muestraPunto(Logico);
    };

#endif

