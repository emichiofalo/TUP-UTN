/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un nÃºmero, establecer si es capicÃºa.
*/
#include "../enteros.h"

principal                                                       // Unidad de programa principal
entero nro; // Dato (a leer)
limpiar;                                                        // Limpia la pantalla.
leerM(nro,"Valor:");
mostrar << fSi(esCapicua(nro),"Es","No es") << " capicÃºa" << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

