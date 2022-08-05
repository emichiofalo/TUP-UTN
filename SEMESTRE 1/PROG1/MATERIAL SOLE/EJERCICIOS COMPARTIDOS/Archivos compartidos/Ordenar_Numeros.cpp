/*
    program1.h es el archivo de traducción de seudocódigo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado:ingresar 3 numeros y mostrarlos ordenados...  
*/
principal                                                       // Unidad de programa principal
	                                                            // Declaraciones: A continuación se declaran las variables del programa...
	real valor1;												//Variable que almacenara el primer numero
    real valor2;			
	real valor3;
	
		 
	
	
limpiar;                                                        // Limpia la pantalla.
	leerM(valor1," por favor ingrese el primer valor :");			//Código: (a continuación de este comentario...)	
	leerM(valor2," por favor ingrese el segundo valor :");	
	leerM(valor3," por favor ingrese el tercer valor :");
	
si (valor1<=valor2 Y valor2<=valor3) entonces;					//Condicional que compara al primer valor con los demas
	mostrar<<valor1<< " ,"<<valor2<<" , " <<valor3;
sinoSi(valor1<=valor3 Y valor3<=valor2)entonces;	
	mostrar<<valor1<< " ,"<<valor3<<" , " <<valor2;
sinoSi(valor2<=valor1 Y valor1<=valor3)entonces;				//Condicional que compara al segundo valor con los demas
	mostrar<<valor2<< " ,"<<valor1<<" , " <<valor3;
sinoSi (valor2<=valor3 Y valor3<=valor1) entonces;
	mostrar<<valor2<< " ,"<<valor3<<" , " <<valor1;
sinoSi(valor3<=valor1 Y valor1<=valor2)entonces;				//Condicional que compara al tercer valor con los demas
	mostrar<<valor3<< " ,"<<valor1<<" , " <<valor2;
sinoSi(valor3<=valor2 Y valor2<=valor1)entonces;	
	mostrar<<valor3<< " ,"<<valor2<<" , " <<valor1;	
	
finSi
	mostrar << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
