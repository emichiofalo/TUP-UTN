/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Leer un valor y determinar si es par o impar.
*/
principal                                                       // Unidad de programa principal
entero nro;
limpiar;                                                        // Limpia la pantalla.
leerM(nro,"Número:");
si(nro / 2 * 2 ES nro) entonces                                 // (nro % 2 ES 0)
    mostrar << "Es par...";
    sino
    mostrar << "Es impar...";
    finSi
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
