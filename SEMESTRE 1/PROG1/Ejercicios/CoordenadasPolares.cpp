#include <program1.h>                                           // Archivo de traducción de seudocódigo a C++


principal                                                       // Unidad de programa principal
	archivo datos;
	real x = 0.0,y = 0.0, radio = 0.0, angulo=0.0;
	limpiar;

	abrir(datos,"datosRad.txt", ALEER);
	iterar
	datos >> x;
	datos >> y;
	
	salirSi(datos.eof());
	
	radio = raiz2((x*x+y*y));
	si(!x == 0)
	angulo = arcoTangente(y,x);
	
	mostrar<< radio << ","<< radianes(angulo) << salto;
	finIterar
	pausa;                                                          // Pausa antes de finalizar. 
finPrincipal


