#include <program1.h>
#include "leerVar.h"
/**
*    Procedimiento de lectura validada por rango (Código genérico)
*/
plantilla(tipo)
procedimiento leerVarI(tipo porRef v, tipo vMin, tipo vMax, cadena mens) {
	iterar
		leerVar(v,vMin,vMax,mens);
		salirSi(esImpar(v));
		mostrar<<"Valor Par"<<salto;
	finIterar;
	}
	
implementa procedimiento leerVarI(entero porRef,entero,entero,cadena);
