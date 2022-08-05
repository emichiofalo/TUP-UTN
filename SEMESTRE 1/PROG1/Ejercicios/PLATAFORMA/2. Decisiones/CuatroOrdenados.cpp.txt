// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: Dados 4 valores, mostrar: 1) el menor; 2) el 2° menor; 3) el 2° mayor; 4) el mayor.
*/
principal                                                       // Unidad de programa principal
real uno,dos,tres,cuatro;
limpiar;                                                        // Limpia la pantalla.
leerM(uno,"Valor 1:");
leerM(dos,"Valor 2:");
leerM(tres,"Valor 3:");
leerM(cuatro,"Valor 4:");
mostrar << "Datos: "<< uno << ", " << dos << ", " << tres << ", " << cuatro << ": ";
si(uno <= dos Y uno <= tres Y uno <= cuatro) entonces
    mostrar << uno << ", ";
    si(dos <= tres Y dos <= cuatro) entonces
        mostrar << dos << ", "; 
        si(tres <= cuatro) entonces
            mostrar << tres << ", " << cuatro;
            sino
            mostrar << cuatro << ", " << tres;
            finSi
        mostrar << salto;
        sinoSi(tres <= cuatro) entonces
        mostrar << tres << ", ";
        si(dos <= cuatro) entonces
            mostrar << dos << ", " << cuatro;
            sino
            mostrar << cuatro << ", " << dos;
            finSi
        mostrar << salto;
        sino
        mostrar << cuatro << ", ";
        si(dos <= tres) entonces
            mostrar << dos << ", " << tres;
            sino
            mostrar << tres << ", " << dos;
            finSi
        mostrar << salto;
        finSi
    sinoSi(dos <= tres Y dos <= cuatro) entonces
    mostrar << dos << ", ";
    si(uno <= tres Y uno <= cuatro) entonces
        mostrar << uno << ", "; 
        si(tres <= cuatro) entonces
            mostrar << tres << ", " << cuatro;
            sino
            mostrar << cuatro << ", " << tres;
            finSi
        mostrar << salto;
        sinoSi(tres <= cuatro) entonces
        mostrar << tres << ", ";
        si(uno <= cuatro) entonces
            mostrar << uno << ", " << cuatro;
            sino
            mostrar << cuatro << ", " << uno;
            finSi
        mostrar << salto;
        sino
        mostrar << cuatro << ", ";
        si(uno <= tres) entonces
            mostrar << uno << ", " << tres;
            sino
            mostrar << tres << ", " << uno;
            finSi
        mostrar << salto;
        finSi
    sinoSi(tres <= cuatro) entonces
    mostrar << tres << ", ";
    si(dos <= uno Y dos <= cuatro) entonces
        mostrar << dos << ", "; 
        si(uno <= cuatro) entonces
            mostrar << uno << ", " << cuatro;
            sino
            mostrar << cuatro << ", " << uno;
            finSi
        mostrar << salto;
        sinoSi(uno <= cuatro) entonces
        mostrar << uno << ", ";
        si(dos <= cuatro) entonces
            mostrar << dos << ", " << cuatro;
            sino
            mostrar << cuatro << ", " << dos;
            finSi
        mostrar << salto;
        sino
        mostrar << cuatro << ", ";
        si(dos <= uno) entonces
            mostrar << dos << ", " << uno;
            sino
            mostrar << uno << ", " << dos;
            finSi
        mostrar << salto;
        finSi
    sino
    mostrar << cuatro << ", ";
    si(dos <= uno Y dos <= tres) entonces
        mostrar << dos << ", "; 
        si(uno <= tres) entonces
            mostrar << uno << ", " << tres;
            sino
            mostrar << tres << ", " << uno;
            finSi
        mostrar << salto;
        sinoSi(uno <= tres) entonces
        mostrar << uno << ", ";
        si(dos <= tres) entonces
            mostrar << dos << ", " << tres;
            sino
            mostrar << tres << ", " << dos;
            finSi
        mostrar << salto;
        sino
        mostrar << tres << ", ";
        si(dos <= uno) entonces
            mostrar << dos << ", " << uno;
            sino
            mostrar << uno << ", " << dos;
            finSi
        mostrar << salto;
        finSi
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.