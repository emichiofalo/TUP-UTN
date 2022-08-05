/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include "program1.h"
/**
*    Enunciado: Dada una lista de hasta 100 vecPersonas, mostrar la de mÃ¡s edad
*/
#include "../leerVar.h"
#include "../persona.h"

constante entera TAM = 100;

procedimiento deMasEdad(entero,Persona[]);

principal                                                                       // Unidad de programa principal
Persona vecPersonas[TAM];
entero estaPers
      ,cantPers;
limpiar;                                                                        // Limpia la pantalla.
leerVar(cantPers,1,TAM,"Cantidad de vecPersonas");                                 // Cantidad real de vecPersonas a leer
Persona::leeVecPers(cantPers,vecPersonas);
deMasEdad(cantPers,vecPersonas);
pausa;                                                                          // Pausa antes de finalizar. 
finPrincipal                                                                    // Fin de unidad de programa principal

procedimiento deMasEdad(entero t, Persona vP[]) {
entero elMasViejo = 0
      ,i;
variar(i,1,t-1,1)
    si(vP[i].fechaNacimiento.esMenor(vP[elMasViejo].fechaNacimiento)) entonces
        elMasViejo = i;
        finSi
    finVariar
vP[elMasViejo].muestraPers();
}

