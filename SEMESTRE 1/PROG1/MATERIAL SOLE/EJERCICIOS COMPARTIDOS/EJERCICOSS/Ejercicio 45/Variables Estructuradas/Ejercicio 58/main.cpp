/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
/**
*    Enunciado: Dado un conjunto (a leer o generar aleatoriamente) de entre 2 y 100 puntos (el tamaño debe elegirlo el usuario) en coordenadas cartesianas
                sobre un espacio bidimensional, se quiere averiguar:
                - La ubicación promedio de los puntos del cuadrante 3 (promedio de las coordenadas horizontal y vertical sólo de los puntos del
                  cuadrante 3).
                - La identificación de los puntos ordenados por distancia respecto del origen pertenecientes al cuadrante 1.
                En ambos casos debe contemplarse la posibilidad que no existan puntos que cumplan esas condiciones en cuyo caso la respuesta debe ser 
                algo similar a “Sin puntos...”.
*/
#include "../punto2D.h"
#include "../leerVar.h"
#include "../intercambiar.h"

procedimiento ubPromC3(entero,Punto2D[]);
procedimiento ordenaPorDistAlCentro(entero,Punto2D[]);

constante entero TAM = 270000;

principal                                                                            // Unidad de programa principal
Punto2D vP2D[TAM];
entero cantP;
limpiar;                                                                             // Limpia la pantalla.
leerVar(cantP,2,TAM,"Cantidad de puntos");
Punto2D::leeVecP2D(cantP,vP2D);
ubPromC3(cantP,vP2D);
ordenaPorDistAlCentro(cantP,vP2D);
pausa;                                                                               // Pausa antes de finalizar. 
finPrincipal                                                                         // Fin de unidad de programa principal

//plantilla(Tipo)
procedimiento juntar(entero t, entero i[], real d[], entero izq, entero med, entero der) {
entero aux1[TAM];
real aux2[TAM];
entero i1 = izq                                                                      // Posici�n inicial del subvector izquierdo
      ,i2 = med + 1                                                                  // Posicion inicial del subvector derecho
      ,ind;
variar(ind,0,der-izq+1,1)
    si( i2 > der O i1 <= med Y d[i1] <= d[i2] ) entonces                             // Si debe tomar del lado izquierdo
        aux1[ind] = i[i1];
        aux2[ind] = d[i1++];
        sino
        aux1[ind] = i[i2];
        aux2[ind] = d[i2++];
        finSi
    finVariar
variar(ind,0,der-izq,1)
    i[izq+ind] = aux1[ind];
    d[izq+ind] = aux2[ind];
    finVariar
}

//implementa procedimiento juntar(entero,real[],entero,entero,entero);

/*plantilla(Tipo) 
*/
procedimiento indizaID(entero tInd, entero ind[], real dist[], entero izq, entero der) {
entero med;
si(izq + 1 < der) entonces
    med = (izq + der) / 2;
    indizaID(tInd,ind,dist,izq  ,med);                                               // Ordena la parte izquierda
    indizaID(tInd,ind,dist,med+1,der);
    juntar(tInd,ind,dist,izq,med,der);
    sinoSi(izq+1 ES der Y dist[der] < dist[izq]) entonces                            // Es un subvctor de 2 elementos desordenados
    intercambiar(ind[izq],ind[der]);                                                 // y el intercambio lo ordena.
    intercambiar(dist[izq],dist[der]);                                               // y el intercambio lo ordena.
    finSi
}

//implementa procedimiento ordenaID(entero,real[],entero,entero);

//plantilla(Tipo)
procedimiento indizaPuntos2D(entero tInd, entero ind[], real dist[]) {
indizaID(tInd,ind,dist,0,tInd-1);
}

//implementa procedimiento indizaPuntos2D(entero,real[]);

procedimiento ordenaPorDistAlCentro(entero t, Punto2D v[]) {
real distAlCtro[TAM];
entero iP2D[TAM]                                                                     // vector de enlaces explícito sobre el vector de puntos
      ,cantPC1 = 0                                                                   // Cantidad de puntos del cuadrante 1 (hasta ahora ninguno)
      ,i;
variar(i,0,t-1,1)
    si(v[i].cuadrante() ES 1) entonces                                               // Si es del primer cuadrante
        iP2D[cantPC1] = i;                                                           // guardamos la ubicación dentro del vector de puntos y contamos uno más,
        distAlCtro[cantPC1++] = XalaY((cuadrado(v[i].x) + cuadrado(v[i].y)),0.5);    // y calculamos su distancia.
        finSi
    finVariar
si(cantPC1 > 0) entonces
    indizaPuntos2D(cantPC1,iP2D,distAlCtro);
    variar(i,0,cantPC1-1,1)
        v[iP2D[i]].muestra();
        mostrar << " está a una distancia "<<distAlCtro[i] << ".\n";
        finVariar
    sino
    mostrar << "No hay puntos en el cuadrante 1.\n";
    finSi
}

procedimiento ubPromC3(entero t, Punto2D v[]) {
real sumaX = 0.f                                                                     // Acumuladores de X eY
    ,sumaY = 0.f;                                                                    // (inicializados en cero)
entero cPC3 = 0
      ,i;
variar(i,0,t-1,1)
    si(v[i].cuadrante() ES 3) entonces                                               // Si el punto es del cuadrante 3
        cPC3++;                                                                      // se cuenta y
        sumaX += v[i].x;                                                             // se acumulan sus coordenadas X
        sumaY += v[i].y;                                                             // e Y.
        finSi
    finVariar
si(cPC3 > 0) entonces
    mostrar << "La ubicación promedio de los " << cPC3 << " puntos del cuadrante 3 es: (" << sumaX/cPC3 << ";" << sumaY/cPC3 << ")\n";
    sino
    mostrar << "No hay puntos en el cuadrante 3.\n";
    finSi
}
