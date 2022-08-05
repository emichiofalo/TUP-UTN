// Archivo de traducción de seudocódigo a C++
/*
    Copiarlo: en Linux: /usr/local/include
              en Windows: c:\Archivos de Programa\Zinjai\MingW\Include
              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un conjunto de hasta 100 valores, calcular su desvio estandard
*/
procedimiento leerVar(entero porRef,entero,entero,cadena);
procedimiento leeVec(entero, real[]);
procedimiento muestraVec(entero, real[]);
funcion real desvEstandard(entero,real[]);
funcion real promedio(entero,real[]);

constante entero TAM = 100;

principal                                                       // Unidad de programa principal
real valor[TAM];
entero cant;
limpiar;                                                        // Limpia la pantalla.
leerVar(cant,10,1,"Cantidad de valores");
leeVec(cant,valor);
mostrar << "El desvio estandard es:" << desvEstandard(cant,valor) << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
    
funcion real desvEstandard(entero t, real v[]) {
real resul
    ,suma = 0.0
    ,pro = promedio(t,v);
entero i;
variar(i,0,t-1,1)
    suma += XalaY((v[i]-pro),2.);
    finVariar
resul = XalaY((suma/t),0.5);
retorna (resul);
}

funcion real promedio(entero t, real v[]) {
real resul = 0.0;
entero i;
variar(i,0,t-1,1)
    resul += v[i];
    finVariar
resul = resul/t;
retorna (resul);
}

procedimiento leerVar(entero porRef c, entero vMin, entero vMax, cadena mens) {
si(vMin <= vMax) entonces
    iterar
        leerM(c,mens<<": ");
        salirSi(vMin <= c Y c <= vMax);
        mostrar << "Valor fuera de rango." << salto;
        finIterar;
    sino
    leerVar(c,vMax,vMin,mens);
    finSi
}

procedimiento leeVec(entero t, real v[]) {
entero i;
variar(i,0,t-1,1)
    leerM(v[i],"Valor("<<i+1<<"): ");
    finVariar
}

procedimiento muestraVec(entero t, real v[]) {
entero i;
variar(i,0,t-1,1)
    mostrar << "Valor("<<i+1<<"): "<<v[i]<<tabulado;
    finVariar
mostrar << salto;
}
