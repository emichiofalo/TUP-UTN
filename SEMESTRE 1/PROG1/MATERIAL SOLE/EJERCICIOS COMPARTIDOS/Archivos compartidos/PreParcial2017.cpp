#include <program1.h>                                           // Archivo de traducción de seudocódigo a C++
/**
*    Enunciado: Dado un texto terminado en punto, mostrar las palabras pal�ndromas.
*/
principal                                                       // Unidad de programa principal
caracter tecla                                                  // dato (a leer)
        ,tecAnt = ' ';                                          // teclazo anterior (a calcular)
cadena pal                                                      // palabra actual
      ,palReves                                                 // palabra actual (al rev�s)
      ,palindromas = "";                                        // resultado (a mostrar)
limpiar;                                                        // Limpia la pantalla.
iterar
    leeTecConEco(tecla);
    si(esComPal(tecAnt,tecla)) entonces                         // Si comienza una palabra
        pal = palReves = tecla;                                 // es con la tecla actual
        sinoSi(NO esSigno(tecla)) entonces                      // sino, si est� dentro de la palabra
        pal += tecla;                                           // se construye la palabra al derecho
        palReves = tecla + palReves;                            // y al rev�s;
        sinoSi(esFinPal(tecAnt,tecla) Y pal ES palReves) 
                                       entonces                 // sino, si termina una palabra (en la tecla anterior) y es pal�ndroma
        si(palindromas ES "") entonces                          // Si es la primera pal�ndroma
            palindromas = pal;                                  // se asigna,
            sino
            palindromas = palindromas + ", " + pal;             // sino, se agrega con una coma previa.
            finSi
        finSi
    salirSi(tecla ES '.');
    tecAnt = tecla;
    finIterar
si(palindromas NOES "") entonces
    mostrar << salto << "las pal�ndromas son: " << palindromas << salto;
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal

