#include <program1.h>
/**
*  Enunciado:  Se quiere resolver un problema de ubicación de antenas de 
celulares dentro del espacio de una ciudad. Para empezar se procede a 
cargar sus coordenadas (x,y) para cada antena, tomando como origen de 
coordenadas el centro de la ciudad determinado por el cruce de sus dos 
avenidas principales, donde – obviamente – no hay antena alguna.
Se desea saber:
1. Cantidad de antenas instaladas en el cuadrante 3.
2. Ubicación promedio de las antenas (promedio de sus coordenadas).
*/
principal                                                       // Unidad de programa principal
	archivo coord;
	real x, y, sumaCoordX = 0.0, sumaCoordY = 0.0;
	entero cantAntenas = 0;
limpiar;                                                        // Limpia la pantalla.

abrir(coord,"coordenadas-antenas.txt", ALEER);
iterar
	coord >> x;
	coord >> y;
	salirSi(coord.eof());
	si(x<0 Y y<0) entonces
		cantAntenas++;
		sumaCoordX += x;
		sumaCoordY += y;
	finSi
	finIterar

mostrar << salto;
mostrar << "En el cuadrante 3 hay " << cantAntenas << " antenas instaladas." << salto;
mostrar << "El promedio de sus coordenadas es: " << sumaCoordX/cantAntenas << " " << sumaCoordY/cantAntenas << salto;

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
