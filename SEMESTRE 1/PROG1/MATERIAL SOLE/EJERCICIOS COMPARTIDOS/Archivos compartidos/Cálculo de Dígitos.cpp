// Archivo de traducci�n de seudoc�digo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: 
*/
using namespace std;
principal                                                       // Unidad de programa principal
// Declaraciones: A continuaci�n se declaran las variables del programa...

entero numero;
limpiar;

leerM(numero,"Ingrese un valor entero positivo: ");

si(numero<10) entonces
	mostrar << "Posee un d�gito";
	sinoSi(numero<100) entonces
	mostrar << "Posee dos d�gitos";
	sinoSi(numero<1000) entonces
	mostrar << "Posee tres d�gitos";
	sinoSi(numero<10000) entonces
	mostrar << "Posee cuatro d�gitos";
	sino
	mostrar << "Posee m�s de cuatro d�gitos";
	finSi
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
