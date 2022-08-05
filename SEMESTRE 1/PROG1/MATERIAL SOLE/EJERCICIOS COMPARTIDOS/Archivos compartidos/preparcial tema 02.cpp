// Archivo de traducción de seudocódigo a C++
/*
    Copiarlo: en Linux: /usr/local/include
              en Windows: c:\Archivos de Programa\Zinjai\MingW\Include
              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada una secuencia de coordenadas cartesianas, calcular:
    1) Sumatoria de distancias de los puntos del cuadrante 2
    2) Coordenadas polares de cada punto
*/
principal                                                       // Unidad de programa principal
real x,y                                                        // (a leer)
    ,dist,sumaDist = 0.0;                                       // (a calcular)
limpiar;                                                        // Limpia la pantalla.
iterar
    leerM(x,"X: ");
    leerM(y,"Y: ");
    salirSi(x ES 0.0 Y y ES 0.0);                               // Sale si es el centro de coordenadas
    dist = raiz2(x * x + y * y);                                // Se calcula la distancia
    si(x <= 0.0 Y y >= 0) entonces                              // y si está en el 2° cuadrante, 
        sumaDist += dist;                                       // se acumula.
        finSi
    mostrar << " en polares:  Distancia = " << dist             // Se muestran las coordenadas polares: distancia    
            << ", Ángulo:" << grados360(atan2(y,x)) << salto;   // y ángulo (0° <= ngulo <= 360°)
    finIterar;
si(sumaDist > 0.0) entonces                                     // Hay al menos un punto en el cuadrante 2
    mostrar << "La suma de distancias en el cuadrante 2 es " << sumaDist << salto;
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
