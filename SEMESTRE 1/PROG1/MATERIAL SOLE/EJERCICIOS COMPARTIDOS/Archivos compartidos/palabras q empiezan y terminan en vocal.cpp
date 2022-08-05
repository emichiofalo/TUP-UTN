// Archivo de traducción de seudocódigo a C++
/*
    Copiarlo: en Linux: /usr/local/include
              en Windows: c:\Archivos de Programa\Zinjai\MingW\Include
              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un texto terminado en punto, mostrar las palabras que empiecen y terminen en vocal
*/
principal                                                       // Unidad de programa principal
caracter tecla                                                  // (a leer)
        ,tecAnt = '*';                                          // tecla anterior (inicializada en un signo cualquiera)
cadena pal                                                      // palabra actual
      ,palCTV = "";                                             // Palabras comenzadas y terminadas en vocal.
logico empiezaV;                                                 // ¿Empieza y termina en vocal?
limpiar;                                                        // Limpia la pantalla.
iterar                                                          // Bucle principal
    leeTecla(tecla);                                            // lee una tecla,
    si(esComPal(tecAnt,tecla)) entonces                         // Si es un comienzo de palabra,
        pal = tecla;                                            // y empieza en la tecla actual,
        empiezaV = esVocal(tecla);                              // ¿empieza en vocal?
        sinoSi(NO esSigno(tecla)) entonces                      // sino, si está dentro de una palabra,
        pal += tecla;                                           // agregamos el teclazo actual
        sinoSi(esFinPal(tecAnt,tecla)                           // sino, si finaliza una palabra
            Y empiezaV                                          // que empezó en vocal
            Y esVocal(tecAnt)) entonces                         // y termina en vocal:
        si(palCTV ES "") entonces                               // ¡Es la primera y única hasta ahora!
            palCTV = pal;
            sino                                                // sino, hay que agregarla
            palCTV += ", " + pal;                               // separada de la(s) anterior(es)
            finSi
        finSi;
    salirSi(tecla ES '.');                                      // sale si es un punto,
    tecAnt = tecla;                                             // guarda la tecla como anterior de la siguiente
    finIterar;
si(palCTV NOES "") entonces
    mostrar << salto << "Las palabras comenzadas y terminadas en vocal son: " << palCTV << salto;
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
