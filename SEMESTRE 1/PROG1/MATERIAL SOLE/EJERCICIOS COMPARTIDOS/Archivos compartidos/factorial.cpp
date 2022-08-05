#include <program1.h>
/**
*    Función recursiva que calcula el factorial de un entero no negativo.
*/

funcion largo fact(entero n) {
largo resul;
si(n > 0) entonces                                              // Paso recursivo
    resul = n * fact(n-1);
    sinoSi(n ES 0) entonces                                     // Caso base 
    resul = 1;
    sino                                                        // Error
    finSi
retorna(resul);
}
