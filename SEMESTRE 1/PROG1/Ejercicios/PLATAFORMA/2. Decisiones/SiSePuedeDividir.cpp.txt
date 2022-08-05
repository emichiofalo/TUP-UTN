/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: leer 2 valores y:
                                 - Si se puede, dividir el primero por el segundo.
                                 - Dividir el mayor de los dos por el menor.
*/
procedimiento divide(real,real);

principal                                                       // Unidad de programa principal
real uno, dos;
limpiar;                                                        // Limpia la pantalla.
leerM(uno,"Valor 1:");
leerM(dos,"Valor 2:");
divide(uno,dos);
si(uno > dos) entonces
    divide(uno,dos);
    sino
    divide(dos,uno);
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

procedimiento divide(real x, real y) {
si(y NOES 0.0) entonces
    mostrar << x << "/" << y << " es: " << x / y << salto;
    sino
    mostrar << "No se puede dividir por cero..." << salto;
    finSi
}