#include <program1.h>
/**
*    Enunciado: 
*/
principal                                                       // Unidad de programa principal
	caracter letra, letraAnterior = '*';
	cadena palabra, palabraMasConsonantes = "";
	entero cantidadConsonantes, cantidadConsonantesMax = 0;
limpiar;                                                        // Limpia la pantalla.

iterar
	leeTecla(letra);                                           
	si(esComPal(letraAnterior,letra)) entonces                 
		palabra = letra;                                       
		si(esConso(letra)) entonces
			cantidadConsonantes=1;
		finSi
	sinoSi(NO esSigno(letra)) entonces                     
		palabra += letra;                                      
		si(esConso(letra)) entonces
			cantidadConsonantes++;
		finSi
	sinoSi(esFinPal(letraAnterior,letra)) entonces         
		si(cantidadConsonantes > cantidadConsonantesMax) entonces            
			palabraMasConsonantes = palabra;                         
			cantidadConsonantesMax = cantidadConsonantes;                    
		sinoSi(cantidadConsonantes == cantidadConsonantesMax) entonces   
			palabraMasConsonantes += ", " + palabra;                 
		finSi
	finSi
	salirSi(letra == '.');
	letraAnterior = letra;                                     
finIterar
	
	mostrar << salto;
si(cantidadConsonantes > 0) entonces
	mostrar << "La(s) palabra(s) con más consonantes es(son): " << palabraMasConsonantes << salto;
finSi
	
	pausa;                                                     	// Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
	
