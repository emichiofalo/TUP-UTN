#include <program1.h>
/**
*  	Enunciado:  Dada una secuencia de hasta 100 valores, cargarla por filas en 
	una matriz de hasta 10x10 FilasxColumnas, y calcular la desviación típica de la 
	totalidad de datos cargados
*/

procedimiento Busqueda(real[6][6], real);

principal                                                       // Unidad de programa principal
	
limpiar;                                                        // Limpia la pantalla.
	
	archivo datos;
	real x, buscado=0;
	abrir (datos,"datos03.txt", ALEER);
	datos >> buscado;
	real matriz[6][6];
	for(int i=0;i<6;i++){
		for(int j=0;j<6;j++){
			datos >> x;
			matriz[i][j]= x;
		}
	}
	
	Busqueda(matriz,buscado);
	
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

procedimiento Busqueda (real matriz[6][6], real buscado){
	logico encontrado = FALSO;
	for(int i=0;i<6;i++){
		for(int j=0;j<6;j++){
			if(matriz[i][j]==buscado){
				mostrar << i << j;
				encontrado = VERDADERO;
			}
		}
	}
	mostrar << salto;
	if(!encontrado)
		mostrar << 0 << salto;
}



