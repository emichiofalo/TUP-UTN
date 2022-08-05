#include <program1.h>
/**
*  Enunciado:  Dados 3 valores numéricos cualquiera mostrar el valor intermedio (ubicado entre el mínimo y el máximo) de ellos.
*/
principal                                                       // Unidad de programa principal

real a,b,c;
	
limpiar;                                                        // Limpia la pantalla.

leerM(a,"Valor:");
leerM(b,"Valor:");
leerM(c,"Valor:");

si (a>=b Y a<=c O a>=c Y a<=b) entonces
	mostrar << a << salto;
sino	
	si (a>=c Y b>=c O a<=c Y b<=c) entonces
		mostrar << b << salto;
	sino 
		mostrar << c << salto;
	finSi
finSi

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


