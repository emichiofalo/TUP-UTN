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

procedimiento leeDatos(vectorDin(Marcacion) porRef vReloj,vectorDin(Persona) vPerso) {
cadena renglon;
vectorDin(cadena) vPal;
logico esPrimero = VERDADERO;
Marcacion estaMarca;
Tiempo anterior;
iterar
    leeRenglon(cin,renglon);
    salirSi(renglon ES "");
    vPal = palabrea(renglon);
    muestraV(vPal);
    Persona estaPersona(aEntero(vPal[0]),vPal[8]);
    si(esPrimero) entonces
        sino
        finSi
    esPrimero = FALSO;
    finIterar
//muestraV(vReloj);
}

principal                                                       // Unidad de programa principal
vectorDin(Persona) personal;
//iterar
//    Persona estaPersona;
//    salirSi(estaPersona.sinApellido());
//    agregaEleVDin(personal,estaPersona);
//    finIterar
//paraCada(p,personal)
//    mostrar << p.cadPersona() << salto;
//    finParaCada
//Tiempo anterior(2000,1,1,0,0,0),inicial(anterior);
vectorDin(Marcacion) marcasReloj;
leeDatos(marcasReloj,personal);
//logico esPrimero = VERDADERO;
//iterar
//    Marcacion estaMarca(esPrimero,anterior);
//    esPrimero = FALSO;
//    salirSi(estaMarca.suCodigo() ES (-1));
//    agregaEleVDin(marcasReloj,estaMarca);
//    anterior = estaMarca.suTiempo();
//    finIterar
mostrar << "Registro del reloj:" << salto;
paraCada(m,marcasReloj)
    mostrar << personal[m.suCodigo()].cadPersona() + ": " + m.cadMarca() << salto;
    finParaCada
//entero cod = 0;
//mostrar << "Registro del Personal:" << salto;
//paraCada(p,personal)
//    logico esPrimero = VERDADERO;
//    anterior = inicial;
//    mostrar << p.cadPersona() << ":" << salto;
//    paraCada(m,marcasReloj)
//        si(cod ES m.suCodigo()) entonces
//            mostrar << m.cadMarca() << "<-- ";
//            si(esPrimero) entonces
//                mostrar << "Inicial.\n";
//                esPrimero = FALSO;
//                sino
//                largo lapso = anterior.segundosHasta(m.suTiempo());
//                si(lapso < 300) entonces
//                    mostrar << "Repetida con " << anterior.cadTiempo() << salto;
//                    sinoSi(lapso < 50000) entonces
//                    mostrar << "Posible salida de la entrada: " << anterior.cadTiempo() << salto;
//                    sino
//                    mostrar << "Registro anterior: " << anterior.cadTiempo() << salto;
//                    finSi
//                finSi
//            anterior = m.suTiempo();
//            finSi
//        finParaCada
//    cod++;
//    finParaCada
//Tiempo t1,t2;
//limpiar;                                                        // Limpia la pantalla.
//t1.leeTiempo();
//t2.leeTiempo();
//mostrar << t1.cadTiempo() << tabulado << t2.cadTiempo() << salto;
//mostrar << t1.cadTiempo() << " < " << t2.cadTiempo() << ": " << SIoNO(t1 < t2) << salto;
//mostrar << t1.cadTiempo() << " > " << t2.cadTiempo() << ": " << SIoNO(t1 > t2) << salto;
//mostrar << t1.cadTiempo() << " <= " << t2.cadTiempo() << ": " << SIoNO(t1 <= t2) << salto;
//mostrar << t1.cadTiempo() << " >= " << t2.cadTiempo() << ": " << SIoNO(t1 >= t2) << salto;
//mostrar << t1.cadTiempo() << " ES " << t2.cadTiempo() << ": " << SIoNO(t1 ES t2) << salto;
//mostrar << t1.cadTiempo() << " NOES " << t2.cadTiempo() << ": " << SIoNO(t1 NOES t2) << salto;
//mostrar << "Desde " << t1.cadTiempo() << " a " << t2.cadTiempo() << salto;
//mostrar << " hay " << t1.segundosHasta(t2) << salto;
//Persona x;

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
