#include "Ascensores.h"
#include <program1.h>

Ascensores::Ascensores() {
piso = 0;
pisosAcum = 0;
}

Ascensores::Ascensores(const Ascensores porRef a) {
piso = a.piso;
pisosAcum = a.pisosAcum;
}

Ascensores::~Ascensores() {
}

procedimiento Ascensores::mostrarAscensores(vectorDin(Ascensores) v) {
entero i = 0;
paraCada(a,v)
    mostrar << ++i << ": ";
    a.mostrarAscensor();
    finPara
}

procedimiento Ascensores::mostrarAscensor() {
mostrar << "Piso:" << piso << ", acumulados:" << pisosAcum << salto;
}

funcion entero Ascensores::eligeAscensor(vectorDin(Ascensores) vAsc,entero unPiso) {
entero resul = 0
      ,i = 0
      ,distMin = abs(unPiso - vAsc[0].piso)
      ,dist;
paraCada(asc,vAsc)
    dist = abs(unPiso - asc.piso);
    si(dist < distMin O (dist ES distMin Y (asc.pisosAcum < vAsc[resul].pisosAcum))) entonces
        resul = i;
        distMin = dist;
        finSi
    i++;
    finPara
regresa(resul);
}

procedimiento Ascensores::mueveAscensor(entero nvoPiso) {
pisosAcum += abs(nvoPiso - piso);
piso = nvoPiso;
}
