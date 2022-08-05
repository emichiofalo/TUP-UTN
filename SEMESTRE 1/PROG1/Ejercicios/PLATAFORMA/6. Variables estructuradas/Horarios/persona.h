#ifndef PERSONA_H
#define PERSONA_H
#include <program1.h>

clase Persona {
privado:
    cadena apellido;
    cadena nombre;
    largo codigo;
    estatico largo cant;
publico:
	Persona();
    Persona (entero,cadena);
    procedimiento ponePersona (entero,cadena);
    funcion cadena cadPersona();
    funcion logica sinApellido();
    funcion estatica entera cantPersonas();
    funcion logico operador ES(Persona);
    funcion logico operador NOES(Persona);
    funcion logico operador <(Persona);
    funcion logico operador >(Persona);
    funcion logico operador <=(Persona);
    funcion logico operador >=(Persona);
    funcion largo suCodigo();
};

#endif

