/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada una secuencia de valores impares, sumarlos.
*/
principal                                                       // Unidad de programa principal
entero nro
      ,suma = 0
      ,cant = 0;
limpiar;                                                        // Limpia la pantalla.
iterar
    leerM(nro,"Valor:");
    salirSi(esPar(nro));
    suma += nro;
    cant++;
    finIterar;
si(cant > 0) entonces
    mostrar << "La sumatoria de " << cant << " impares es:" << suma << salto;
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
