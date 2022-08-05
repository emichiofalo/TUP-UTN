/*
program1.h es el archivo de traducción de seudocódigo a C++
Copiarlo (en Linux): /usr/local/include
o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
por #include "program1.h"
*/
#include <program1.h>
/**En un estacionamiento, se cobra de la siguiente manera:
* los primeros 10 minutos son gratis, los siguientes 30 minutos tiene un valor
* de $0.30 y la hora $0.60. Diseñe un programa que reciba tanto minutos como
* horas y muestre lo que debe cancelar el cliente. Tomando en cuenta que si es
* Martes y Sábado se hace un descuento del 12.56% sobre el  monto total.
*
*/
procedimiento calcularTotal (real porRef,real porRef, real porRef, real porRef, real porRef);
principal                                                       // Unidad de programa principal
real horas,
	minutos,
	descuento,
	total,
    dia;
	limpiar;                                                        // Limpia la pantalla.
leerM(horas,"Ingrese la cantidad de horas: ");
leerM(minutos,"Ingrese la cantidad de minutos: ");
leerM(dia,"Ingrese el numero correspondiente al dia: (1)-Lunes, (2)-Martes, (3)-Miercoles, (4)-Jueves, (5)-Viernes, (6)-Sabado, (7)-Domingo : ");
calcularTotal(horas,minutos,dia,total,descuento);
mostrar << "El monto a cobrar es: "<< total << "$" << salto;
si (dia ES 2 O dia ES 6 )entonces;
mostrar << " su descuento es de: "<<descuento<< "$" << salto;
mostrar << " El monto con su descuento es de: "<<total - descuento<< "$" << salto;
sino mostrar << "no tiene descuento" << salto;
finSi;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
	
procedimiento calcularTotal (real porRef Horas,real porRef Minutos, real porRef Dia, real porRef Total, real porRef Descuento){
Cadena martes,
	sabado;
	si (Horas NOES 0 O Minutos <= 10) entonces;
	Total = 0.6 * Horas;
	finSi;
si (Minutos > 10 Y Minutos <= 30)entonces;
	Total = Horas * 0.6 + 0.3;
sinoSi (Minutos > 30 Y Minutos <=59)entonces;
	Total = (Horas *0.6) + 0.6;
	finSi;
si (Dia ES 2 O Dia ES 6) entonces;
	Descuento = (Total * 0.1256);
	finSi;
}
