// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Dada una secuencia de valores positivos, sumarlos. (usando repetir)
*/
principal                                                       // Unidad de programa principal
real nro                                                        // Dato (a leer)
    ,suma = 0;                                                  // Resultado (a calcular)
limpiar;                                                        // Limpia la pantalla.
leerM(nro,"Valor:");
si(nro > 0) entonces
    repetir
        suma += nro;
        leerM(nro,"Valor:");
        hasta(nro <= 0);
    finSi
si(suma > 0.) entonces
    mostrar << "La suma de positivos vale " << suma;
    sino
    mostrar << "Secuencia vacia...";
    finSi
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
