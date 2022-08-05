/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dados tres valores, determinar si:
    1) El primero es el mayor.
    2) El segundo es el mayor.
    3) El tercero es el mayor.
*/
principal                                                       // Unidad de programa principal
real uno, dos, tres;
logico elPrimeroEsMayor = FALSO
      ,elSegundoEsMayor = FALSO;
limpiar;                                                        // Limpia la pantalla.
leerM(uno,"Valor 1:");
leerM(dos,"Valor 2:");
leerM(tres,"Valor 3:");
si(uno >= dos Y uno >= tres) entonces
    mostrar << "El primero es mayor";
    elPrimeroEsMayor = VERDADERO;
    finSi
si(dos >= uno Y dos >= tres) entonces
    elSegundoEsMayor = VERDADERO;
    si(elPrimeroEsMayor) entonces
        mostrar << ", el segundo tambi�n";
        sino
        mostrar << "El segundo es mayor";
        finSi
    finSi
si(tres >= uno Y tres >= dos) entonces
    si(elPrimeroEsMayor O elSegundoEsMayor) entonces
        mostrar << " y el tercero tambi�n";
        sino
        mostrar << "El tercero es mayor";
        finSi
    finSi
mostrar << "." << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
