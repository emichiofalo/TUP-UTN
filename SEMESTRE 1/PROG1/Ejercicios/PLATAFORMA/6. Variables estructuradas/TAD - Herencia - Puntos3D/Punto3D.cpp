#include "Punto3D.h"

Punto3D::Punto3D() {
z = 0;
}

Punto3D::Punto3D(cadena ide) : Punto2D(ide) {
z = 0;
}

Punto3D::Punto3D(cadena ide,real xx,real yy,real zz) : Punto2D(ide,xx,yy) {
z = zz;
}

Punto3D::Punto3D(real xx,real yy,real zz) : Punto2D(xx,yy) {
z = zz;
}

procedimiento Punto3D::leePunto() {
Punto2D::leePunto();
leerM(z,"z:");
}

funcion real Punto3D::distancia3D(Punto3D otroPunto) {
real resul = raiz2(cuadrado(distancia2D((Punto2D)otroPunto)) + cuadrado(otroPunto.z - z));
regresa(resul);
}

procedimiento Punto3D::muestraPunto() {
Punto2D::muestraPunto();
mostrar << ", Z: "  << z ;
}

procedimiento Punto3D::muestraPunto(logico salta) {
muestraPunto();
si(salta) mostrar << salto;
}
