/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un conjunto de hasta 100 puntos en el espacio tridimensional, mostrar los dos más alejados entre sí.
*/
#include "../leerVar.h"
#include "../punto3D.h"


procedimiento encuentra2MasLejanos(entero cant, Punto3D v3D[]);

constante entera TAM = 100000;

principal                                                                       // Unidad de programa principal
Punto3D vP3D [TAM];
entero cantidad;
leerVar(cantidad,2,TAM,"Cantidad de puntos");
entero i;
variar(i,0,cantidad-1,1)
    vP3D[i].leerP3D();
    finVariar;
mostrar << "Buscando...\n";
Clicks clic = ahora();
encuentra2MasLejanos(cantidad,vP3D);
mostrar << "Gastó " << ahora() - clic << " clics\n";
pausa;                                                                          // Pausa antes de finalizar. 
finPrincipal                                                                    // Fin de unidad de programa principal

procedimiento encuentra2MasLejanos(entero cant, Punto3D v3D[]) {
entero p1Ml = 0
      ,p2Ml = 1
      ,p1,p2;
real estaDist
    ,distMax = v3D[0].distancia(v3D[1]);
variar(p1,0,cant-2,1)
    variar(p2,p1+1,cant-1,1)
        estaDist = v3D[p1].distancia(v3D[p2]); // Calculamos la distancia entre los puntos p1 y p2
        si(estaDist > distMax) entonces
            distMax = estaDist;
            p1Ml = p1;
            p2Ml = p2;
            finSi
        finVariar
    finVariar
mostrar << "Los puntos más alejados son " << p1Ml+1 << " y " << p2Ml+1 << " (" << distMax << ")\n";
}

