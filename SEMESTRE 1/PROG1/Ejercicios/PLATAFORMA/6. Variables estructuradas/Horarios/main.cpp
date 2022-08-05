/**
*    Enunciado: 
Datos: de un reloj de marcación. Se procesan diariamente a travÃ©s de ese dispositivo,
    53.000 registros, que son las marcaciones de todo el personal de la planta funcional.
    Estos registros indican solamente un punto en el tiempo, es decir que son irrepetibles. 
    Cada punto está asociado a la marcación proveniente de una tarjeta personal . 
    De este modo se identifica y relaciona al usuario de la misma con su respectivo número de tarjeta.
    Cada marcación está vinculada directamente a una fecha, hora, minuto y segundo.  
Salidas: 
    - Para cada usuario sus marcaciones.
      Código y fechas marcadas y las horas de entrada y salida de cada dí­a.
      Hay que tener en cuenta que debido a la sensibilidad que posee el reloj, es posible que una tarjeta 
      se marque más de una vez en un entorno de tiempo muy pequeño, por tal motivo se deben desechar todas 
      las marcaciones que sean inferiores o iguales a 5 minutos.
*/
#include <program1.h>
#include "tiempo.h"
#include "persona.h"
#include "marcacion.h"
#include "muestraV.h"
#include "palabrea.h"
#include "busquedabin.h"

procedimiento leeDatos(vectorDin(Marcacion) porRef vReloj,vectorDin(Persona) porRef vPerso) {
cadena renglon;
vectorDin(cadena) vPal;
logico esPrimero = VERDADERO;
Tiempo anterior;
Persona estaPersona(0,"Sin Apellido");
Tiempo esteTiempo;
Marcacion estaMarca;
largo cant = 0,posi;
iterar
    leeRenglon(renglon);
    salirSi(renglon ES "");
    vPal = palabrea(renglon);
//    muestraV(vPal);
    si(tamanio(vPal) < 9) entonces
        agregaEleVDin(vPal,"Sin");
        finSi
    estaPersona.ponePersona(aEntero(vPal[0]),vPal[8]);
    esteTiempo.poneTiempo(aEntero(vPal[1]),aEntero(vPal[2]),aEntero(vPal[3]),aEntero(vPal[4]),aEntero(vPal[5]),aEntero(vPal[6]));
    estaMarca.poneMarcacion(aEntero(vPal[0]),esteTiempo);
    si(esPrimero) entonces
        esPrimero = FALSO;
        agregaEleVDin(vPerso,estaPersona);
//        mostrar << "Agregado: " << estaPersona.cadPersona() << salto;
        sinoSi(tamanio(vPerso) ES 1) entonces
        si(estaPersona < primeroDelVec(vPerso)) entonces
            insertaEleVDin(vPerso,estaPersona);
//            mostrar << "Insertado: " << estaPersona.cadPersona() << salto;
            sinoSi(estaPersona > primeroDelVec(vPerso)) entonces
            agregaEleVDin(vPerso,estaPersona);
//            mostrar << "Agregado: " << estaPersona.cadPersona() << salto;
            finSi
        sino
        posi = posicionBin(vPerso,estaPersona);
        si(posi < tamanio(vPerso)) entonces
            si(estaPersona NOES vPerso[posi]) entonces
                intercalaEleVDin(vPerso,estaPersona,posi);
//                mostrar << "Intercalado: " << estaPersona.cadPersona() << salto;
                finSi
            sino
            agregaEleVDin(vPerso,estaPersona);
//            mostrar << "Agregado: " << estaPersona.cadPersona() << salto;
            finSi
        finSi
    posi = posicionBin(vReloj,estaMarca);
    si(posi < tamanio(vReloj)) entonces
        si(estaMarca NOES vReloj[posi]) entonces
            intercalaEleVDin(vReloj,estaMarca,posi);
//            mostrar << "Intercalado: " << estaMarca.cadMarca() << salto;
            finSi
        sino
        agregaEleVDin(vReloj,estaMarca);
//        mostrar << "Agregado: " << estaMarca.cadMarca() << salto;
        finSi
//    mostrar << (++cant) << ":"<< estaMarca.cadMarca() << salto;
    finIterar
}

principal                                                       // Unidad de programa principal
vectorDin(Persona) personal;
vectorDin(Marcacion) marcasReloj;
leeDatos(marcasReloj,personal);
entero tamP = tamanio(personal);
mostrar << "\n\nPersonal: ("<< tamP <<")" << salto;
paraCada(p,personal)
    mostrar << p.cadPersona() << salto;
    finParaCada
//entero tamR = tamanio(marcasReloj);
//mostrar << "\n\nRegistro del reloj: ("<< tamR <<")" << salto;
//Tiempo esteTiempo,tiempoAnt;
logico esPrimero;
//paraCada(m,marcasReloj)
//    esteTiempo = m.suTiempo();
//    si(esPrimero) entonces
//        esPrimero = FALSO;
//        tiempoAnt = esteTiempo;
//        finSi
//    mostrar << m.cadMarca() << ", lapso: "<< tiempoAnt.hmsHasta(esteTiempo) << salto;
//    tiempoAnt = esteTiempo;
//    finParaCada
//caracter c;leerM(c,"<Enter>");
mostrar << "\n\nMarcación por Persona:\n" << salto;
entero codPers;
largo lapso;
paraCada(p,personal)
    mostrar << "\nPersona: " << p.cadPersona() << salto;
    esPrimero = VERDADERO;
    codPers = p.suCodigo();
    Tiempo esteTiempo,tiempoAnt;
    logico esEntrada, esSalida, esRepetido;
    paraCada(m,marcasReloj)
        si(codPers ES m.suCodigo()) entonces
            esteTiempo = m.suTiempo();
            si(esPrimero) entonces
                esPrimero = FALSO;
                esEntrada = VERDADERO;
                esSalida = FALSO;
                esRepetido = FALSO;
                lapso = 0;
                sino
                lapso = tiempoAnt.segundosHasta(esteTiempo);
                si(lapso <= 300) entonces
                    esEntrada = FALSO;
                    esRepetido = VERDADERO;
                    esSalida = FALSO;
                    sinoSi(tiempoAnt.suFecha() ES esteTiempo.suFecha()) entonces
                    esEntrada = FALSO;
                    esRepetido = FALSO;
                    esSalida = VERDADERO;
                    sino
                    esEntrada = VERDADERO;
                    esRepetido = FALSO;
                    esSalida = FALSO;
                    finSi
                finSi
            mostrar << fSi(esEntrada,"Entrada: ",fSi(esSalida,"Salida: ",fSi(esRepetido,"Repetido: ","¿?: ")))
                    << m.suTiempo().cadTiempo();
//                    << m.cadMarca();
            si(NO esEntrada) entonces
                mostrar << ", lapso: " << tiempoAnt.hmsHasta(esteTiempo);
                finSi
            mostrar << salto;
            finSi
        tiempoAnt = esteTiempo;
        finParaCada
    finParaCada
//pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
