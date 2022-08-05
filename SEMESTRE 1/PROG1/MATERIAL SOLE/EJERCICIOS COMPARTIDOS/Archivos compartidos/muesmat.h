#include "tamMatriz.h"
#ifdef GENERAZAR
estatico largo tiempo = time(NULL);
#ifdef ORDENADO
#define VALORMINIMO     -100.0
#else
#define VALORMINIMO     -1000.0
#endif
#define VALORMAXIMO     +100.0
#define alAzarEntreMinMax  decimales(alAzarRealEntre(VALORMINIMO,VALORMAXIMO),2)
#endif

plantilla(Tipo)
	procedimiento muestMat(entero cFi,entero cCo,Tipo m[TAMFILA][TAMCOLU]) {
		entero f,c;
		mostrar << "Matriz de "<<cFi<<" filas por "<<cCo<<" columnas:"<<salto;
		variar(f,0,cFi-1,1)
			variar(c,0,cCo-1,1)
			mostrar << m[f][c] << tabulado;
		finVariar
			mostrar << salto;
		finVariar
	}

implementa procedimiento muestMat(entero,entero,real[TAMFILA][TAMCOLU]);

