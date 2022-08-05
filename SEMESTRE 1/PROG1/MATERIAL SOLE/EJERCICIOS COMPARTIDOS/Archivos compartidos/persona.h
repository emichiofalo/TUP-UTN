#ifndef PERSONA_H
#define PERSONA_H
#include "fechas.h"
Estructura Persona {
    Persona();
    campo cadena apellido;
    campo cadena nombre;
    campo entero nroId;
    campo estatico entero contador;
    campo Fecha fechaNacimiento;
    procedimiento leerPers();
    procedimiento leeCadPers(cadena porRef,cadena);
    procedimiento muestraPers();
    procedimiento leeFechaNac();
    estatico procedimiento leeVecPers(entero,Persona[]);
};

#endif
