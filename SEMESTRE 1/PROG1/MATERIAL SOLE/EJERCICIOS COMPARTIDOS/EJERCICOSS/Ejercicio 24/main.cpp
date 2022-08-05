/*
    program1.h es el archivo de traducciÛn de seudocÛdigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada una serie de tiempo, calcular sus m√≠nimos y m√°ximos absolutos y relativos.
*/
principal                                                       // Unidad de programa principal
real nroActual
    ,minAbs
    ,maxAbs
    ,nroAnt
    ,nroAntAnt;
entero cant = 0;
caracter car;
logico salida;
limpiar;                                                        // Limpia la pantalla.
iterar
    repetir
        mostrar << "\n¬øSale? (s|n):";
        leeTecla(car);
        hasta(car ES 's' O car ES 'n');
    salida = car ES 's';
    salirSi(salida);
    leerM(nroActual,"\nValor:");
    cant++;
    si(cant ES 1) entonces
        maxAbs = minAbs = nroActual;                            // Es el √∫nico hasta ahora.
        sino
        si(cant >= 3) entonces
            si(nroAnt < nroAntAnt Y 
               nroAnt < nroActual) entonces
                mostrar << "M√≠nimo relativo:" << nroAntAnt << tabulado << nroAnt << tabulado << nroActual << salto;
                sinoSi(nroAnt > nroAntAnt Y 
                       nroAnt > nroActual) entonces
                mostrar << "Maximo relativo:" << nroAntAnt << tabulado << nroAnt << tabulado << nroActual << salto;
                finSi
            finSi
        si(nroActual > maxAbs) entonces                     // Es el m√°s grande hasta ahora
            maxAbs = nroActual;
            sinoSi(nroActual < minAbs) entonces                     // Es el m√°s chico hasta ahora
            minAbs = nroActual;
            finSi
        finSi
    nroAntAnt = nroAnt;
    nroAnt = nroActual;
    finIterar;
si(cant > 0) entonces
    mostrar << "El m·ximo absoluto es: " << maxAbs << salto;
    mostrar << "El mÌnimo absoluto es: " << minAbs << salto;
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
