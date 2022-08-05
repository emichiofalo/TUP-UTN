// Archivo de traducción de seudocódigo a C++
#include <program1.h>
//#include <leetecla.h>
/**
*    Enunciado: 
*/
//using namespace std;
principal                                                       // Unidad de programa principal
doble a, b=0, suma=0;
iterar															//Inicio del Bucle
	leerM (a, "Ingrese valor: ");								//Ingresa valor
	salirSi (a==0);												//Rompe el bucle al ingresar un valor nulo
	si (b==0) entonces
		b=a;													//Caso de ser primer ingreso, se guarda A en B
	sino
		si ((a+b)>=suma) entonces								//Si la suma de los dos últimos valores es superior al histórico
			suma=a+b;											//Suma y guarda A y B
			b=a;												//Guarda A en B para siguiente caso
			mostrar << "La suma da " << suma << salto;			//Muestra resultado
		sino													//Si la suma de los dos ultimos no supera el historico
			b=a;												//Guarda A en B
			mostrar << "La suma no supera el maximo previamente alcansado." << salto;
		finSi
	finSi
finIterar;
mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
