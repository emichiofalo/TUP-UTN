// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Dada una secuencia de valores impares, mostrar el mayor de ellos (usando mientras).
*/
principal                                                       // Unidad de programa principal
entero nro                                                      // Dato (a leer)
    ,imparMax = 0;                                              // Resultado (a calcular)
limpiar;                                                        // Limpia la pantalla.
leerM(nro,"Número:");
mientras(nro / 2 * 2 NOES nro)
    si(nro > imparMax O imparMax ES 0) entonces                 // Si es el más grande de los impares,
        imparMax = nro;                                         // lo sustituye.
        finSi;
    leerM(nro,"Número:");
    finMientras;
si(imparMax NOES 0) entonces                                    // Si hay al menos un impar,
    mostrar << "El mayor de los impares es: " << imparMax;      // muestra el mayor de ellos,
    sino                                                        // sino
    mostrar << "Secuencia vacía...";                            // es que no había ni un impar...
    finSi;
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
