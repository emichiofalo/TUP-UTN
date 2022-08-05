// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: Dado un texto terminado en punto, encontrar la palabra más larga.
*/
principal                                                       // Unidad de programa principal
caracter tecla                                                  // A leer
        ,tecAnt = '*';                                          // Tecla anterior
cadena pal                                                      // Palabra actual
    ,palML = "";                                                // Palabra más larga
entero tam                                                      // Tamaño de la palabra actual
    ,tamML = 0;                                                 // Tamaño de la palabra más larga
limpiar;                                                        // Limpia la pantalla.
iterar
    leeTecla(tecla);                                            // Lee un caracter desde el teclado.
    si(esComPal(tecAnt,tecla)) entonces                         // Si es un comienzo de palabra
        pal = tecla;                                            // empieza en esa tecla
        tam = 1;                                                // y es el primer caracter (hasta ahora).
        sinoSi(NO esSigno(tecla)) entonces                      // Dentro de una palabra pero no al comienzo
        pal += tecla;                                           // se agrega el caracter a la palabra        
        tam++;                                                  // y se cuenta.
        sinoSi(esFinPal(tecAnt,tecla)) entonces                 // Final de palabra
        si(tam > tamML) entonces                                // y es la más larga hasta ahora
            palML = pal;                                        // se guarda como más larga
            tamML = tam;                                        // junto al tamaño.
            sinoSi(tam ES tamML) entonces                       // Es igual de larga que la más larga
            palML += ", " + pal;                                // y la agregamos a la respuesta.
            finSi;
        finSi;
    salirSi(tecla ES '.');                                      // Sale si es punto,
    tecAnt = tecla;                                             // sino, guarda la tecla actual como anterior de la siguiente.
    finIterar;
mostrar << salto;
si(tamML > 0) entonces
    mostrar << "La(s) palabra(s) más larga es(son): " << palML << salto;
    finSi;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
