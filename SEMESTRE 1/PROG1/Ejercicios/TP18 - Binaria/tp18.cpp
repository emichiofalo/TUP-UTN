#include <program1.h>                                           // Archivo de traducción de seudocódigo a C++
void quickSort(vector<real>&arreglo, int inicio, int fin);
int particion(vector<real>&array,int inicio, int fin);
principal                                                       // Unidad de programa principal
	archivo datos;
	long x = 0;
	int v1 = 0, v2 = 0, cantidadDiferencias = 0;	
	vectorDin(long) vector1;
	vectorDin(long) vector2;
limpiar;                                                        // Limpia la pantalla.
	abrir(datos,"datosVD.txt",ALEER);
	datos >> v1;
	mostrar << v1 << salto;
	for (int i = 0; i < v1; i++){
		datos >> x;
		agregaEleVDin(vector1, x);
	}
	clasifica(vector1);
	
	datos >> v2;
	mostrar << v2 << salto;
	for (int i = 0; i < v2; i++){
		datos >> x;
		agregaEleVDin(vector2, x);
	}
	clasifica(vector2);
	
	paraCada (valor, vector1)
		if(!busquedaBinario(vector2, valor)){
			cantidadDiferencias++;
		}
	}
	
	mostrar << cantidadDiferencias << salto;
	
pausa;      
finPrincipal
