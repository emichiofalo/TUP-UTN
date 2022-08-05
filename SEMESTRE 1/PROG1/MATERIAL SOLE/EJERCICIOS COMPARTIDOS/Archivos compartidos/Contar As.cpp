// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: Dado un texto terminado en punto, contar la cantidad de 'a'.
*/
principal							// Unidad de programa principal
									//Declaración de variables
entero contador=0, salida=0;		//Variable Entera para contador
caracter letr;						//Variable Caracter para ingreso de letra por letra
mostrar << "Bienvenido." << salto << "El programa analizara el texto que ingrese a medida vaya escribiendo. El programa finalizara al teclear un punto." << salto << "Ingrese el texto: ";
repetir								//Inicio del bucle.
	leeTecSinEco (letr);			//Lee de teclado por golpe de tecla.
	mostrar << letr;				//Va mostrando los golpes de tecla que se van ingresando.
	si (letr=='a') entonces			//Verifica que el golpe de tecla corresponda a una 'a'.
		contador=contador+1;		//Incrementa el contador
	finSi
hasta (letr=='.');					//Código de finalización en caso de ingresar punto.

segunCaso (contador)				//Analiza los casos
	caso 0:							//Caso de no haber habido 'a'
		mostrar << salto << "No se han ingresado caracteres 'a'." << salto;
	otroCaso 1:						//Caso de haber habido una sola 'a'.
		mostrar << salto << "Se ingreso 'a' " << contador << " vez." << salto;
	casoAsumido:					//Caso de haber habido multiples 'a'
		mostrar << salto << "Se ingreso 'a' " << contador << " veces." << salto;
finSegun

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
