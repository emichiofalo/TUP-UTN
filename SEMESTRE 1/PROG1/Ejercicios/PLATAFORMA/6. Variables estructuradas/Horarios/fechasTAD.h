#ifndef FECHASTAD_H
#define FECHASTAD_H
#include <program1.h>
clase Fecha {
privado:
    campo entero anio;
    campo entero mes;
    campo entero dia;
publico:
    Fecha();
    Fecha(const Fecha &);
    Fecha(entero,entero,entero);
    funcion cadena textfecha();
    procedimiento leeFecha();
    funcion entero cantDias(entero,entero);
    funcion logico esBisiesto(entero);
    funcion cadena cadFecha();
    funcion logico operador ES(Fecha);
    funcion logico operador NOES(Fecha);
    funcion logico operador <(Fecha);
    funcion logico operador <=(Fecha);
    funcion logico operador >(Fecha);
    funcion logico operador >=(Fecha);
    procedimiento operador ++();
    funcion Fecha operador ++(entero);
    procedimiento operador --();
    funcion Fecha operador --(entero);
    funcion Fecha operador +(entero);
    funcion Fecha operador -(entero);
    };
#endif