/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un número, determinar si es positivo, negativo o nulo.
*/
principal                                                       // Unidad de programa principal
real nro;
limpiar;                                                        // Limpia la pantalla.
leerM(nro,"Valor:");
mostrar << "El número es ";
si(nro > 0) entonces                                            // Es positivo
    mostrar << "positivo" << salto;
    sinoSi(nro < 0) entonces                                    // sino, si es negativo
    mostrar << "negativo" << salto;
    sino                                                        // sino, es cero.
    mostrar << "cero" << salto;
    finSi
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
