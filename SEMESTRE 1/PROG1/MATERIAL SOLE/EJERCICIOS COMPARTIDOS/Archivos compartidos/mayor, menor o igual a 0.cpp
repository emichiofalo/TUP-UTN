// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Dado un número cualquiera, determinar si es positivo, negativo o cero.
*/
principal                                                       // Unidad de programa principal
real nro;
limpiar;                                                        // Limpia la pantalla.
leerM(nro,"Valor:");
mostrar << "El numero ingresado ";
si(nro > 0) entonces                                            // Si el número es positivo
    mostrar << "es positivo.";
    sinoSi(nro < 0) entonces                                    // sino, si es negativo
    mostrar << "es negativo.";
    sino                                                        // sino, es cero.
    mostrar << "es cero.";
    finSi;
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
