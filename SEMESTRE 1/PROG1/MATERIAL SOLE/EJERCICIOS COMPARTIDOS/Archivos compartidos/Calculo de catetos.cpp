// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: 
*/
principal                                                       // Unidad de programa principal
// Declaraciones: A continuación se declaran las variables del programa...
limpiar;                                                        // Limpia la pantalla.
real anggrad,													// Variable para guardar el valor ingresado en Grados
	angrad,														// Variable para guardar el valor convertido a Radianes
	dist,														// Variable para guardar la longitud de la hipotenusa
	catop,														// Variable para guardar la longitud del Cateto Opuesto al angulo
	catad;														// Variable para guardar la longitud del Cateto Adyacente al angulo
leerM (anggrad, "Angulo: ");									// Pide el valor del angulo
leerM (dist, "Distancia: ");									// Pide el valor de la hipotenusa
angrad=(anggrad*PI)/180;										// Convierte de Grados a Radianes mediante formula
mostrar << anggrad << " en Grados a Radianes segun formula es: " << angrad << salto;
angrad=radianes(anggrad);										// Convierte de Grados a Radianes mediante pseudocodigo
mostrar << anggrad << " en Grados a Radianes segun pseudoc es: " << angrad << salto;
catop=dist*seno(angrad);										// Calcula la longitud del Cateto Opuesto al angulo
catad=dist*coseno(angrad);										// Calcula la longitud del Cateto Adyacente al angulo
mostrar << "El lado adyacente mide: " << catad << salto;
mostrar << "El lado contratio mide: " << catop << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
