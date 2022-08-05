// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: 
*/
//using namespace std;
principal                                                       // Unidad de programa principal
// Declaraciones: A continuación se declaran las variables del programa...
doble a, b, c, rz1, rz2, calc1, calc2;
limpiar;

mostrar << salto;

leerM(a,"Ingrese el valor para a: ");
leerM(b,"Ingrese el valor para b: ");
leerM(c,"Ingrese el valor para c: ");

calc1=(XalaY(b,2))-(4*a*c);

si(a==0) entonces
	mostrar << "Los datos ingresados no corresponden a una funcion cuadratica";
	mostrar << salto;
	sinoSi (calc1<=0) entonces
	mostrar << "Los datos de la funcion ingresada no poseen raiz.";
	mostrar << salto;
	sino
	calc2=raiz2(calc1);
	rz1=((-b)+calc2)/(2*a);
	rz2=((-b)-calc2)/(2*a);
	
	mostrar << "X1 es: " << rz1;
	mostrar << "X2 es: " << rz2;
	mostrar << salto;
finSi
	
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
