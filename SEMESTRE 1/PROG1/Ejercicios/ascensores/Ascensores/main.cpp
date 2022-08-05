#include <program1.h>
#include "Ascensores.h"
/**
*  Enunciado: Indica el número de orden (1°, 2°,etc.) del ascensor que recorrió menos pisos.
*/
funcion logico validarMayor2 (int piso, int asc){
	if (piso Y asc >= 2)
		return (VERDADERO);
	else 
		return (FALSO);
}
	
funcion logico validarLlamada (int org, int dest, int piso){
	if (org >= -1 Y org < piso Y dest >= 0 Y dest < piso Y org != dest)
		return (VERDADERO);
	else 
		return (FALSO);
}

principal                                                       					// Unidad de programa principal
	int piso = 0, ascensores = 0, origen = 0, destino = 0, contador = 0;
	archivo datos;
	
limpiar;                                                       		 				// Limpia la pantalla.
	abrir (datos,"datos.txt", ALEER);
	datos >> piso;
	datos >> ascensores;
	if(validarMayor2(piso,ascensores)){
		vectorDin(Ascensores) vectorAsc;
		for (int i=0; i<ascensores; i++){
			Ascensores ascensor;
			insertaEleVDin(vectorAsc, ascensor);
		}
		iterar
			datos >> origen;
			salirSi(origen == -1 O datos.eof() O contador>100);
			datos >> destino;
			if(validarLlamada(origen, destino, piso)){
				int option = 0;
				option = Ascensores::eligeAscensor(vectorAsc,origen);
				vectorAsc[option].mueveAscensor(origen);
				vectorAsc[option].mueveAscensor(destino);
				contador++;
			}
		finIterar
		Ascensores::mostrarAscensores(vectorAsc);
	}
pausa;                                                          					// Pausa antes de finalizar. 
finPrincipal                                                    					// Fin de unidad de programa principal
	
	
