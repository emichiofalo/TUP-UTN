// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Bucle infinito aparentemente correcto
*/
principal                                                       // Unidad de programa principal
real nro
    ,suma = 0.0;
limpiar;                                                        // Limpia la pantalla.
repetir
    leerM(nro,"Valor:");                                        // cualquier nro
    suma += nro;                                                // suma ><= 0
    mostrar << "Hasta ahora:" << suma << salto;                 // muestra la sumatoria...
    hasta (suma < 0);                                           // Sale si la sumatoria es positiva.
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
