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
leerM(num1, "ingrese numero 1: ");
leerM(num2, "ingrese numero 2: ");
leerM(num3, "ingrese numero 3: ");
si ((num1 >= num2) && (num1 >= num3)) entonces;

mostrar << "el mayor de los numeros es  : "<<num1<< salto; 
finSi
si ((num2 >= num1) && (num2 >= num3)) entonces;
mostrar <<"el mayor de los numeros es  : "<<num2<< salto;
finSi
si ((num3>=num1)&&(num3 >=num2 )) entonces;
mostrar <<"el mayor de los numeros es  :" <<num3<< salto;
finSi	





pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
