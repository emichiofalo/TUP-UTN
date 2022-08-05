#include <program1.h>
/**
*  Enunciado: Dado un numero entero, calcular si: tiene uno, dos, tres, cuatro o m�s digitos.   
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
	
leerM(num, "Ingrese un n�mero entero: ");

si (cantidadDigitos(num)>3) entonces
	mostrar << "El n�mero tiene 4 o m�s d�gitos." << salto;
sino	
	mostrar << "El n�mero tiene " << cantidadDigitos(num) << " d�gito/s." << salto; 
finSi

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
		
		
		
