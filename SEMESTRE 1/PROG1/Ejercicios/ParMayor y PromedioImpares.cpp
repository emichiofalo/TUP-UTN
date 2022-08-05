#include <program1.h>
/**
*  Enunciado:  encontrar el mayor de los pares y el promedio de los impares
*/
principal                                                       // Unidad de programa principal

	entero numeros [10] = {5,8,4,29,31,58,9,98,59,24};
	entero parMayor = 0;
	entero acumuladorImpar = 0;
	entero totalSumaImpar = 0;
	
limpiar;                                                        // Limpia la pantalla.

	for (int i = 0; i < 10; i++){
		if (numeros[i]%2==0){
			if (numeros[i]>parMayor)
				parMayor=numeros[i];
		}else if (numeros[i]%2!=0){
			acumuladorImpar++;
			totalSumaImpar += numeros[i];
		};
	}
	
	mostrar << "El mayor número par es " << parMayor << salto;
	mostrar << "El promedio de los impares es " << (double)totalSumaImpar/acumuladorImpar << salto;

pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


