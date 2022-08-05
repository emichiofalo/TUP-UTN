#include "Punto1D.h"

Punto1D::Punto1D() {
id = "Anónimo";
x = 0.;
}
Punto1D::Punto1D(cadena ide) {
id = ide;
x = 0.;
}

Punto1D::Punto1D(cadena ide, real xx) {
id = ide;
x = xx;
}

Punto1D::Punto1D(real xx) {
id = "Anónimo";
x = xx;
}

procedimiento Punto1D::leePunto() {
mostrar << id << ".";
leerM(x,"x:");
}

funcion real Punto1D::distancia1D(Punto1D otroPunto) {
real resul = otroPunto.x - x;
regresa(resul);
}

procedimiento Punto1D::muestraPunto() {
mostrar << "Punto:" << id << ", X: "  << x;
}

procedimiento Punto1D::muestraPunto(logico salta) {
muestraPunto();
si(salta) mostrar << salto;
}
