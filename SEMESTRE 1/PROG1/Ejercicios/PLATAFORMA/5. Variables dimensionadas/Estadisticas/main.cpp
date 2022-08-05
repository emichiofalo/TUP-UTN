#include <program1.h>
#include "muestraV.h"
/**
*    Enunciado: Dado un conjunto de hasta 10 valores, calcular su desvío estándard.
*/
plantilla(Tipo)
funcion Tipo promedio(vectorDin(Tipo));

plantilla(Tipo)
funcion Tipo desvioStandard(vectorDin(Tipo));

plantilla(Tipo)
procedimiento leerVD(vectorDin(Tipo) porRef);

plantilla(Tipo)
procedimiento leerValor(Tipo porRef,Tipo,Tipo,cadena);

principal                                                       // Unidad de programa principal
entero cantidad;
limpiar;                                                        // Limpia la pantalla.
leerValor(cantidad,2,10,"Cantidad de valores:");
vectorDin(real) datos(cantidad);
leerVD(datos);
//muestraV(datos);
mostrar << desvioStandard(datos) << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

plantilla(Tipo)
procedimiento leerVD(vectorDin(Tipo) porRef v) {
paraCada(ele,v)
    leerM(ele,"Valor:");
    finPara
}

plantilla(Tipo)
procedimiento leerValor(Tipo porRef variable, Tipo vMin, Tipo vMax, cadena mens) {
si(vMin <= vMax) entonces
    iterar
        leerM(variable,mens);
        salirSi(vMin <= variable Y variable <= vMax);
        mostrar << "¡Debe estar entre " << vMin << " y " << vMax << "!\n";
        finIterar
    sino
    leerValor(variable,vMax,vMin,mens);
    finSi
}

plantilla(Tipo)
funcion Tipo promedio(vectorDin(Tipo) v) {
Tipo resul = 0.0;
paraCada(x,v)
    resul += x;
    finPara
resul = (resul/tamanio(v));
regresa(resul);
}

plantilla(Tipo)
funcion Tipo desvioStandard(vectorDin(Tipo) v) {
Tipo resul = 0.0
    ,mediaArit = promedio(v);
paraCadaValor(x,v)
    resul += cuadrado(x-mediaArit);
    finPara
resul = XalaY((resul/tamanio(v)),0.5);
regresa(resul);
}