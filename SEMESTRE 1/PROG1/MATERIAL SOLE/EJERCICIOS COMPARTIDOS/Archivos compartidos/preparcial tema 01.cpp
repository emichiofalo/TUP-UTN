// Archivo de traducción de seudocódigo a C++
/*
    Copiarlo: en Linux: /usr/local/include
              en Windows: c:\Archivos de Programa\Zinjai\MingW\Include
              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> (que asume la ubicación normal)
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada una serie de puntos en coordenadas polares:
    1) Calcular distancia promedio (si hay)
    2) Transformar a cartesianas
*/
principal                                                       // Unidad de programa principal
real distancia,angulo                                           // (a leer)
    ,sumaDist = 0.0;                                            // Acumulador de distancias (a calcular)
entero cantAnt = 0;                                             // Contador (a calcular)
limpiar;                                                        // Limpia la pantalla.
mostrar << "Ingrese pares (distancia,angulo). Una distancia no positiva termina el ingreso..." << salto;
iterar
    leerM(distancia,"Distancia("<< (cantAnt+1) <<"): ");        // Lee distancia    
    salirSi(distancia <= 0.0);                                  // Sale por distancia no positiva
    sumaDist += distancia;                                      // la acumula
    cantAnt++;                                                  // y la cuenta.
    repetir
        leerM(angulo,"Angulo("<<cantAnt<<"): ");
        hasta (0.0 <= angulo Y angulo < 360.0);
    mostrar << tabulado << "en cartesianas: X=" << distancia*coseno(radianes(angulo)) 
            << tabulado <<               ", Y=" << distancia*seno(radianes(angulo)) 
        << salto;
    finIterar;
si(cantAnt > 0) entonces                                        // Si hay antenas, hay promedio.
    mostrar << "La distancia promedio es " << sumaDist / cantAnt << salto;
    finSi;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
