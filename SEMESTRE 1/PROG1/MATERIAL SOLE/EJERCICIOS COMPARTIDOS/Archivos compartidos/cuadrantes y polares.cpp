// Archivo de traducción de seudocódigo a C++
#include "program1.h"
/**
*    Enunciado: Dado un conjunto a leer o generar aleatoriamente de entre 2 y 100 (el tamaño lo elije el usuario) en coordenadas polares (distancia,angulo) sobre un espacio bidimensional, con las siguientes condiciones:
		1 las distancias dentro del cuadrante 2 deben ser siempre mayores a 10 y menores o iguales a 50
		2 los angulos pueden variar entre 0° y +360° respecto del eje x positivo.
			Se quiere averiguar:
		La ubicacion promedio de los puntos del cuadrante 2(promedio de las coordenadas distancia y angulo solo de los puntos de dicho cuadrante
		La identificacion de los puntos ordenados por distancia creciente respecto del origen de los puntos del cuadrante 4.
*/
constante entero TAM=100;

principal                                                       // Unidad de programa principal
// Declaraciones: A continuación se declaran las variables del programa...
entero c=0,v[TAM],
	i,
	j,
	aux1,
	aux2=1;
real dist,														// Variable para la distancia al origen
	cant,
	contador=0,
	acumulador=0,
	anggrad,													// Variable para Angulo en Grados
	promedio;													// Variable para gardar el promedio de las distancias
limpiar;                                                        // Limpia la pantalla.
iterar
leerM(cant, "ingrese la cantidad de puntos que se utilizaran entre 2 y 100: ");
salirSi (cant<=100&&cant>=2);
finIterar;
mostrar << "El programa sale al ingresar una distancia no positiva" << salto;
iterar
	leerM (dist, "Ingrese la distancia del punto " << aux2<<salto);		// Pide distancia de la antena al origen
	salirSi (dist<=0);											// Instruccion de salida si se ingresa una distancia no positiva
	leerM (anggrad, "Ingrese el angulo en grados " << aux2<<salto);			// Pide angulo del modulo
	si(anggrad<181&&anggrad>=90) entonces
		acumulador += dist;											// Almacena el total de las distancias ingresadas
	contador++;													// Incrementa en uno la cantidad de puntos ingresados
	sinoSi(anggrad<361&&anggrad>=270) entonces
		c++;
		v[c]=dist;
		finSi;
		aux2++;
		salirSi(aux2>cant);
finIterar;
si (contador!=0) entonces
	promedio=acumulador/contador;									// Calcula el promedio
	mostrar << "El promedio de distacias al origen de los puntos del cuadrante 2 es: " << promedio << salto<<salto;
	sino
		mostrar<<"No se ingresaron puntos en el cuadrante 2"<<salto<<salto;
finSi;
si (c!=0) entonces
	mostrar<<"Puntos en el cuadrante 4"<<salto<<salto;
variar(i,1,c,1)
mostrar<<"Punto "<<i<<"	"<<v[i]<<salto<<salto;
finVariar;
mostrar<<salto<<"Puntos ordenados"<<salto<<salto;
variar(i,0,c-1,1)
	variar(j,i+1,c,1)
		si(v[i]>v[j])entonces
			aux1=v[j];
			v[j]=v[i];
			v[i]=aux1;
			finSi;
	finVariar;
		mostrar<<"Punto "<<i+1<<"	"<<v[i]<<salto<<salto;
finVariar;
sino
	mostrar<<"No se ingresaron puntos en el cuadrante 4"<<salto;
finSi;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
