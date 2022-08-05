#ifndef PUNTO3D_H
#define PUNTO3D_H
estructura Punto3D {
    Punto3D();                                                                  // Constructor
    Punto3D(real,real,real);                                                                  // Constructor
    ~Punto3D();                                                                 // Destructor
    campo real x;
    campo real y;
    campo real z;
    campo entero id;
    campo estatico entero cantP3D;
    procedimiento muestra();
    procedimiento leerP3D();
    funcion real distancia(Punto3D);
};

#endif
