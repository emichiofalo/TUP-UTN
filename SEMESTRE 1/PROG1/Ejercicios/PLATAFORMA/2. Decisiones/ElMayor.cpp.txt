/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dados dos valores, mostrar el mayor.
*/
principal                                                        // Unidad de programa principal
real uno,dos;
limpiar;                                                         // Limpia la pantalla.
leerM(uno,"Valor 1:");
leerM(dos,"Valor 2:");
mostrar << "El mayor es: ";                                      // Texto en común.
si(uno > dos) entonces                                           // Si el primer valor es mayor al segundo,
    mostrar << uno << salto;                                     // muestra el primero
    sino                                                         // sino    
    mostrar << dos << salto;                                     // muestra el segundo.
    finSi
mostrar << salto;                                                // Salto de renglón.
pausa;                                                           // Pausa antes de finalizar. 
finPrincipal                                                     // Fin de unidad de programa principal
