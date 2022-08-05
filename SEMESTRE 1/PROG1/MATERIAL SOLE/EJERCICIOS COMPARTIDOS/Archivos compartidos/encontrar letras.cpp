// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: Dado un texto terminado en punto, contar la cantidad de 'a'.
*/
principal                                                       // Unidad de programa principal
caracter tecla;                                                 // Dato (a leer)
entero cantA = 0;                                               // Resultado (a calcular, por ahora ninguna 'a')
limpiar;                                                        // Limpia la pantalla.
iterar                                                          // Bucle principal
    leeTecla(tecla);                                            // Lee una tecla y
    salirSi(tecla ES '.');                                      // sale si es un punto.
    si(tecla ES 'a') entonces
        cantA++;
        finSi
    finIterar;
mostrar << salto << "El texto ingresado tiene " << cantA << " letras 'a'..." << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
