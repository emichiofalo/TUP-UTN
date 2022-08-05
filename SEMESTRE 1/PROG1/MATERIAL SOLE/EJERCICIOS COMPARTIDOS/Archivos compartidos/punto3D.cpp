#include <program1.h>
#include "punto3D.h"
entero Punto3D::cantP3D = 0;

procedimiento Punto3D::leerP3D() {
#ifdef DEPURACION
x = alAzarRealEntre(-100.0f,100.0f);
y = alAzarRealEntre(-100.0f,100.0f);
z = alAzarRealEntre(-100.0f,100.0f);
//muestra();
#else
mostrar << "Punto " << id << ":\n";
leerM(x,"x:");
leerM(y,"y:");
leerM(z,"z:");
#endif
}

funcion real Punto3D::distancia(Punto3D otroPunto) {
real resul = cuadrado(otroPunto.x - x) + cuadrado(otroPunto.y - y) + cuadrado(otroPunto.z - z);
resul = XalaY(resul,0.5);
regresa(resul);
}

Punto3D::Punto3D() {                                                            // Constructor
x = 0;
y = 0;
z = 0;
id = ++cantP3D;
//muestra();
}
Punto3D::Punto3D(real estaX, real estaY, real estaZ) {                                                            // Constructor
x = estaX;
y = estaY;
z = estaZ;
id = ++cantP3D;
//muestra();
}

Punto3D::~Punto3D() {
//mostrar << "Destruyendo el ";
//muestra();
}

procedimiento Punto3D::muestra() {
mostrar << "Punto 3D: " << id << " (" << x << ";"<< y << ";" << z <<")\n";
}
