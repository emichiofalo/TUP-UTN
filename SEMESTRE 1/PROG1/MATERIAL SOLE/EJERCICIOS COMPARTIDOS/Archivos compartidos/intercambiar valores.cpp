// Archivo de traducci�n de seudoc�digo a C++
#include <program1.h>
/**
*    Enunciado: Dados dos n�meros, intercambiarlos.
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
