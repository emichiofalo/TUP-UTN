#ifndef PUNTO3D_H
#define PUNTO3D_H
#include "Punto2D.h"
clase Punto3D : publico Punto2D {
privado:
    campo real z;
publico:
    Punto3D();
    Punto3D(cadena);
    Punto3D(real,real,real);
    Punto3D(cadena,real,real,real);
    funcion real distancia3D(Punto3D);
    procedimiento leePunto();
    procedimiento muestraPunto();
    procedimiento muestraPunto(logico);
};

#endif

