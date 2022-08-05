#include "leeVar.h"
#include "tiempo.h"
procedimiento Tiempo::leeTiempo() {
fecha.leeFecha();
leeVar(hora,0,23,"Hora:");
leeVar(minuto,0,59,"Minuto:");
leeVar(segundo,0,59,"Segundo:");
}
funcion logico Tiempo::operador ES(Tiempo otroTiempo) {
logico resul = fecha ES otroTiempo.fecha Y
               hora ES otroTiempo.hora Y
               minuto ES otroTiempo.minuto Y
               segundo ES otroTiempo.segundo;
regresa(resul);
};
funcion logico Tiempo::operador NOES(Tiempo otroTiempo) {
logico resul = NO (*this ES otroTiempo);
regresa(resul);
};
funcion logico Tiempo::operador <(Tiempo otroTiempo) {
logico resul = fecha <  otroTiempo.fecha O
               fecha ES otroTiempo.fecha Y (hora <  otroTiempo.hora O 
                                           (hora ES otroTiempo.hora Y (minuto <  otroTiempo.minuto O
                                                                      (minuto ES otroTiempo.minuto Y 
                                                                            segundo < otroTiempo.segundo))));
regresa(resul);
};
funcion logico Tiempo::operador <=(Tiempo otroTiempo) {
logico resul = NO (*this > otroTiempo);
regresa(resul);
};
funcion logico Tiempo::operador >(Tiempo otroTiempo) {
logico resul = fecha >  otroTiempo.fecha O
               fecha ES otroTiempo.fecha Y (hora >  otroTiempo.hora O 
                                           (hora ES otroTiempo.hora Y (minuto >  otroTiempo.minuto O
                                                                      (minuto ES otroTiempo.minuto Y 
                                                                            segundo > otroTiempo.segundo))));
regresa(resul);
};
funcion logico Tiempo::operador >=(Tiempo otroTiempo){
logico resul = NO (*this < otroTiempo);
regresa(resul);
};
funcion cadena Tiempo::cadTiempo() {
cadena resul = fecha.cadFecha() + " - " + 
                aCadena(hora,"00") + ":" +
                aCadena(minuto,"00") + ":" +
                aCadena(segundo,"00");
regresa(resul);
}    

procedimiento Tiempo::operador ++() {
segundo++;
si(segundo >= 60) entonces
    segundo = 0;
    minuto++;
    si(minuto >= 60) entonces
        minuto = 0;
        hora++;
        si(hora >= 24) entonces
            hora = 0;
            ++fecha;
            finSi
        finSi
    finSi
};

funcion Tiempo Tiempo::operador ++(entero e) {
Tiempo resul (*this);
operador ++ ();
regresa(resul);
};

procedimiento Tiempo::operador --() {
segundo--;
si(segundo < 0) entonces
    segundo = 59;
    minuto--;
    si(minuto < 0) entonces
        minuto = 59;
        hora--;
        si(hora < 0) entonces
            hora = 23;
            --fecha;
            finSi
        finSi
    finSi
};
 
funcion Tiempo Tiempo::operador --(entero e) {
Tiempo resul (*this);
operador -- ();
regresa(resul);
};

funcion Tiempo Tiempo::operador +(largo segs) {
Tiempo resul (*this);
si(segs > 0) entonces
    mientras(segs >= 86400)
        ++resul.fecha;
        segs -= 86400;
        finMientras
    mientras(segs >= 3600)
        ++resul.hora;
        si(resul.hora > 23) entonces
            ++resul.fecha;
            resul.hora = 0;
            finSi
        segs -= 3600;
        finMientras
    mientras(segs > 0)
        ++resul;
        segs--;
        finMientras
    sinoSi(segs < 0) entonces
    resul = resul - (-segs);
    finSi
regresa(resul);
};

funcion Tiempo Tiempo::operador -(largo segs) {
Tiempo resul (*this);
si(segs > 0) entonces
    mientras(segs >= 86400)
        --resul.fecha;
        segs -= 86400;
        finMientras
    mientras(segs >= 3600)
        --resul.hora;
        si(resul.hora < 0) entonces
            --resul.fecha;
            resul.hora = 23;
            finSi
        segs -= 3600;
        finMientras
    mientras(segs > 0)
        --resul;
        segs--;
        finMientras
    sinoSi(segs < 0) entonces
    resul = resul + (-segs);
    finSi
regresa(resul);
};

//funcion Tiempo Tiempo::operador +=(largo segs) {
//Tiempo resul (*this);
//resul = (resul + segs);
//regresa(resul);
//};
//
//funcion Tiempo Tiempo::operador -=(largo segs) {
//Tiempo resul (*this);
//resul = (resul - segs);
//regresa(resul);
//};

Tiempo::Tiempo() : fecha(0,0,0) {
hora = 0;
minuto = 0;
segundo = 0;
};    
Tiempo::Tiempo(entero a, entero me, entero d,entero h, entero m, entero s) : fecha(a,me,d) {
hora = h;
minuto = m;
segundo = s;
};
procedimiento Tiempo::poneTiempo(entero a, entero me, entero d,entero h, entero m, entero s) {
fecha = Fecha(a,me,d);
hora = h;
minuto = m;
segundo = s;
};
Tiempo::Tiempo(constante Tiempo porRef inicial) : fecha(inicial.fecha){
hora = inicial.hora;
minuto = inicial.minuto;
segundo = inicial.segundo;
}
funcion largo Tiempo::segundosHasta(Tiempo otroTiempo) {
largo resul = 0;
Tiempo esteTiempo = (*this);
si(esteTiempo < otroTiempo) entonces
    mientras((esteTiempo+86400) < otroTiempo)
        esteTiempo.fecha++;
        resul += 86400;
        finMientras
    mientras((esteTiempo+3600) < otroTiempo)
        esteTiempo = (esteTiempo + 3600);
        resul += 3600;
        finMientras
    mientras(esteTiempo < otroTiempo)
        esteTiempo++;
        resul++;
        finMientras
    sinoSi(esteTiempo > otroTiempo) entonces
    resul = -otroTiempo.segundosHasta(esteTiempo);
    finSi
regresa(resul);
};
funcion cadena Tiempo::hmsHasta(Tiempo otroTiempo) {
largo lapso = segundosHasta(otroTiempo);
entero horas = lapso / 3600;
entero minutos = (lapso - horas * 3600) / 60;
entero segundos = lapso - horas * 3600 - minutos * 60;
cadena resul = aCadena(horas,"00") + " horas, " + 
               aCadena(minutos,"00") + " minutos, " +
               aCadena(segundos,"00") + " segundos.";
regresa(resul);
}

funcion Fecha Tiempo::suFecha() {
Fecha resul = fecha;
regresa(resul);
}