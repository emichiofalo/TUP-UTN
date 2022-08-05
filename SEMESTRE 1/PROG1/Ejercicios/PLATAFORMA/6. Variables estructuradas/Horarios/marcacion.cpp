#include "marcacion.h"
#include "leeVar.h"
#include "persona.h"
#include "tiempo.h"

entero Marcacion::cant = 0;

Marcacion::Marcacion() {
//leeVar(codigo,(-1),Persona::cantPersonas()-1,"Código:");
//si(codigo NOES (-1)) entonces
//    t.leeTiempo();
//    finSi
}
Marcacion::Marcacion(Tiempo tAnt) {
leeVar(codigo,(-1),Persona::cantPersonas()-1,"Código:");
si(codigo NOES (-1)) entonces
    iterar
        t.leeTiempo();
        salirSi(tAnt.segundosHasta(t) > 0);
        mostrar << "No sigue la línea de tiempo:" << salto
                << "Anterior: " << tAnt.cadTiempo() << salto
                << "ingresado: " << t.cadTiempo() << salto;
        finIterar
    finSi
}
Marcacion::Marcacion(logico esPrimero, Tiempo tAnt) {
leeVar(codigo,(-1),Persona::cantPersonas()-1,"Código:");
si(codigo NOES (-1)) entonces
    iterar
        t.leeTiempo();
        salirSi(esPrimero O tAnt.segundosHasta(t) > 0);
        mostrar << "No sigue la línea de tiempo:" << salto
                << "Anterior: " << tAnt.cadTiempo() << salto
                << "ingresado: " << t.cadTiempo() << salto;
        finIterar
    finSi
}
Marcacion::Marcacion(entero cod,Tiempo ti) : codigo(cod), t(ti){
}
procedimiento Marcacion::poneMarcacion(entero cod,Tiempo ti) {
codigo = cod;
t = ti;
}
funcion logica Marcacion::esMarcaValida() {
logico resul = (codigo >= 0) Y (codigo < Persona::cantPersonas());
regresa(resul);
}
funcion cadena Marcacion::cadMarca() {
cadena resul = aCadena(codigo, "000") + " - " + t.cadTiempo();
regresa(resul);
}
funcion entera Marcacion::suCodigo() {
entero resul = codigo;
regresa(resul);
}
funcion Tiempo Marcacion::suTiempo() {
Tiempo resul = t;
regresa(resul);
}
funcion logica Marcacion::operador ES(Marcacion otraMarca) {
logico resul = (t ES otraMarca.t) Y (codigo ES otraMarca.codigo);
regresa(resul);
}
funcion logica Marcacion::operador NOES(Marcacion otraMarca) {
logico resul = NO (*this ES otraMarca);
regresa(resul);
}
funcion logica Marcacion::operador <(Marcacion otraMarca) {
logico resul = (t < otraMarca.t) O ((t ES otraMarca.t) Y (codigo < otraMarca.codigo));
regresa(resul);
}
funcion logica Marcacion::operador >(Marcacion otraMarca) {
logico resul = (t > otraMarca.t) O ((t ES otraMarca.t) Y (codigo > otraMarca.codigo));
regresa(resul);
}
funcion logica Marcacion::operador <=(Marcacion otraMarca) {
logico resul = NO (*this > otraMarca);
regresa(resul);
}
funcion logica Marcacion::operador >=(Marcacion otraMarca) {
logico resul = NO (*this < otraMarca);
regresa(resul);
}

