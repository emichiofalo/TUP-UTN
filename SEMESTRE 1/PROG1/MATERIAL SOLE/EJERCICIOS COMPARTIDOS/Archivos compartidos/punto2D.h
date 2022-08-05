#ifndef Punto2D_H
#define Punto2D_H
estructura Punto2D {
    Punto2D();                                                                  // Constructor
    Punto2D(real,real);                                                                  // Constructor
    ~Punto2D();                                                                 // Destructor
    campo real x;
    campo real y;
    campo entero id;
    campo estatico entero cantP2D;
    procedimiento muestra();
    procedimiento leerP2D();
    procedimiento estatico leeVecP2D(entero,Punto2D[]);
    funcion real distancia(Punto2D);
    funcion entero cuadrante();
};

#endif
