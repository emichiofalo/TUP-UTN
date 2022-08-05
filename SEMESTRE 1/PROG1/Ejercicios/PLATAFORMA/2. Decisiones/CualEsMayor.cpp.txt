/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Leer tres valores y determinar cuál (primero, segundo o tercer valor) es el mayor.
*/
principal                                                       // Unidad de programa principal
real uno, dos, tres;
limpiar;                                                        // Limpia la pantalla.
leerM(uno,"Valor 1:");
leerM(dos,"Valor 2:");
leerM(tres,"Valor 3:");
si(uno >= dos Y uno >= tres) entonces
    mostrar << "El primero es mayor..." << salto;
    finSi
si(dos >= uno Y dos >= tres) entonces
    mostrar << "El segundo es mayor..." << salto;
    finSi
si(tres >= uno Y tres >= dos) entonces
    mostrar << "El tercero es mayor..." << salto;
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
