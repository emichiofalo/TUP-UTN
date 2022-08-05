// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Dada una secuencia de valores positivos, calcular el máximo de ellos.
*/
principal                                                       // Unidad de programa principal
real dato                                                       // Dato (a leer)
    ,maximo = (-1.0);                                           // Resultado (a calcular, el valor inicial no es un resultado válido)
limpiar;                                                        // Limpia la pantalla.
iterar                                                          // Inicio del bucle principal
    leerM(dato,"Valor:");                                       // Se lee un dato por vuelta
    salirSi(dato <= 0.0);                                       // y se sale si no es positivo.
    si(dato > maximo) entonces                                  // La condición se cumple la 1° vez y cada vez que lea uno mayor
        maximo = dato;                                          // a los anteriores y guarda el  nuevo valor máximo.
        finSi
    finIterar;
si(maximo NOES (-1.0)) entonces                                 // Si hay un valor calculado (válido)
    mostrar << "El maximo es " << maximo << salto;              // se muestra.    
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
