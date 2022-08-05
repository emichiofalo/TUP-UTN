#include <program1.h>
#include "busquedaExh.h"

/** Busca un valor dentro de un conjunto */
plantilla(Tipo)
funcion entero  busquedaExh(entero T, Tipo v[], Tipo vAb) {
entero resul = T-1;
mientras(resul >= 0 Y vAb NOES v[resul])
    resul--;
    finMientras
regresa (resul);
}
implementa funcion entero busquedaExh(entero,real[],real);
implementa funcion entero busquedaExh(entero,entero[],entero);

plantilla(Tipo)
funcion entero busquedaExh(entero T, Tipo v[], Tipo vAb, entero ocurrencia) {
entero resul = T-1
      ,rep = 0;
mientras(resul >= 0 Y (vAb NOES v[resul] O rep NOES ocurrencia) )
    si(vAb ES v[resul]) entonces
        rep++;
        finSi;
    si(rep NOES ocurrencia) entonces
        resul--;
        finSi
    finMientras
regresa (resul);
}
implementa funcion entero busquedaExh(entero,real[],real,entero);
implementa funcion entero busquedaExh(entero,entero[],entero,entero);

plantilla(Tipo)
funcion logico estaExh(entero T, Tipo v[], Tipo vAb) {
logico resul = busquedaExh(T,v,vAb) >= 0;
regresa (resul);
}
implementa funcion logico estaExh(entero,real[],real);
implementa funcion logico estaExh(entero,entero[],entero);

plantilla(Tipo)
funcion entero  cuentaExh(entero T,Tipo v[],Tipo vAb) {
entero resul = 0
      ,ind = T-1;
mientras(ind >= 0)
    si(vAb ES v[ind]) entonces
        resul++;
        finSi
    ind--;
    finMientras
regresa (resul);
}
implementa funcion entero cuentaExh(entero,real[],real);
implementa funcion entero cuentaExh(entero,entero[],entero);
