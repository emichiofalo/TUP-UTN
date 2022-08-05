#include <program1.h>
#include "persona.h"
entero Persona::contador = 0;

procedimiento Persona::leeFechaNac() {
iterar
    fechaNacimiento.leeFecha();    
    salirSi(NO fechaNacimiento.esMayor(Fecha::hoy()));
    mostrar << "Está en el futuro...\n";
    finIterar
}

procedimiento Persona::muestraPers() {
mostrar << "Datos Personales:\n"
        << "Apellido:" << apellido
        << " , Nombre:" << nombre
        << " , Id:" << nroId 
        << " , Nacido en ";
fechaNacimiento.muestra();
}

Persona::Persona() {
nroId = ++contador;
//leerPers();
}

procedimiento Persona::leeCadPers(cadena porRef algo, cadena mens) {
caracter tecla;
algo = "";                                                                      // Empieza con una cadena vacía (acumulador de caracteres)
mostrar << mens;
iterar
    leeTecla(tecla);
    salirSi(tecla ES '\n' Y algo NOES "");
    si(esLetra(tecla) O esDigito(tecla)) entonces
        algo += tecla;
        sino
        algo += " ";
        finSi
    finIterar
}

procedimiento Persona::leerPers() {
leeCadPers(apellido,"Apellido:");
leeCadPers(nombre,"Nombre:");
leeFechaNac();
}

procedimiento Persona::leeVecPers(entero t, Persona vP[]) {
entero estaPers;
variar(estaPers,0,t-1,1)
    vP[estaPers].leerPers();
    finVariar
}