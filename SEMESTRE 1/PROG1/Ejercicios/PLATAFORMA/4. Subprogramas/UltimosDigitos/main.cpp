/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
#include "ultDigito.h"
/**
*    Enunciado: Dado un n�mero mostrar el �ltimo d�gito de su parte entera
*/

principal                                                       // Unidad de programa principal
//entero nro;
real nro;
limpiar;                                                        // Limpia la pantalla.
leerM(nro,"N�mero:");
//mostrar << "Los �ltimos 2 d�gitos son: " << ultDigito(nro,2) << salto;
mostrar << "El �ltimo d�gito es: " << ultDigito(nro) << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
