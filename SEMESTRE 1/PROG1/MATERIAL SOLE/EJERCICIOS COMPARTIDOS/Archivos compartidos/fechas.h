#ifndef FECHAS_H
#define FECHAS_H
estructura Fecha {
    Fecha();
    Fecha(entero);
    Fecha(entero,entero);
    Fecha(entero,entero,entero);
    Fecha(constante Fecha porRef);
    campo entero dia;
    campo entero mes;
    campo entero anio;
    procedimiento muestra();
    funcion cadena cadFecha();
    procedimiento leeFecha();
    funcion entero cantDias(Fecha);
    funcion entero cantDiasAnio();
    funcion logico esMenor(Fecha);
    funcion logico esMayor(Fecha);
    funcion logico esIgual(Fecha);
    funcion estatica Fecha hoy();
    procedimiento restaDias(entero);
    procedimiento sumaDias(entero);
    procedimiento restaMeses(entero);
    procedimiento sumaMeses(entero);
};
funcion logico esBisiesto(entero);
funcion entero cantDiasMes(entero,entero);
funcion entero cantAcDias(entero,entero);
funcion entero cantDias(entero,entero,entero);
funcion entero cantDiasAnio(entero);
#endif
