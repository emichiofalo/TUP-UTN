/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
#define cuadrado(x)     ((x)*(x))
/**
*    Enunciado: Dada una secuencia de puntos bidimensionales con coordenadas (x,y) dist2intas del centro de coordenadas, mostrar el punto más cercano
     al primero.
*/
principal                                                                            // Unidad de programa principal
real x                                                                               //Coordenada X de cada punto (dato a leer)
    ,y                                                                               //Coordenada Y de cada punto (dato a leer)
    ,x1                                                                              // Coordenada X del primer punto
    ,y1                                                                              // Coordenada Y del primer punto
    ,dist2                                                                           // dist2ancia al primer punto
    ,dist2Min;                                                                       // dist2ancia mínima al primer punto
entero cant = 0                                                                      // Cantidad de puntos leídos
    ,ptoMasCerca;                                                                    // punto más cercano (resultado a mostrar)
limpiar;                                                                             // Limpia la pantalla.
iterar
    leerM(x,"Coordenada X"<<cant+1<<":");                                                        // Lee las coordenadas X
    leerM(y,"Coordenada Y"<<cant+1<<":");                                                        // e Y
    salirSi(x ES 0.0 Y y ES 0.0);                                                    // y sale si es el centro de coordenadas.
    cant++;                                                                          // Hay uno o más puntos válidos
    segun (cant)                                                                     // Según sea el 1°, 2° o 3° o más...
        caso 1:                                                                      // Es el primer punto:
            x1 = x;                                                                  // y se deben recordar
            y1 = y;                                                                  // sus coordenadas.
        otroCaso 2:                                                                  // Es el 2° punto
            ptoMasCerca = cant;                                                      // es el más cercano hasta ahora,
            dist2Min = cuadrado(x - x1) + cuadrado(y - y1);                          // y debe calcularse el cuadrado de su distancia al 1°
        casoAsumido:                                                                 // Es el 3° o más...
            dist2 = cuadrado(x - x1) + cuadrado(y - y1);                             // y debe calcularse el cuadrado de su distancia al 1°
            si(dist2 < dist2Min) entonces                                            // Si hay un punto más cerca,
                ptoMasCerca = cant;                                                  // guardamos su identificación
                dist2Min = dist2;                                                    // y su distancia al cuadrado
                finSi
        finSegun
    finIterar
si(cant > 1) entonces                                                                // Si hay 2 o más puntos, hay resultado
    mostrar << "El punto más cercano es el " << ptoMasCerca << salto;                // y debe mostrarse.
    finSi
pausa;                                                                               // Pausa antes de finalizar. 
finPrincipal                                                                         // Fin de unidad de programa principal
