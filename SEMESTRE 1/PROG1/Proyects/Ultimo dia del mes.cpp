#include <program1.h>
/**
*  Enunciado:  Dado un a�o y un mes, muestre la fecha del �ltimo d�a de ese mes y ese a�o. 

pedir mes y a�o 
ver cu�ntos d�as tiene el mes seg�n el mes ingresado
	si el mes es febrero, ver si el a�o es bisiesto o no
mostrar el �ltimo d�a del mes de ese a�o 
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
	leerM(anio, "Ingrese un a�o: ");
	
	mostrar << "El �ltimo d�a del mes " << mes << " del a�o " << anio << " es el d�a " << cantidadDias(mes,anio) << "." << salto;
	

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


