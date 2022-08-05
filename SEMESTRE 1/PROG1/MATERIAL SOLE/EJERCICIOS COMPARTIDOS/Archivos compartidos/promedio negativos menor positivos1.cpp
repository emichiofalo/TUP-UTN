// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Dada una secuencia de valores NO nulos, calcular el promedio de los negativos y el menor de los positivos.
*/
principal                                                       // Unidad de programa principal
real nro                                                        // Dato (a leer quizás varias veces)
    ,sumaNeg = 0.0                                              // Sumatoria de negativos
    ,menorPos;                                                  // Menor de los positivos (inicializado en un valor incorrecto como resultado)
logico hayPos = FALSO;                                          // Por ahora no hay positivos
entero cantNeg = 0;                                             // Ningún negativo hasta ahora
limpiar;                                                        // Limpia la pantalla.
iterar
    leerM(nro,"Valor:");
    salirSi(nro ES 0.0);                                        // Sale con nulo
    si(nro > 0) entonces                                        // Si es positivo
        si(nro < menorPos O NO hayPos) entonces                 // Si es el primer positivo o es menor que el que está
            hayPos = VERDADERO;                                 // ¡Ya hay!
            menorPos = nro;
            finSi
        sino                                                    // sino, es negativo
        cantNeg++;                                              // se cuenta un negativo más
        sumaNeg += nro;                                         // y se lo acumula.
        finSi
    finIterar;
si(cantNeg > 0) entonces
    mostrar << "El promedio de los negativos es " << sumaNeg / cantNeg << salto;
    finSi
si(hayPos) entonces
    mostrar << "El menor de los positivos es " << menorPos <<  salto;
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
