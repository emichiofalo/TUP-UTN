#include <program1.h>
/**
*  	Enunciado:  Dada una secuencia de hasta 100 valores, cargarla por filas en 
	una matriz de hasta 10x10 FilasxColumnas, y calcular la desviación típica de la 
	totalidad de datos cargados
*/

procedimiento BusquedaMenorDeFila(real[13][7]);

principal                                                       // Unidad de programa principal
	
limpiar;                                                        // Limpia la pantalla.
	
	archivo datos;
	real x=0;
	abrir (datos,"datos04.txt", ALEER);
	real matriz[13][7];
	for(int i=13;i>0;i--){
		for(int j=0;j<7;j++){
			datos >> x;
			matriz[i-1][j]= x;
		}
	}
	
	BusquedaMenorDeFila(matriz);
	
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

procedimiento BusquedaMenorDeFila (real matriz[13][7]){
	real menor;
	for(int i=0;i<13;i++){
		menor=0;
		for(int j=0;j<7;j++){
			if(menor==0){
				menor=matriz[i][j];
			}else{
				if(matriz[i][j]<menor)
					menor=matriz[i][j];
			}
		}
		mostrar << "El minimo valor de la fila " << i+1 << " es " << menor << salto; 
	}
	
}



