/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un número, establecer si es capicúa.
*/
#include "../enteros.h"

principal                                                       // Unidad de programa principal
entero nro; // Dato (a leer)
limpiar;                                                        // Limpia la pantalla.
leerM(nro,"Valor:");
mostrar << fSi(esCapicua(nro),"Es","No es") << " capicúa" << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

