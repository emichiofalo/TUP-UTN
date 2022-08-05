/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada una secuencia de valores pares, mostrar el mayor.
*/
principal                                                       // Unidad de programa principal
entero nro                                                      // Dato (a leer)
      ,parMayor = 1;                                            // A calcular
limpiar;                                                        // Limpia la pantalla.
iterar
    leerM(nro,"Valor:");
    salirSi(esImpar(nro));
    si(nro > parMayor O parMayor ES 1) entonces
        parMayor = nro;
        finSi
    finIterar;
si(parMayor NOES 1) entonces
    mostrar << "El mayor de los pares ingresados es " << parMayor << salto;
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
