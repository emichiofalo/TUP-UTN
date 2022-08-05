/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
#include "ultDigito.h"
/**
*    Enunciado: Dado un número mostrar el último dígito de su parte entera
*/

principal                                                       // Unidad de programa principal
//entero nro;
real nro;
limpiar;                                                        // Limpia la pantalla.
leerM(nro,"Número:");
//mostrar << "Los últimos 2 dígitos son: " << ultDigito(nro,2) << salto;
mostrar << "El último dígito es: " << ultDigito(nro) << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
