#include <program1.h>
/**
*    Enunciado: Dada una fecha, calcular el número de días transcurridos desde el 31/12 del año anterior.
*/

#include "fechas.h"
#include "cadenas.h"
#include "leerVar.h"
#define entreMinMax(x,mini,maxi)  (fSi(((x) > (maxi)),(maxi),fSi(((x) < (mini)),(mini),(x))))

Fecha::Fecha() {
dia = numeroDiaHoy();
mes = numeroMesHoy();
anio = numeroAnioHoy();
}
Fecha::Fecha(entero d) {
mes = numeroMesHoy();
anio = numeroAnioHoy();
dia = entreMinMax(d,1,cantDiasMes(mes,anio));
}
Fecha::Fecha(entero d, entero m) {
anio = numeroAnioHoy();
mes = entreMinMax(m,1,12);
dia = entreMinMax(d,1,cantDiasMes(mes,anio));
}
Fecha::Fecha(entero d, entero m, entero a) {
dia = d;
mes = m;
anio = a;
}
Fecha::Fecha(constante Fecha porRef otraFecha) : dia(otraFecha.dia),mes(otraFecha.mes),anio(otraFecha.anio) {}

funcion logico Fecha::esMenor(Fecha otraFecha) {
logico resul = anio < otraFecha.anio O                                          // O es menor el año
              anio ES otraFecha.anio Y (mes < otraFecha.mes O                   // o siendo años iguales, es menor el mes
                                        mes ES otraFecha.mes Y dia < otraFecha.dia); // o siendo año y mes iguales, es menor el día.
regresa(resul);
};

funcion logico Fecha::esIgual(Fecha otraFecha) {
logico resul = anio ES otraFecha.anio Y mes ES otraFecha.mes Y dia ES otraFecha.dia; // Todo igual para ser cierto
regresa(resul);
};

funcion logico Fecha::esMayor(Fecha otraFecha) {
logico resul = NO (esMenor(otraFecha) O esIgual(otraFecha));                    // Si no es menor ni igual, es mayor.
regresa(resul);
}

funcion entero Fecha::cantDiasAnio() {
entero resul = fSi(esBisiesto(anio),366,365);
regresa(resul);
}
funcion entero Fecha::cantDias(Fecha otraFecha) {
Fecha estaFecha;                                                                // Copia la fecha actual
estaFecha.anio = anio;
estaFecha.mes = mes;
estaFecha.dia = dia;
entero resul = 0;
si(estaFecha.esMayor(otraFecha)) entonces
    resul = -otraFecha.cantDias(estaFecha);
    sinoSi(estaFecha.esMenor(otraFecha)) entonces
    mientras(otraFecha.anio > estaFecha.anio)                                   // mientras no llegue al año mayor,
        resul += estaFecha.cantDiasAnio();                                      //cuenta los días de ese año.
        estaFecha.anio++;                                                       // y suma un año más a la fecha actual
        finMientras                                                             // Sale con años iguales.
    si(estaFecha.mes <= otraFecha.mes) entonces
        mientras(otraFecha.mes > estaFecha.mes)                                 // Mientras no alcancemos el mes de otraFecha
            resul += cantDiasMes(estaFecha.mes,estaFecha.anio);
            estaFecha.mes++;
            finMientras                                                         // Sale con meses (y años) iguales
        sino                                                                    // estaFecha es mayor a otraFecha y 
        resul -= otraFecha.cantDias(estaFecha);                                 // debe descontar los días que se pasó
        finSi
    si(estaFecha.dia <= otraFecha.dia) entonces
        resul += otraFecha.dia - estaFecha.dia;
        sino
        resul -= otraFecha.cantDias(estaFecha);
        finSi
    finSi
regresa(resul);
}

procedimiento Fecha::leeFecha() {
leerM(anio,"Año:");
leerVar(mes,1,12,"Mes");
leerVar(dia,1,cantDiasMes(mes,anio),"Día");
}

funcion cadena Fecha::cadFecha() {
cadena resul= aCadena(dia)+"/"+aCadena(mes)+"/"+aCadena(anio);
regresa(resul);
}

procedimiento Fecha::muestra() {
mostrar << "Fecha:" << cadFecha() << salto;
}

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
regresa(resul);
}

funcion entero cantDias(entero d, entero m, entero a) {
entero resul = d + fSi(m > 1,cantAcDias(m-1,a),0);
regresa(resul);
}

funcion entera cantDiasAnio(entero anio) {
entero resul = fSi(esBisiesto(anio),366,365);
regresa(resul);
}

funcion Fecha Fecha::hoy() {
Fecha resul;
resul.dia = numeroDiaHoy();
resul.mes = numeroMesHoy();
resul.anio = numeroAnioHoy();
regresa (resul);
}
procedimiento Fecha::restaDias(entero cantidadEnDias) {
si(cantidadEnDias > 0) entonces
    dia -= cantidadEnDias;                                                      // calcula el nuevo día,
    mientras(dia < 1 )                                                          // y mientras se pase de principio de mes, 
        restaMeses(1);                                                          // y pasa al anterior,
        dia += cantDiasMes(mes,anio);                                           // sumando la cantidad de días de ese mes.
        finMientras
    
//    entero diasARestar = cantidadEnDias;
//    si(dia < diasARestar) entonces                                         // Si la cantidad excede el principio del mes,
//        diasARestar -= dia;                                                // resta todos los días de este mes,
//        restaMeses(1);                                                     // luego descuenta un mes
//        dia = cantDiasMes(mes,anio);                                       // y se ubica en el final del mes
//        mientras(diasARestar > cantDiasMes(mes,anio))                      // Bucle de resta por meses:
//            diasARestar -= dia;                                            // descuenta los días de ese mes
//            restaMeses(1);                                                 // y resta un mes (los días de cada mes).
//            dia = cantDiasMes(mes,anio);
//            finMientras                                                    // Sale cuando queda menos de un mes a restar.
//        dia -= diasARestar;                                                // Si resta más que los días de la fecha
//        si(dia <= 0) entonces                                              // pasa al mes anterior
//            restaMeses(1);                                                 // teniendo en cuenta si es el primero
//            dia += cantDiasMes(mes,anio);                                  // y finalmente descuenta esos días del último día del mes.
//            finSi
//        sinoSi(dia > diasARestar) entonces
//        dia -= diasARestar;
//        finSi
    sinoSi(cantidadEnDias < 0) entonces                                         // Si la cantidad es negativa,
    sumaDias(-cantidadEnDias);                                                  // debe sumarlos.
    finSi
}
procedimiento Fecha::sumaDias(entero cantidadEnDias) {
si(cantidadEnDias > 0) entonces                                                 // Si es positivo,
    dia += cantidadEnDias;                                                      // calcula el nuevo día,
    mientras(dia > cantDiasMes(mes,anio))                                       // y mientras se pase de fin de mes, 
        dia -= cantDiasMes(mes,anio);                                           // resta la cantidad de días de ese mes
        sumaMeses(1);                                                           // y pasa al siguiente.
        finMientras
    sinoSi(cantidadEnDias < 0) entonces                                         // Si la cantidad es negativa
    restaDias(-cantidadEnDias);                                                 // debe restarlos.
    finSi
}

procedimiento Fecha::sumaMeses(entero cantidadEnMeses) {
entero resto;
si(cantidadEnMeses > 0) entonces                                                // Si hay meses a sumar
    anio += cantidadEnMeses / 12;                                               // intenta primero descontar por años
    resto = cantidadEnMeses % 12;                                               // y lo que queda
    mes += resto;                                                               // se lo suma al mes actual
    si(mes > 12) entonces                                                       // y si se pasa del último,
        mes -= 12;                                                              // le resta 12
        anio++;                                                                 // y pasa al año siguiente.
        finSi
    sinoSi(cantidadEnMeses < 0) entonces
    restaMeses(-cantidadEnMeses);
    finSi
}

procedimiento Fecha::restaMeses(entero cantidadEnMeses) {
entero resto;
si(cantidadEnMeses > 0) entonces
    anio -= cantidadEnMeses / 12;
    resto = cantidadEnMeses % 12;
    mes -= resto;
    si(mes < 1) entonces
        mes += 12;
        anio--;
        finSi
    sinoSi(cantidadEnMeses < 0) entonces
    sumaMeses(-cantidadEnMeses);
    finSi
}