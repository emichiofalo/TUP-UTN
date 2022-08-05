#include <program1.h>
/**
*  Enunciado:  
*/
Funcion real cargarMatriz3DTxt(real mat[5][5][4]){
	
	archivo datos;
	real num;
	
	abrir(datos,"datos.txt", ALEER);
	
	si(estaAbierto(datos))entonces
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				for(int k = 0; k < 4; k++){
					
					si(esFinDArch(datos)) entonces
						mat[i][j][k] = 0;
					sino
						datos >> num;
						mat[i][j][k] = num;
					finSi
			}		
		}
	}							
	finSi
			
	cerrar(datos);
		
	regresa(mat[5][5][4]);
}
	
	Procedimiento mostrarMatriz3D(real mat[5][5][4]){
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				for(int k = 0; k < 4; k++){
					mostrar<<"[" << mat[i][j][k]<<"]";
				}
				mostrar << salto;
			}
			mostrar << salto;
		}
	}
		
		Funcion entero obtenerElementos(){
			
			archivo datos;
			entero elementos = 0;
			real num;
			
			abrir(datos,"datos.txt", ALEER);
			
			si(estaAbierto(datos))entonces
				
				mientras(!esFinDArch(datos))
					datos >> num;
					elementos++;
				finMientras
			finSi
				
				cerrar(datos);	
			
			regresa(elementos);	
		}	
			
			Funcion real obtenerMedia() {
				
				archivo datos;
				real media, num, suma;
				entero elementos = 0;
				
				abrir(datos,"datos.txt", ALEER);
				
				si(estaAbierto(datos))entonces
					
					mientras(!esFinDArch(datos))
					
					datos >> num;
					elementos++;
					suma += num;
				
				finMientras
					finSi
					
					cerrar(datos);		
				
				media = suma / (elementos);
				
				regresa(media);
			}
			
			Funcion real calcularDesviacionTipica(entero elementos, real media){
				
				archivo datos;
				real total, num;
				
				abrir(datos,"datos.txt", ALEER);
				
				si(estaAbierto(datos))entonces
					
					mientras(!esFinDArch(datos))
					
					datos >> num;
				total += cuadrado(num - media);
				
				finMientras	
					finSi	
					
					cerrar(datos);		
				
				total = total / (elementos - 2);	
				total = raiz2(total);			
				
				regresa(total);
			}
				
				principal                                                       				// Unidad de programa principal
					
					real num[5][5][4];
					real media;
					real desviacionTipica;
					entero elementos = 0;
					
					num[5][5][4] = cargarMatriz3DTxt(num);	
					mostrarMatriz3D(num);
					
					elementos = obtenerElementos();
					media = obtenerMedia();	
					desviacionTipica = calcularDesviacionTipica(elementos, media);
					
					mostrar << "-----------------------------------------------"<< salto;
					mostrar << "Elementos " << elementos << salto;
					mostrar << "Media " << media << salto;
					mostrar << "Desviacion Tipica " << desviacionTipica << salto;
					mostrar << "-----------------------------------------------"<< salto;
					
					pausa;                                                      				// Pausa antes de finalizar. 
					finPrincipal                                                    				// Fin de unidad de programa principal
