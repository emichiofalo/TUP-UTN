#include <program1.h>
/**
*  Enunciado:  
*/
principal                                                       // Unidad de programa principal
entero valor1,valor2;
//real valor3;
leerM(valor1,"valor1:");
leerM(valor2,"valor2:");
mostrar << valor1 << "/" << valor2 << "="<< (valor1       / valor2) << salto;
//valor3 = (valor1 / valor2);
//mostrar << valor1 << "/" << valor2 << "="<< valor3 << salto;
mostrar << valor1 << "/" << valor2 << "="<< ((real)valor1 / valor2) << salto;
mostrar << valor1 << "/" << valor2 << "="<< (valor1 / (real)valor2) << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal


