#include <program1.h>
/**
*    Enunciado: Dada una secuencia de datos no nulos, Respuesta
obtiene la mayor suma entre 3 consecutivos.

*/
principal
	real ant = 0, antAnt = 0
	,act
	,s3
	,s3max;
logico hay3 = FALSO;
limpiar;
iterar
	leerM(act,"Valor:");
salirSi(act ES 0.0);
	si(ant NOES 0.0 Y antAnt NOES 0.0) entonces
		si(hay3) entonces
			s3 = antAnt + ant + act;
		si(s3 > s3max) entonces
			s3max = s3;
			finSi
		sino
		hay3 = VERDADERO;
		s3max = antAnt + ant + act;
		finSi
	finSi
	antAnt = ant;
	ant = act;
	finIterar

si(hay3) entonces
	mostrar << s3max << salto;
finSi

pausa;
finPrincipal
