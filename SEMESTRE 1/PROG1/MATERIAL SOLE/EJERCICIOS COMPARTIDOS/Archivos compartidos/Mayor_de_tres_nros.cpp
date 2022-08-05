/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: ingresar tres numeros y determinar el mayor de ellos
*/
principal                                                       // Unidad de programa principal
real num1;
real num2;
real num3;

	
	
	
	
limpiar;                                                        // Limpia la pantalla.
leerM(num1, "ingrese numero1: ");
leerM(num2, "ingrese numero2: ");
leerM(num3, "ingrese numero3: ");

si (num1 ES num2 Y num2 ES num3)entonces;
mostrar <<"los tres numeros son iguales"<< salto;


sinoSi(num1 > num2 Y num1 > num3) entonces;
mostrar << "el mayor de los numeros es el primero cuyo valor es : "<<num1<< salto; 

sinoSi (num2 > num1 Y num2 > num3) entonces;
		mostrar <<"el mayor de los numeros es el segundo cuyo valor es : "<<num2<< salto;

sinoSi (num3>num1 Y num3 >num1 ) entonces;
		mostrar <<"el mayor de los numeros es el tercero cuyo valor es :" <<num3<< salto;
sino(num1 ES num2 Y num1 NOES num3);
		mostrar<<"los dos primeros numeros ingresados son iguales "<< salto;		   
finSi;




pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
