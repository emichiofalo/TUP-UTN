#include "persona.h"
largo Persona::cant = 0;

Persona::Persona() {
leerM(apellido,"Apellido:");
si(NO sinApellido())entonces
    leerM(nombre,"Nombre:");
    codigo = cant++;
    finSi
}
Persona::Persona(entero cod,cadena ape) {
codigo = cod;
apellido = ape;
nombre = "Sin";
}
procedimiento Persona::ponePersona(entero cod,cadena ape) {
codigo = cod;
apellido = ape;
nombre = "Sin";
}
funcion cadena Persona::cadPersona() {
cadena resul = aCadena(codigo,"000") + " - " + apellido + ", " + nombre;
regresa(resul);
}
funcion logica Persona::sinApellido() {
logico resul = apellido ES ".";
regresa(resul);
}
funcion entera Persona::cantPersonas() {
entero resul = cant;
regresa(resul);
}
funcion logico Persona::operador ES(Persona otraPersona) {
logico resul =  codigo ES otraPersona.codigo;
regresa(resul);
}
funcion logico Persona::operador NOES(Persona otraPersona) {
logico resul =  NO (codigo ES otraPersona.codigo);
regresa(resul);
}
funcion logico Persona::operador <(Persona otraPersona) {
logico resul =  codigo < otraPersona.codigo;
regresa(resul);
}
funcion logico Persona::operador >(Persona otraPersona) {
logico resul =  codigo > otraPersona.codigo;
regresa(resul);
}
funcion logico Persona::operador <=(Persona otraPersona) {
logico resul =  NO (codigo > otraPersona.codigo);
regresa(resul);
}
funcion logico Persona::operador >=(Persona otraPersona) {
logico resul =  NO (codigo < otraPersona.codigo);
regresa(resul);
}

funcion largo Persona::suCodigo() {
largo resul =  codigo;
regresa(resul);
}

