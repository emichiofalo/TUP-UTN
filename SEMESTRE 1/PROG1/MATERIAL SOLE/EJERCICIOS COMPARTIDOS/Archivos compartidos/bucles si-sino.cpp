// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Se quiere calcular el estado academico de un estudiante a partir de sus evaluaciones árcial y global, sabiendo que:
    nota = (parcial+globlal*2) / 3 (ambas notas tienen que estar en un rango de 0 a 100%)
    Si nota >= 7            --> Promocionado
       nota >= 4 Y nota < 7 --> Regular
       nota < 4             --> Desaprobado
*/
principal                                                       // Unidad de programa principal
real notaPar, notaGlob;
entero notaFin;
limpiar;                                                        // Limpia la pantalla.
leerM(notaPar,"Parcial (0-100):");                              // Se lee la nota del parcial
si(notaPar >= 0.0 Y notaPar <= 100.0) entonces
    leerM(notaGlob,"Global (0-100):");                          // Lee la nota del global
    si(notaGlob >= 0.0 Y notaGlob <= 100.0) entonces
        notaFin = 0.5 + (notaPar + 2. * notaGlob) / 30.;        // Redonde a una escala 0-10
        si(notaFin >= 7) entonces
            mostrar << "Promocionado con " << notaFin;
            sinoSi(notaFin >= 4) entonces
            mostrar << "Regulariza.";
            sino
            mostrar << "Desaprobado.";
            finSi
        sino
        mostrar << "Nota errónea de Global...";
        finSi
    sino
    mostrar << "Nota errónea de Parcial...";
    finSi
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
