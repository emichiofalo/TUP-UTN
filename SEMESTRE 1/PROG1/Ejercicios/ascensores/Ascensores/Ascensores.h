#ifndef ASCENSORES_H
#define ASCENSORES_H
#include <program1.h>

estructura Ascensores {
privado:
    entero piso;
    sinSigno pisosAcum;
publico:
	Ascensores();
	Ascensores(noCambia Ascensores porRef a);
	~Ascensores();
    funcion estatica entero eligeAscensor(vectorDin(Ascensores),entero);
    procedimiento mueveAscensor(entero);
    procedimiento mostrarAscensor();
    procedimiento estatico mostrarAscensores(vectorDin(Ascensores));
};

#endif

