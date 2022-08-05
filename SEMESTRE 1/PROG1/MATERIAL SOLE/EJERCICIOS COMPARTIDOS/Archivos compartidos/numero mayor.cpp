// Archivo de traducci�n de seudoc�digo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Dada una secuencia de valores positivos, calcular el m�ximo de ellos.
*/
principal                                                       // Unidad de programa principal
real dato                                                       // Dato (a leer)
    ,maximo = (-1.0);                                           // Resultado (a calcular, el valor inicial no es un resultado v�lido)
limpiar;                                                        // Limpia la pantalla.
iterar                                                          // Inicio del bucle principal
    leerM(dato,"Valor:");                                       // Se lee un dato por vuelta
    salirSi(dato <= 0.0);                                       // y se sale si no es positivo.
    si(dato > maximo) entonces                                  // La condici�n se cumple la 1� vez y cada vez que lea uno mayor
        maximo = dato;                                          // a los anteriores y guarda el  nuevo valor m�ximo.
        finSi
    finIterar;
si(maximo NOES (-1.0)) entonces                                 // Si hay un valor calculado (v�lido)
    mostrar << "El maximo es " << maximo << salto;              // se muestra.    
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
