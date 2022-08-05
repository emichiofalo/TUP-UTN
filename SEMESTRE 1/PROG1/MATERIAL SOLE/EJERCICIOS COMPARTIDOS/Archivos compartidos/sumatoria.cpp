// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: Secuencia de valores positivos. Sumarlos
*/
//using namespace std;
principal                                                       // Unidad de programa principal
	real nro                                                        // Dato (a leer)
	,suma = 0;                                                  // Resultado (a calcular)
limpiar;                                                        // Limpia la pantalla.
iterar
	leerM(nro,"Valor:");
salirSi(nro <= 0.0);
suma += nro;													//Suma valor de variable nro a variable suma
finIterar;
si(suma > 0.) entonces
	mostrar << "La suma de positivos vale " << suma;
sino
	mostrar << "Secuencia vacia...";
finSi
	mostrar << salto;
	
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
