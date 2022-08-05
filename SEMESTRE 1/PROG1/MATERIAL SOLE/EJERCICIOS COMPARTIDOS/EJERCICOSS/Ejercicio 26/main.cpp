/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dada una fecha, calcular el número de días transcurridos desde el 31/12 del año anterior.
*/

funcion logico esBisiesto(entero a) {
logico resul = esMult(a,4) Y 
            NO esMult(a,100) O
               esMult(a,400);
regresa (resul);
}
funcion entero cantDiasMes(entero m, entero a) {
entero resul;
segun(m)
    caso 1      :   resul = 31;
    otroCaso 2  :   resul = fSi(esBisiesto(a),29,28);
    otroCaso 3  :   resul = 31;
    otroCaso 4  :   resul = 30;
    otroCaso 5  :   resul = 31;
    otroCaso 6  :   resul = 30;
    otroCaso 7  :   resul = 31;
    otroCaso 8  :   resul = 31;
    otroCaso 9  :   resul = 30;
    otroCaso 10 :   resul = 31;
    otroCaso 11 :   resul = 30;
    otroCaso 12 :   resul = 31;
    casoAsumido :   mostrar << "ERROR" << salto;
    finSegun;
regresa(resul);
}

funcion entero cantAcDias(entero m, entero a) {
entero resul;
si(m > 1) entonces
    resul = cantDiasMes(m,a) + cantAcDias(m-1,a);
    sino
    resul = cantDiasMes(1,a);
    finSi
}

funcion entero cantDias(entero d, entero m, entero a) {
entero resul = d + fSi(m > 1,cantAcDias(m-1,a),0);
regresa(resul);
}

principal                                                       // Unidad de programa principal
entero d,m,a;
limpiar;                                                        // Limpia la pantalla.
leerM(a,"Anio:");
leerM(m,"Mes (1 a 12):");
si(1 <= m Y m <= 12) entonces
    leerM(d,"Dia:");
    si(1 <= d Y d <= cantDiasMes(m,a)) entonces
        mostrar << cantDias(d,m,a) << salto;
        sino
        mostrar << "Dia inválido "<< salto;
        finSi
    sino
    mostrar << "Mes invalido "<< salto;
    finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
