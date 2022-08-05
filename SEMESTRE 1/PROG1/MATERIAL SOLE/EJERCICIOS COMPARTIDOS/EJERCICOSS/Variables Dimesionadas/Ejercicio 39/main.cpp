/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un conjunto ordenado de hasta 100 valores, buscar un valor cualquiera en forma binaria.
*/
#include <leerVar.h>
#include "../leemuestvec.h"
#include "../busquedabin.h"

constante entero TAM = 10000;                                                      // Cantidad de espacio reservado

principal                                                                            // Unidad de programa principal
real conj[TAM]                                                                       // Conjunto ordenado de datos (a leer)
    ,vABuscar;                                                                       // Valor a buscar (a leer)
entero cant
      ,conj2[TAM];                                                                   // Cantidad a leer
limpiar;                                                                             // Limpia la pantalla.
leerVar(cant,2,TAM,"Cantidad de valores a leer");                                    // Lee el tamaño real del conjunto
leerVec(cant,conj);                                                                  // Lee (o genera) el conjunto de valores
muestraVec(cant,conj);                                                               // Muestra el conjunto de valores
leerVec(cant,conj2);                                                                 // Lee (o genera) el conjunto de valores
muestraVec(cant,conj2);                                                              // Muestra el conjunto de valores
leerM(vABuscar,"Valor a buscar:");                           // Leemos el valor a buscar
si(estaBin(cant,conj,vABuscar)) entonces
    mostrar << vABuscar << " está en la posición " << 1 + dondeBin(cant,conj,vABuscar);
    sino
    mostrar << vABuscar << " no está...";
    finSi
mostrar << salto;
si(estaBin(cant,conj2,(entero)vABuscar)) entonces
    mostrar << (entero)vABuscar << " está en la posición " << 1 + dondeBin(cant,conj2,(entero)vABuscar);
    sino
    mostrar << (entero)vABuscar << " no está...";
    finSi
mostrar << salto;
pausa;                                                                               // Pausa antes de finalizar. 
finPrincipal                                                                         // Fin de unidad de programa principal

