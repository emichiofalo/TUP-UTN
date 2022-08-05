#include <program1.h>
/**
*  Enunciado:  
*/
principal                                                       // Unidad de programa principal
	real cX1=0,cY1=0,cX2=0,cY2=0,cIx=0,cIy=0;
	real dist = 0, distMin = 0, distFalt =0; 
	entero numTramo = 0, numTramoMin=0;
	logico primerDato = VERDADERO;
	archivo datos;
limpiar;                                                        // Limpia la pantalla.

abrir(datos,"datos-coordenadas-con-radianes.txt",ALEER);
iterar
	datos>>cX1;
	datos>>cY1;
	salirSi(datos.eof() O (cX1 ==0.0 Y cY1 == 0.0));
	
	si (primerDato) entonces
		cIx = cX1; 
		cIy = cY1;
		cX2 = cX1;
		cY2 = cY1;
		mostrar << cIx <<" "<< cIy << salto;
		primerDato = FALSO;
	sino
		dist=raiz2(cuadrado(cX1-cX2)+cuadrado(cY1-cY2));
		numTramo++;
		si (distMin == 0) entonces
			distMin = dist;
			numTramoMin = numTramo;
		sinoSi (dist<distMin) entonces
			distMin = dist;
			numTramoMin = numTramo;
		finSi
	finSi
	cX2 = cX1;
	cY2 = cY1;
	finIterar
distFalt=raiz2(cuadrado(cIx-cX1)+cuadrado(cIy-cY1));
mostrar << "La distancia para completar el circuito es: " << distFalt << salto;
mostrar << "El tramo más corto es el tramo " << numTramoMin << " que mide " << distMin << salto; 

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


