/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada la fecha de hoy, obtener las fechas retrocediendo de a 100 días hasta llegar a 2500 días atrás.
*/
#include "../fechas.h"
#include "../cadenas.h"
#define fechaDeHoy()           aCadena(numeroDiaHoy())+"/"+aCadena(numeroMesHoy())+"/"+aCadena(numeroAnioHoy())

constante entero MAXIMO = 25;

principal                                                       // Unidad de programa principal
Fecha f;
entero d,cantD = 100;
limpiar;                                                        // Limpia la pantalla.
mostrar << cadLargaAhora() << salto;
clicks c = clock();
f.muestra();
//leerM(cantD,"Incremento en días:");
variar(d,0,MAXIMO,1)
    f.restaDias(cantD);
    f.muestra();
    finVariar
mostrar << "Consumió " << clock()-c << " clicks... en llegar a " << d << "\n";
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
