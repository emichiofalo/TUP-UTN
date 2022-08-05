// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: 
*/
principal                                                       // Unidad de programa principal
// Declaraciones: A continuación se declaran las variables del programa...
limpiar;                                                        // Limpia la pantalla.
real dist,														// Variable para la distancia al origen
	anggrad,													// Variable para Angulo en Grados
	angrad,														// Variable para Angulo en Radianes
	contador=0,													// Contador de antenas
	acumulador=0,												// Acumulador de distancias
	distx,														// Distancia en X de la antena
	disty,														// Distancia en Y de la antena
	promedio;													// Variable para gardar el promedio de las distancias
mostrar << "Bienvenido, ingrese las distancias en metros y los angulos en grados, para el separador de decimales utilice el punto '.'" << salto;
mostrar << "El programa sale al ingresar una distancia no positiva" << salto;
iterar
	leerM (dist, "Ingrese la distancia de la antena: ");		// Pide distancia de la antena al origen
	salirSi (dist<=0);											// Instruccion de salida si se ingresa una distancia no positiva
	leerM (anggrad, "Ingrese el angulo en grados: ");			// Pide angulo del modulo
	angrad=radianes(anggrad);									// Convierte a Radianes los grados ingresados
	acumulador += dist;											// Almacena el total de las distancias ingresadas
	contador++;													// Incrementa en uno la cantidad de antenas ingresadas
	distx=dist*coseno(angrad);									// Calcula la distancia al origen en X de la antena
	disty=dist*seno(angrad);									// Calcula la distancia al origen en Y de la antena
	mostrar << "La coordenada cartesiana de la antena es(x,y): (" << distx << " , " << disty << ")" << salto;
finIterar;
si (contador!=0) entonces
	promedio=acumulador/contador;									// Calcula el promedio
	mostrar << "El promedio de distacias al origen de las antenas es: " << promedio << salto;
finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
