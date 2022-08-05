#include <program1.h>
/**
*    Enunciado: 
*/
principal                                                       // Unidad de programa principal
caracter letra, letraAnterior = '*';
cadena palabra, palabraMasLarga = "";
entero tamPalabra, tamMasLarga = 0;
limpiar;                                                        // Limpia la pantalla.

iterar
    leeTecla(letra);                                           
    si(esComPal(letraAnterior,letra)) entonces                 
        palabra = letra;                                       
		tamPalabra = 1;
	sinoSi(NO esSigno(letra)) entonces                     
        palabra += letra;                                      
        tamPalabra++;    
	sinoSi(esFinPal(letraAnterior,letra)) entonces         
        si(tamPalabra > tamMasLarga) entonces            
            palabraMasLarga = palabra;                         
            tamMasLarga = tamPalabra;                    
		sinoSi(tamPalabra == tamMasLarga) entonces   
            palabraMasLarga += ", " + palabra;                 
		finSi
	finSi
    salirSi(letra == '.');
    letraAnterior = letra;                                     
finIterar

mostrar << salto;
si(tamMasLarga > 0) entonces
    mostrar << "La(s) palabra(s) más larga es(son): " << palabraMasLarga << salto;
finSi
	
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
