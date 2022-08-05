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
	procedimiento leeMat(entero cFi,entero cCo,Tipo m[TAMFILA][TAMCOLU]) {
		entero f,c;
#ifdef GENERAZAR
		{mostrar << "Inicializando con "<<tiempo++ << salto;srand(time(NULL));}
#endif
		variar(f,0,cFi-1,1)
			variar(c,0,cCo-1,1)
#ifdef DEPURACION
			m[f][c] = alAzarEntreMinMax;
#else
		leerM(m[f][c],"Valor("<<f+1<<","<<c+1<<"):");
#endif
		finVariar
			finVariar
	}

implementa procedimiento leeMat(entero,entero,real[TAMFILA][TAMCOLU]);
