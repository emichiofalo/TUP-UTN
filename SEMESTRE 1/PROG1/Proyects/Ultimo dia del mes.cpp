#include <program1.h>
/**
*  Enunciado:  Dado un año y un mes, muestre la fecha del último día de ese mes y ese año. 

pedir mes y año 
ver cuántos días tiene el mes según el mes ingresado
	si el mes es febrero, ver si el año es bisiesto o no
mostrar el último día del mes de ese año 
*/

funcion logico esBis(sinSigno a){
	return (esMult(a,4) Y NO esMult(a,100) O esMult(a,400));
}

funcion sinSigno cantidadDias(sinSigno m, sinSigno a){
	segun (m) 
		caso 1: caso 3: caso 5: caso 7: caso 8: caso 10: caso 12: return (31);
		otroCaso 4: caso 6: caso 9: caso 11: return(30);
		casoAsumido: return(fSi(esBis(a),29,28));
	finSegun
}

principal                                                       // Unidad de programa principal
	sinSigno mes, anio;
limpiar;                                                        // Limpia la pantalla.

	do{
		leerM (mes, "Ingrese un mes: ");
	}while (mes<1 || mes>12);
	leerM(anio, "Ingrese un año: ");
	
	mostrar << "El último día del mes " << mes << " del año " << anio << " es el día " << cantidadDias(mes,anio) << "." << salto;
	

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


