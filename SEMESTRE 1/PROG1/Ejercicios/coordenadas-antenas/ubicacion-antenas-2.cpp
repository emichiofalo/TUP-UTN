#include <program1.h>
/**
*  Enunciado:  Se quiere resolver un problema de ubicación de antenas de celulares 
dentro del espacio de una ciudad. Para empezar se procede a cargar sus coordenadas 
polares (distancia,ángulo) para cada antena, tomando como origen de coordenadas el 
centro de la ciudad determinado por el cruce de sus dos avenidas principales, donde
 – obviamente – no hay antena alguna.
Se desea saber:
1. Cantidad de antenas instaladas a más de 1 kilómetro del centro.
2. Distancia y ángulo promedio de las antenas respecto del centro.
*/
principal                                                       // Unidad de programa principal
	archivo datos;
	real distancia, angulo, sumaDist = 0.0, sumaAng = 0.0;
	entero cantAntenas = 0, cantAntenasLejanas = 0;
limpiar;                                                        // Limpia la pantalla.

abrir(datos,"coordenadas-antenas.txt", ALEER);
iterar
	datos >> distancia;
	datos >> angulo;
	salirSi(datos.eof());
	si(distancia>10) entonces
		cantAntenasLejanas++;
	finSi
	cantAntenas++;
	sumaDist += distancia;
	sumaAng += angulo;
	finIterar

mostrar << salto;
mostrar << "Hay " << cantAntenasLejanas << " antenas instaladas a más de 1km del centro." << salto;
mostrar << "El promedio de la distancia respecto del centro es de " << sumaDist/cantAntenas << ", y el promedio del angulo es de " << sumaAng/cantAntenas << salto;

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
