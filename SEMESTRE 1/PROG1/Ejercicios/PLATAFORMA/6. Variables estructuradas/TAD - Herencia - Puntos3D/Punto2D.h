#ifndef PUNTO2D_H
#define PUNTO2D_H
#include "Punto1D.h"

estructura Punto2D : publico Punto1D {                                                  // Herencia
privado:
    campo real y;
publico:
    Punto2D();
    Punto2D(cadena);
    Punto2D(real,real);
    Punto2D(cadena,real,real);
    funcion real distancia2D(Punto2D);
    procedimiento leePunto();
    procedimiento muestraPunto();
    procedimiento muestraPunto(logico);
    };

#endif

