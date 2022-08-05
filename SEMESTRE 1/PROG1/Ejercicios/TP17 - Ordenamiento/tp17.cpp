#include <program1.h>                                           // Archivo de traducción de seudocódigo a C++

principal                                                       // Unidad de programa principal
	archivo datos;
	real x = 0.0, menor = 0.0;
	int cantidad = 0;
	vectorDin(real) vector;
limpiar;                                                        // Limpia la pantalla.
	abrir(datos,"datosvec2.txt",ALEER);
	iterar
		datos >> x;
		agregaEleVDin(vector, x);
		salirSi(datos.eof());
	finIterar
	
	mostrar << tamanio(vector) << salto;
	clasifica(vector);
	mostrar << vector[0] << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal
