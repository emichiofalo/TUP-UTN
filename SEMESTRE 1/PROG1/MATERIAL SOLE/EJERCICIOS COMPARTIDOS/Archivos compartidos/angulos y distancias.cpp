// Archivo de traducción de seudocódigo a C++
#include <program1.h>
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
limpiar;                                                        // Limpia la pantalla.
entero c=0,i,j,aux1;
real dist,														// Variable para la distancia al origen
	dim,
	anggrad,													// Variable para Angulo en Grados
	angrad,														// Variable para Angulo en Radianes
	distx,														// Distancia en X de la antena
	disty,														// Distancia en Y de la antena
	promedio;													// Variable para gardar el promedio de las distancias
leerM(dim, "ingrese la cantidad de puntos que se utilizaran entre 2 y 100");
int v[TAM],aux[TAM];
mostrar << "El programa sale al ingresar una distancia no positiva" << salto;
iterar
	leerM (dist, "Ingrese la distancia del punto: "<<c);		// Pide distancia de la antena al origen
	salirSi (dist<=0);											// Instruccion de salida si se ingresa una distancia no positiva
	leerM (anggrad, "Ingrese el angulo en grados: "<<c);			// Pide angulo del modulo
	angrad=radianes(anggrad);									// Convierte a Radianes los grados ingresados
	distx=dist*coseno(angrad);									// Calcula la distancia al origen en X de la antena
	disty=dist*seno(angrad);									// Calcula la distancia al origen en Y de la antena
	mostrar << "La coordenada cartesiana de la antena es(x,y): (" << distx << " , " << disty << ")" << salto;
	si(anggrad<361&&anggrad>=270)entonces
		v[c]=dist;
		aux[c]=0;
		c++;
		finSi;
finIterar;
variar(i,0,c,1)
	variar(j,i+1,c,1)
	si(v[i]>v[j])entonces
	aux1=v[j];
	v[j]=v[i];
	v[i]=aux1;
	finSi;
finVariar;
finVariar;
variar(i,0,c,1)
	mostrar<<"Punto "<<i<<"		"<<v[i]<<salto;
finVariar;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
