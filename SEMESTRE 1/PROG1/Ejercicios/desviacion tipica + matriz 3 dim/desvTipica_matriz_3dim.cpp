#include <program1.h>
/**
*  	Enunciado:  Dada una secuencia de hasta 100 valores, cargarla por filas, 
	columnas y planos en una matriz de hasta 5x5x4 FilasxColumnasxPlanos, y calcular 
	la desviación típica de la totalidad de datos cargados
*/

funcion real Media ();
funcion real DesviacionTipica (real);
procedimiento LlenarMatriz();

principal                                                       // Unidad de programa principal
	real media, desvTipica;
	
limpiar;                                                        // Limpia la pantalla.
		
	media = Media();
	desvTipica = DesviacionTipica(media);
		
	mostrar << "La desviacion tipica de los valores es: " << desvTipica << salto;
	
	LlenarMatriz();
	
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

funcion real Media (){
	archivo datos;
	real suma=0, x, media=0;
	entero contador = 0;
	abrir (datos,"datos6.txt", ALEER);
	iterar
		datos >> x;
		salirSi(datos.eof());
		suma += x;
		contador ++;
	finIterar
		
	media = suma/contador;
	
	regresa (media);
}
	
funcion real DesviacionTipica (real media){
	archivo datos;
	real desvTipica=0, x, aux=0;
	entero contador = 0;
	abrir (datos,"datos6.txt", ALEER);
	iterar
		datos >> x;
		salirSi(datos.eof());
		aux+=cuadrado(x-media);
		contador ++;
	finIterar
	
	desvTipica = raiz2(aux/contador);
	
	regresa (desvTipica);
}
	
procedimiento LlenarMatriz(){
	archivo datos;
	real matriz [5][5][4];
	real x;
	abrir (datos,"datos6.txt", ALEER);
	for(int k=0;k<4;k++){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(datos.eof()){
					matriz[i][j][k]=0;
				}else{
					datos >> x;
					matriz[i][j][k]= x;
				}
			}
		}
	}
	for(int k=0;k<4;k++){
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				mostrar << matriz[i][j][k] << " ";
			}
			mostrar << salto;
		}
		mostrar << salto;
	}
}


