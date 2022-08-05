// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: Dado un texto terminado en punto, encontrar la palabra con más vocales.
*/
principal                                                       // Unidad de programa principal
caracter tecla                                                  // Tecla (a leer)    
        ,tecAnt = '-';                                          // Tecla anterior (la del 1° inicializado en cualquier signo)
cadena pal                                                      // Palabra actual
      ,palMV = "";                                              // Palabra con más vocales
entero cantV                                                    // Cantidad de vocales
      ,cantVMax = 0;                                            // Cantidad de vocales máxima
limpiar;                                                        // Limpia la pantalla.
iterar
    leeTecla(tecla);
    si(esComPal(tecAnt,tecla)) entonces                         // Si es un comienzo de palabra
        pal = tecla;                                            // y sólo contiene la tecla actual
        cantV = fSi(esVocal(tecla),1,0);                        // y hay una o ninguna vocal.
        sinoSi(NO esSigno(tecla)) entonces                      // sino si está dentro de la palabra
        pal += tecla;                                           // guardo la tecla actual al final de la palabra actual
        si(esVocal(tecla)) entonces                             // y si es una vocal,
            cantV++;                                            // se cuenta.
            finSi;
        sinoSi(esFinPal(tecAnt,tecla)) entonces                 // sino si finalizó una palabra en el caracter anterior
        si(cantV > cantVMax) entonces                           // si es la que tiene más vocales
            palMV = pal;                                        // se guarda la palabra recién finalizada
            cantVMax = cantV;                                   // y la cantidad de vocales que tenía.
            sinoSi(cantV ES cantVMax Y cantV > 0) entonces      // Hay una palabra con igual cantidad de vocales que la que más tenía:
            palMV += ", " + pal;
            finSi;
        finSi;
    salirSi(tecla ES '.');
    tecAnt = tecla;                                             // Tecla anterior a la actual (para la vuelta siguiente)
    finIterar;
si(cantVMax > 0) entonces
    mostrar << salto << "La(s) palabra(s) con mas vocales es(son): " << palMV << salto;
    finSi;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
