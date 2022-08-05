#include <program1.h>
/**
*  Enunciado: Dato a buscar FIL: 12 COL: 9 DATO: 70.4443 6/7
*/
principal                                                       				// Unidad de programa principal

	archivo datos;
	real num;
	real m[12][9];
	
	abrir(datos,"datos.txt",ALEER);
	
	for(int i = 0; i < 12; i++){
		for(int j = 0; j < 9; j++){
			datos >> num;
			m[i][j] = num;
		}
	}
	
	for(int i = 0; i < 12; i++){
		for(int j = 0; j < 9; j++){
			 mostrar << "[" << m[i][j] << "]";
		}
		mostrar << salto;
	}
	
	real busqueda = 70.4443;
	
	for(int i = 0; i < 12; i++){
		for(int j = 0; j < 9; j++){
			if(m[i][j] == busqueda){
				mostrar << "Dato encontrado en: " << " Fila: " << (i+1) << "Col: " << (j+1) << salto;
			}
		}
	}

	pausa;                                                      				// Pausa antes de finalizar. 
finPrincipal                                                    				// Fin de unidad de programa principal
