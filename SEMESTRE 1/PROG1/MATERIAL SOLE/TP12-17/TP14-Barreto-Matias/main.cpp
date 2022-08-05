#include <program1.h>
/**
*  Enunciado:  
*/
Funcion real cargarMatriz2DTxt(real mat[10][10]){
	
	archivo datos;
	real num;
	
	abrir(datos,"datos.txt", ALEER);
	
	si(estaAbierto(datos))entonces
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){				
				si(esFinDArch(datos)) entonces
					mat[i][j] = 0;					
				sino
					datos >> num;
					mat[i][j] = num;
				finSi					
			}
		}							
	finSi
		
	cerrar(datos);
	
	regresa(mat[10][10]);
}
	
Procedimiento mostrarMatriz2D(real mat[10][10]){

	for(int i = 0; i < 9; i++){
		for(int j = 0; j < 9; j++){
			mostrar<<"[" << mat[i][j]<<"]";
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
		
	media = suma / elementos;
						
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
	
	total = total / (elementos-1);	
	total = raiz2(total);			

	regresa(total);
}

principal                                                       				// Unidad de programa principal
		
	real num[10][10];
	real media;
	real desviacionTipica;
	entero elementos = 0;
	
	num[10][10] = cargarMatriz2DTxt(num);	
	mostrarMatriz2D(num);
	
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
