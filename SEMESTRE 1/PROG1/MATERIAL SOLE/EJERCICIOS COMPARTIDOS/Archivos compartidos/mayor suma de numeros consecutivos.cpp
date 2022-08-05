// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Dada una secuencia de valores no nulos, encontrar la mayor suma de dos consecutivos.
*/
principal                                                       // Unidad de programa principal
real nro                                                        // Dato (a leer)
    ,ant1 = 0                                                   // anterior al actual  
    ,ant2 = 0                                                   // anterior al anterior  
    ,sumaMax                                                    // Suma máxima (inicialmente indefinida)
    ,suma;                                                      // Suma actuak (inicialmente indefinida)
limpiar;                                                        // Limpia la pantalla.
iterar
    leerM(nro,"Valor:");
    salirSi(nro ES 0.0);
    suma = nro + ant1;                                          // Sumo el valor actual al anterior
    si(ant2 NOES 0) entonces                                    // Hay por lo menos 3 no nulos (2 sumas a comparar)
        si(suma > sumaMax) entonces
            sumaMax = suma;
            finSi
        sinoSi(ant1 NOES 0) entonces                            // Hay 2 valores no nulos (se inicializa sumaMax)
        sumaMax = suma;                                         // y la suma (única) es la máxima hasta ahora.
        sino                                                    // Hay un único no nulo (nro)
        finSi
    ant2 = ant1;
    ant1 = nro;
    finIterar;
si(ant2 NOES 0) entonces
    mostrar << "La suma máxima de dos consecutivos es: " << sumaMax;
    sino
    mostrar << "No hay suficientes datos para calcular...";
    finSi
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
