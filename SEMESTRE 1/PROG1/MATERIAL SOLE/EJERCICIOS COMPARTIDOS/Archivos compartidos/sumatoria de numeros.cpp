// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Dada una secuencia de valores positivos, sumarlos.
*/
principal                                                       // Unidad de programa principal
real nro                                                        // Dato (a leer)
    ,suma = 0;                                                  // Resultado (a calcular)
limpiar;                                                        // Limpia la pantalla.
iterar
    leerM(nro,"Valor:");
    salirSi(nro <= 0.0);
    suma = suma + nro;
    finIterar;
si(suma > 0.) entonces
    mostrar << "La suma de positivos vale " << suma;
    sino
    mostrar << "Secuencia vacia...";
    finSi
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
