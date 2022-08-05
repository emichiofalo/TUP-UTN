// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: Dado un texto terminado en punto, determinar la cantidad de 'a'.
*/
principal                                                       // Unidad de programa principal
caracter car;                                                   // A leer
entero cantA = 0;                                               // A calcular
limpiar;                                                        // Limpia la pantalla.
iterar
    leeTecla(car);
    salirSi(car ES '.');
    si(car ES 'a') entonces
        cantA++;
        finSi;
    finIterar;
mostrar << salto << "La cantidad de 'a' del texto es " << cantA << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
