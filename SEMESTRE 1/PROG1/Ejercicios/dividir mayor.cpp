#include <program1.h>
/**
*  Enunciado:  	Leer 2 valores y:
				- si se puede, dividir el primero por el segundo.
				- dividir el mayor de los dos por el menor.
*/
principal                                                       // Unidad de programa principal
	entero num1, num2;
	real result;
limpiar;                                                        // Limpia la pantalla.

	mostrar << "Ingrese dos valores:";
	leer (num1);
	leer (num2);
	
	si (num2>0) entonces
		result=num1/(real)num2;
		mostrar << result << salto;
	sino 
		mostrar << "No se puede dividir por cero." << salto;
	finSi
	
		
	si (num1>num2) entonces
		si (num2 NOES 0) entonces
			result=num1/(real)num2;
			mostrar << result << salto;
		sino 
			mostrar << "No se puede dividir por cero." << salto;
		finSi
	sino
		si (num1 NOES 0) entonces
			result=num2/(real)num1;
			mostrar << result << salto;
		sino 
			mostrar << "No se puede dividir por cero." << salto;
		finSi
	finSi

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


