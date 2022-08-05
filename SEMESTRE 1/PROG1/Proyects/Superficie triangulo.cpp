#include <program1.h>
/**
*  Enunciado: calcular la superficie de un triangulo. Superficie=base*altura/2.  
*/
principal                                                       // Unidad de programa principal

real base, altura, superficie;
	
limpiar;                                                        // Limpia la pantalla.

leerM(base,"Ingrese la base del triángulo: ");
leerM(altura, "y la altura: ");

superficie=(base*altura)/2;

mostrar << "La superficie del triangulo es: " << superficie << salto;

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


