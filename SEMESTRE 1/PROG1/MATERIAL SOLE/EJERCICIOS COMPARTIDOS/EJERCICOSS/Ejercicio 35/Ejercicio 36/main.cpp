/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un texto terminado en punto, mostrar las palabras palíndromas
*/
principal                                                                            // Unidad de programa principal
caracter tecla                                                                       // Dato (a leer)
        ,teclaAnt = ' ';                                                             // Tecla anterior
cadena pal                                                                           // Palabra actual (al derecho)
      ,palReves                                                                      // Palabra actual (al revés)
      ,palindromas = "";                                                             // Resultado (a mostrar: colección de palabras palíndromas)
logico esPlural = FALSO;
limpiar;                                                                             // Limpia la pantalla.
mostrar << "Ingrese un texto terminado en punto:" << salto;
iterar
    leeTecla(tecla);                                                                 // Lee un teclazo
    si(esComPal(teclaAnt,tecla)) entonces                                            // Empieza una palabra
        pal = palReves = tecla;                                                      // con el primer teclazo.
        sinoSi(NO esSigno(tecla)) entonces                                           // Dentro de una palabra
        pal += tecla;                                                                // agrega la tecla al final
        palReves = tecla + palReves;                                                 // inserta la tecla al principio.
        sinoSi(esFinPal(teclaAnt,tecla)) entonces                                    // Finaliza una palabra
        si(pal ES palReves) entonces                                                 // ¡Es palíndroma!
            si(palindromas ES "") entonces                                           // Es la primera
                palindromas = pal;                                                   // y debe guardarse,
                sino                                                                 // sino, debe
                palindromas += ","+pal;                                              // añadirse separada por una coma de la anterior.
                esPlural = VERDADERO;                                                // Y hay más de una palabra
                finSi
            finSi
        finSi
    salirSi(tecla ES '.');                                                           // Sale si es punto
    teclaAnt = tecla;                                                                // La tecla de esta vuelta es la anterior de la tecla siguiente
    finIterar
si(palindromas NOES "") entonces
    si(esPlural) entonces
        mostrar << salto << "Las palabras pal�ndromas son: \"" << palindromas << "\"" << salto;
        sino
        mostrar << salto << "La palabra pal�ndroma es: \"" << palindromas << "\"" << salto;
        finSi
    finSi
pausa;                                                                               // Pausa antes de finalizar. 
finPrincipal                                                                         // Fin de unidad de programa principal
