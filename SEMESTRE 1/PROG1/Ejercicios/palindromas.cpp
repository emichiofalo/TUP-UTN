#include <program1.h>
/**
*  Enunciado:  
*/
principal                                                       // Unidad de programa principal
	caracter letra, letraAnterior = '*';
	cadena palabra, palindroma = "";
	entero cantLetrasIguales = 0, aux = 0;
	
limpiar;                                                        // Limpia la pantalla.

iterar 
	leeTecla(letra);
	si(esComPal(letraAnterior, letra)) entonces
		palabra = letra;
	sinoSi(NO esSigno(letra)) entonces
		palabra+=letra;
	sinoSi(esFinPal(letraAnterior, letra))entonces
		for(int i = palabra.length()-1; i >=0; i--){
			si (palabra[i]==palabra[aux]) entonces
				cantLetrasIguales++;
			finSi
		aux++;
		}
		aux = 0;
		si(cantLetrasIguales==palabra.length() Y cantLetrasIguales>1)entonces
			palindroma += (palabra + " ");
		finSi
		cantLetrasIguales = 0;
	finSi
	salirSi (letra == '.');
	letraAnterior = letra;
	finIterar

mostrar << salto;
si (palindroma != "") entonces
	mostrar << "La(s) palabra(s) palíndroma(s) es(son): " << palindroma << salto;
finSi
	
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


