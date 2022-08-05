#include "Punto2D.h"

Punto2D::Punto2D() {
y = 0;
}

Punto2D::Punto2D(cadena ide) : Punto1D(ide) {
y = 0;
}

Punto2D::Punto2D(cadena ide,real xx,real yy) : Punto1D(ide,xx) {
y = yy;
}

Punto2D::Punto2D(real xx,real yy) : Punto1D(xx) {
y = yy;
}

procedimiento Punto2D::leePunto() {
Punto1D::leePunto();
leerM(y,"y:");
}

funcion real Punto2D::distancia2D(Punto2D otroPunto) {
real resul = raiz2(cuadrado(distancia1D((Punto1D)otroPunto)) + cuadrado(otroPunto.y - y));
regresa(resul);
}

procedimiento Punto2D::muestraPunto() {
Punto1D::muestraPunto();
mostrar << ", Y: "  << y ;
}

procedimiento Punto2D::muestraPunto(logico salta) {
muestraPunto();
si(salta) mostrar << salto;
}
