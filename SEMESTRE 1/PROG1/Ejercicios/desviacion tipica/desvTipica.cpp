#include <program1.h>
/**
*  Enunciado:  Dada una secuencia de hasta 100 valores, calcular su desviación típica.
*/

funcion real Media ();
funcion real DesviacionTipica (real);

principal                                                       // Unidad de programa principal
	real media, desvTipica;
	
limpiar;                                                        // Limpia la pantalla.
	
	media = Media();
	desvTipica = DesviacionTipica(media);
	
	mostrar << "La desviacion tipica de los valores es: " << desvTipica << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

funcion real Media (){
	archivo datos;
	real suma=0, x, media=0;
	entero contador = 0;
	abrir (datos,"datos9.txt", ALEER);
	iterar
		datos >> x;
		salirSi(datos.eof());
		suma += x;
		contador ++;
	finIterar
		
	media = suma/contador;
	mostrar << contador << salto;
	
	regresa (media);
}
	
funcion real DesviacionTipica (real media){
	archivo datos;
	real desvTipica=0, x, aux=0;
	entero contador = 0;
	abrir (datos,"datos9.txt", ALEER);
	iterar
		datos >> x;
		salirSi(datos.eof());
		aux+=cuadrado(x-media);
		contador ++;
	finIterar
	
	desvTipica = raiz2(aux/contador);
	mostrar << contador << salto;
	
	regresa (desvTipica);
}

