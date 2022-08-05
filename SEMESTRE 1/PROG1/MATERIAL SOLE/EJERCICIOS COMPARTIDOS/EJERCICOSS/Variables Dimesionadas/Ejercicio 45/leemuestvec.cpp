#include <program1.h>
/**
*    Procedimiento de lectura de vectores (o de generación al azar)
*/
//#include "leemuestvec.h"
//plantilla(Tipo)
//procedimiento muestraVec(entero, Tipo v[]);

#ifdef GENERAZAR
estatico largo tiempo = time(NULL);
#ifdef ORDENADO
#define VALORMINIMO     -1000.0
#else
#define VALORMINIMO     -1000.0
#endif
#define VALORMAXIMO     +1000.0
#define alAzarEntreMinMax  decimales(alAzarRealEntre(VALORMINIMO,VALORMAXIMO),2)
#endif

plantilla(Tipo)
procedimiento leerVec(entero t, Tipo v[]) {
entero i;                                                       // índice del bucle
#ifdef GENERAZAR
{
//iniciAlAzar;
    mostrar << "Inicializando con "<<tiempo++ << salto;
    srand(time(NULL));
}
#endif
variar(i,0,t-1,1)                                               // Bucle de lectura
#ifdef GENERAZAR
#ifdef ORDENADO
si(i > 0) entonces
    v[i] = v[i-1] + (Tipo)alAzarEntreMinMax;
    sino
    v[i] = (Tipo)alAzarEntreMinMax;
    finSi
#else
v[i] = (Tipo)alAzarEntreMinMax;
#endif
#else
    leerM(v[i],"Valor("<<i+1<<"):");                            // Lee el i-ésimo valor (desde 0, pero muestra mensaje desde 1)    
#endif
    finVariar
}

implementa procedimiento leerVec(entero,real[]);
implementa procedimiento leerVec(entero,entero[]);

plantilla(Tipo)
procedimiento muestraVec(entero t, Tipo v[]) {
entero i;
logico esEntero = (Tipo)1.5 ES (entero)1.5;
variar(i,0,t-1,1)
    si(esMult(i,8)) entonces
        mostrar << salto;
        finSi
    si(esEntero) entonces
        mostrarConAncho(4);
        mostrar << "V("<<i+1<<"):" <<v[i]<<tabulado;
        sino
//            mostrarConAncho(1);
        mostrar << "V("<<i+1<<"):" <<v[i]<<tabulado;
        finSi
    finVariar
mostrar << salto;
}

implementa procedimiento muestraVec(entero,real[]);
implementa procedimiento muestraVec(entero,entero[]);
