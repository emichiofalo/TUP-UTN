#include <program1.h>
#include "punto2D.h"
entero Punto2D::cantP2D = 0;

procedimiento Punto2D::leerP2D() {
#ifdef DEPURACION
x = alAzarRealEntre(-100.0f,100.0f);
y = alAzarRealEntre(-100.0f,100.0f);
//muestra();
#else
mostrar << "Punto " << id << ":\n";
leerM(x,"x:");
leerM(y,"y:");
#endif
}

funcion real Punto2D::distancia(Punto2D otroPunto) {
real resul = cuadrado(otroPunto.x - x) + cuadrado(otroPunto.y - y);
resul = XalaY(resul,0.5);
regresa(resul);
}

Punto2D::Punto2D() {                                                            // Constructor
x = 0;
y = 0;
id = ++cantP2D;
//muestra();
}
Punto2D::Punto2D(real estaX, real estaY) {                                                            // Constructor
x = estaX;
y = estaY;
id = ++cantP2D;
//muestra();
}

Punto2D::~Punto2D() {
//mostrar << "Destruyendo el ";
//muestra();
}

procedimiento Punto2D::muestra() {
mostrar << "Punto: " << id << " (" << x << ";"<< y <<")\n";
}

procedimiento Punto2D::leeVecP2D(entero t, Punto2D v2D[]) {
entero i;
variar(i,0,t-1,1)
    v2D[i].leerP2D();
    finVariar
}

funcion entero Punto2D::cuadrante() {
entero resul;
si(x >= 0.f Y y >= 0.f) entonces
    resul = 1;
    sinoSi(x < 0.f Y y >= 0.f) entonces
    resul = 2;
    sinoSi(x < 0.f Y y < 0.f) entonces
    resul = 3;
    sino
    resul = 4;
    finSi
regresa(resul);
}