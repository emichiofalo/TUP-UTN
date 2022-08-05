#include <program1.h>
/**
*    Enunciado: Dada una secuencia de datos no nulos, mostrar el mayor resultado de la suma de dos números consecutivos de la secuencia, 
				siempre y cuando se ingresen dos o más números. 
*/
principal
	real ant = 0
	,act
	,s2
	,s2x;
logico hay2 = FALSO;
limpiar;
iterar
	leerM(act,"Valor:");
	salirSi(act ES 0.0);
	si(ant NOES 0.0) entonces
		si(hay2) entonces
		s2 = ant + act;
			si(s2 > s2x) entonces
				s2x = s2;
		finSi
		sino
			hay2 = VERDADERO;
			s2x = ant + act;
		finSi
	finSi
	ant = act;
finIterar

si(hay2) entonces
	mostrar << s2x << salto;
finSi
	
pausa;

finPrincipal
