// Archivo de traducci�n de seudoc�digo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Dada la ecuaci�n  a * X**2 + b * X + c = 0, encontrar sus ra�ces.
*/
principal                                                       // Unidad de programa principal
real a,b,c,d;
limpiar;                                                        // Limpia la pantalla.
leerM(a,"a:");
leerM(b,"b:");
leerM(c,"c:");
si(a NOES 0.0) entonces                                         // 2� grado
    d = b * b - 4 * a * c;
    si(d > 0) entonces                                          // 2 ra�ces reales y distintas
        sinoSi(d < 0) entonces                                  // complejos conjugados
        sino                                                    // 2 ra�ces reales e iguales
        finSi
    sinoSi(b NOES 0.0) entonces                                 // 1� grado
    sinoSi(c ES 0.0) entonces                                   // Infinitas soluciones
    sino                                                        // Imposible soluci�n
    mostrar << "Solucion imposible.";
    finSi
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
