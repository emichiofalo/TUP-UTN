// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: 
*/
using namespace std;
principal                                                       // Unidad de programa principal
// Declaraciones: A continuación se declaran las variables del programa...

entero numero;
limpiar;

leerM(numero,"Ingrese un valor entero positivo: ");

si(numero<10) entonces
	mostrar << "Posee un dígito";
	sinoSi(numero<100) entonces
	mostrar << "Posee dos dígitos";
	sinoSi(numero<1000) entonces
	mostrar << "Posee tres dígitos";
	sinoSi(numero<10000) entonces
	mostrar << "Posee cuatro dígitos";
	sino
	mostrar << "Posee más de cuatro dígitos";
	finSi
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
