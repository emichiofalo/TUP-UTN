#include <program1.h>
/**
*  Enunciado:  
*/
principal                                                       				// Unidad de programa principal
	
	archivo datos;
	caracter tecla;
	cadena valor;
	logico punto = FALSO;
	entero contador = 0;
	
	abrir(datos, "teclazos.txt",ALEER);
	
		si(estaAbierto(datos))entonces
			
			mientras(!esFinDArch(datos))
			
				datos >> tecla;
				
				si (contador == 0) entonces
					si(tecla == '.') entonces
						valor += tecla;
						contador++;
					finSi
				sino
					si(esDigito(tecla)) entonces
						valor += tecla;
					sinoSi(tecla == 'e' || tecla == 'E') entonces
						valor += 'e';
						sale;
					finSi
				finSi					
			finMientras
		finSi
		
	mostrar << valor << salto;					
						
	pausa;                                                      				// Pausa antes de finalizar. 
finPrincipal                                                    				// Fin de unidad de programa principal
