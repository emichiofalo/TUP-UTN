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
mostrar << "Calculando raices de "<< a << " * X**2 + " << b << " * X + " << c << " = 0:" << salto;
si(a NOES 0.0) entonces                                         // 2� grado
    d = b * b - 4 * a * c;
    segun(signo(d)+2)                                           // 1 <= signo(d)+2 <= 3
        caso 1:                                                 // d < 0
        mostrar << "Raiz 1: (" << (-b) / (2 * a) << ";" <<  raiz2(-d) / (2 * a) << "i)" << salto;
        mostrar << "Raiz 2: (" << (-b) / (2 * a) << ";" << -raiz2(-d) / (2 * a) << "i)" << salto;
        casoAsumido:                                            // d > 0
        mostrar << "Raiz 1: " << (-b+raiz2(d)) / (2 * a) << salto;
        mostrar << "Raiz 2: " << (-b-raiz2(d)) / (2 * a) << salto;
        finSegun
    sinoSi(b NOES 0.0) entonces                                 // 1� grado
    mostrar << "Raiz 1: " << (-c) / b << salto;
    sinoSi(c ES 0.0) entonces                                   // Infinitas soluciones
    mostrar << "Infinitas soluciones.";
    sino                                                        // Imposible soluci�n
    mostrar << "Solucion imposible.";
    finSi
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
