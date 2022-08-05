// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: Dada una secuencia de no nulos, calcular el promedio de los negativos.
*/
principal                                                       // Unidad de programa principal
real nro                                                        // Dato (a leer)
    ,suma = 0.0;                                                // Sumatoria (a calcular, inicializado en 0)
entero cantNeg = 0;                                             // Contador de negativos (ninguno hasta ahora)
limpiar;                                                        // Limpia la pantalla.
iterar                                                          // Bucle principal
    leerM(nro,"Valor:");                                        // Lee el dato (cualquier valor)
    salirSi(nro ES 0.0);                                        // Sale si es cero,
    si(nro < 0.0) entonces                                      // sino, si es negativo
        suma += nro;                                            // se acumula en la sumatoria
        cantNeg++;                                              // y se cuenta.
        finSi;
    finIterar;
si(cantNeg > 0) entonces                                        // Si hay uno o más negativos, muestra el promedio
    mostrar << "El promedio de los " << cantNeg << " negativos es " << (suma / cantNeg) << salto;
    finSi;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
