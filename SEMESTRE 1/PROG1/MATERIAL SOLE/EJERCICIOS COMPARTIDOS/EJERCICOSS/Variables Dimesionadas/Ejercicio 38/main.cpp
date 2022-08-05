/*
    program1.h es el archivo de traducci髇 de seudoc骴igo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado dos conjuntos de 40 valores, buscar exhaustivamente uno cualquiera y calcular cu谩ntas veces est谩 presente.
*/
#include "../leemuestvec.h"
#include "../busquedaExh.h"

constante largo TAM = 1000000;

principal                                                                            // Unidad de programa principal
real conj[TAM]                                                                       // Conjunto (dato: a leer)
    ,vABuscar;                                                                       // Valor a buscar (dato: a leer)
entero ind
    ,conj2[TAM];
limpiar;                                                                             // Limpia la pantalla.
leerVec(TAM,conj);
muestraVec(TAM,conj);
leerVec(TAM,conj2);
muestraVec(TAM,conj2);
leerM(vABuscar,"Valor a buscar:");
si(estaExh(TAM,conj,vABuscar)) entonces                                              // Si es mayor que cero, lo encontr贸
    mostrar << vABuscar << " est谩 " << cuentaExh(TAM,conj,vABuscar) << " veces...";
    sino                                                                             // sino es (-1) y no lo encontr贸.
    mostrar << "No encontrado:" << vABuscar;
    finSi
mostrar << salto;
si(estaExh(TAM,conj2,(entero)vABuscar)) entonces                                              // Si es mayor que cero, lo encontr贸
    mostrar << (entero)vABuscar << " est谩 " << cuentaExh(TAM,conj2,(entero)vABuscar) << " veces...";
    sino                                                                             // sino es (-1) y no lo encontr贸.
    mostrar << "No encontrado:" << (entero)vABuscar;
    finSi
mostrar << salto;
pausa;                                                                               // Pausa antes de finalizar. 
finPrincipal                                                                         // Fin de unidad de programa principal
