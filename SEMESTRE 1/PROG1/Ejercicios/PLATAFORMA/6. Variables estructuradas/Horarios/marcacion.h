#ifndef MARCACION_H
#define MARCACION_H
#include <program1.h>
#include "tiempo.h"
#include "persona.h"

clase Marcacion {
privado:
    campo entero codigo;
    campo Tiempo t;
    campo estatico entero cant;
publico:
	Marcacion();
	Marcacion(Tiempo);
	Marcacion(logico,Tiempo);
	Marcacion(entero,Tiempo);
	procedimiento poneMarcacion(entero,Tiempo);
    funcion logica esMarcaValida();
    funcion cadena cadMarca();
    funcion entero suCodigo();
    funcion Tiempo suTiempo();
    funcion logica operador ES(Marcacion);
    funcion logica operador NOES(Marcacion);
    funcion logica operador <(Marcacion);
    funcion logica operador >(Marcacion);
    funcion logica operador <=(Marcacion);
    funcion logica operador >=(Marcacion);
};

#endif

