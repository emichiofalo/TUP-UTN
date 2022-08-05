#include <program1.h>
/**
*  Enunciado:  	Leer 3 valores y:
				- determinar cuál es el mayor. 
				- mostrarlos ordenados de menor a mayor.
*/

procedimiento mayor (int a,int b,int c){
	si (a>b Y a>c) entonces
		mostrar << a << " es el mayor." << salto;
	sinoSi (b>c) entonces
		mostrar << b << " es el mayor." << salto; 
	sino 
		mostrar << c << " es el mayor." << salto;
	finSi
}

procedimiento ordenar (int a, int b, int c){
	si (a>b && a>c) entonces
		si (b>c) entonces
			mostrar << c << b << a << salto;
		sino 
			mostrar << b << c << a << salto;
		finSi
	sinoSi (b>a && b>c) entonces
			si (a>c) entonces
			mostrar << c << a << b << salto;
		sino 
			mostrar << a << c << b << salto;
		finSi
	sino
		si (a>b) entonces
			mostrar << b << a << c << salto;
		sino 
			mostrar << a << b << c << salto;
		finSi
	finSi	
}
	
principal                                                       // Unidad de programa principal

	entero a, b, c;
	
limpiar;                                                        // Limpia la pantalla.
	
	mostrar << "Ingrese 3 valores: ";
	leer(a);
	leer(b);
	leer(c);
	
	mayor(a,b,c);
	ordenar(a,b,c);

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


