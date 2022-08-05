#include <program1.h>
/**
*  Enunciado: Dado un numero entero, calcular si: tiene uno, dos, tres, cuatro o más digitos.   
*/

funcion entero cantidadDigitos(entero num){
	si (num>9) entonces
		regresa(1+cantidadDigitos(num/10));
	sino
		regresa(1);
	finSi	
}
	
principal                                                       // Unidad de programa principal
	entero num;
limpiar;                                                        // Limpia la pantalla.
	
leerM(num, "Ingrese un número entero: ");

si (cantidadDigitos(num)>3) entonces
	mostrar << "El número tiene 4 o más dígitos." << salto;
sino	
	mostrar << "El número tiene " << cantidadDigitos(num) << " dígito/s." << salto; 
finSi

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
		
		
		
