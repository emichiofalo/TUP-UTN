/*
program1.h es el archivo de traducción de seudocódigo a C++
Copiarlo (en Linux): /usr/local/include
o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Diseñe un programa para leer la base y la altura de un triangulo y calcular su superficie.
*/
procedimiento CalcularSuperficie(real porRef, real porRef, real porRef);

principal                                                       // Unidad de programa principal
real base,                                                      //variable que almacenara la base
	superficie,													//variable que almacenara la superficie
	altura;														//variable que almacenara la altura
	limpiar;                                                    // Limpia la pantalla.
leerM(base,"Ingrese la Base del triangulo : ");					//Toma la base del triangulo
leerM(altura,"Ingrese la Altura del triangulo : ");				//Toma la altura del triangulo
CalcularSuperficie(base,altura,superficie);						//Llama a procedimiento calcularSuperficie Seria el "QUE hace" del programa
mostrar << "La superficie del triangulo es : " << superficie << tabulado<<salto;//muestra el resultado devuelto por el procedimiento
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
	
procedimiento CalcularSuperficie(real porRef Base,real porRef Altura,real porRef Superficie){//Toma por orden de las variables de el principal(linea20)
Superficie = (Base * Altura)/2;																//Procedimiento que realiza el "COMO lo hace" del programa
}
