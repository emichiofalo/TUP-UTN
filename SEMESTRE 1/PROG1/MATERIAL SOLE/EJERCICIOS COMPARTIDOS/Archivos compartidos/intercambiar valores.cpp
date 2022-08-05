// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: Dados dos números, intercambiarlos.
*/
procedimiento intercambiar(doble porRef,doble porRef);

principal                                                       // Unidad de programa principal
doble uno,dos;
limpiar;                                                        // Limpia la pantalla.
leerM(uno,"Primer valor:");
leerM(dos,"Segundo valor:");
intercambiar(uno,dos);
mostrar << "Los valores intercambiados son:" << uno << " y " << dos << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.

procedimiento intercambiar(doble porRef x, doble porRef y) {
doble z = x;
x = y;
y = z;
}
