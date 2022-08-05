#include <program1.h>
/**
*  Enunciado:  
*/
principal                                                       				// Unidad de programa principal
	
	archivo datos;
	real num,media,suma,desviacionTipica;
	entero contador = 0;
	
	abrir(datos,"datos.txt", ALEER);
	
	si(estaAbierto(datos))entonces
		
		repetir
				
			datos >> num;
		
			si(num == 0)entonces
				sale;
			sino								
				contador++;
				suma += num;
			finSi
		hasta(esFinDArch(datos))
	finSi
	
	cerrar(datos);		
							
	media = suma / contador;
			
	abrir(datos,"datos.txt", ALEER);
	
	si(estaAbierto(datos))entonces
		
		repetir	
			
			datos >> num;
			
			si(num == 0)entonces
				sale;
			sino
				desviacionTipica += cuadrado(num - media);
			finSi
		hasta(esFinDArch(datos))
	finSi	
	
	cerrar(datos);		
						
	desviacionTipica = raiz2(desviacionTipica / contador);			
		
	mostrar << desviacionTipica << salto;
	
	pausa;                                                      				// Pausa antes de finalizar. 
finPrincipal                                                    				// Fin de unidad de programa principal
