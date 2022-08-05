#ifndef TIEMPO_H
#define TIEMPO_H
#include "fechasTAD.h"

clase Tiempo {
privado:
    campo Fecha fecha;
    campo entero hora;
    campo entero minuto;
    campo entero segundo;
publico:
    Tiempo();
    Tiempo(constante Tiempo porRef);
    Tiempo(entero,entero,entero,entero,entero,entero);
    procedimiento poneTiempo(entero,entero,entero,entero,entero,entero);
    procedimiento leeTiempo();
    funcion cadena cadTiempo();
    funcion logico operador ES(Tiempo);
    funcion logico operador NOES(Tiempo);
    funcion logico operador <(Tiempo);
    funcion logico operador <=(Tiempo);
    funcion logico operador >(Tiempo);
    funcion logico operador >=(Tiempo);
    funcion largo segundosHasta(Tiempo);
    funcion cadena hmsHasta(Tiempo);
    procedimiento operador ++();
    funcion Tiempo operador ++(entero);
    procedimiento operador --();
    funcion Tiempo operador --(entero);
    funcion Tiempo operador +(largo);
    funcion Tiempo operador -(largo);
    funcion Fecha suFecha();
//    funcion Tiempo operador +=(largo);
//    funcion Tiempo operador -=(largo);
    };
#endif
