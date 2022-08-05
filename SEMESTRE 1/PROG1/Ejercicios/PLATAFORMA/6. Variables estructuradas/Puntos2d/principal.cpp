#include <program1.h>
/**
* Enunciado: Dada una cantidad indeterminada de puntos sobre un plano bidimensional, encontrar los 2 más lejanos entre sí.
La carga finaliza con un punto sobre el origen, que debe ignorarse
*/
clase Punto2D {
privado:
    campo real x;
    campo real y;
publico:
    Punto2D() {};
    Punto2D(real,real);
    procedimiento leePunto();
    procedimiento mostrarP2D() {mostrar << "(" << x << ";" << y << ")" << salto;};
    funcion real dist2D(Punto2D);
    funcion logico enOrigen() {regresa(x ES 0. Y y ES 0.);};
    procedimiento estatico dosMLejos(vectorDin(Punto2D));
};

Principal
vectorDin(Punto2D) v;
Punto2D estePunto;
iterar
    estePunto.leePunto();
    salirSi(estePunto.enOrigen());
    agregaEleVDin(v,estePunto);
    finIterar
Punto2D::dosMLejos(v);
finPrincipal

Punto2D::Punto2D(real a, real b) {
x = a;
y = b;
}

procedimiento Punto2D::leePunto() {
leerM(x,"X:");
leerM(y,"Y:");
}

procedimiento Punto2D::dosMLejos(vectorDin(Punto2D) vP) {
entero t = tamanio(vP);
si(t >= 2) entonces
    Punto2D p1,p2
           ,p1ML = vP[0]
           ,p2ML = vP[1];
    real dist
        ,distML = vP[0].dist2D(vP[1]);
    entero i1,i2;
    variarMas1(i1,0,t-2)
        variarMas1(i2,i1+1,t-1)
            dist = vP[i1].dist2D(vP[i2]);
            si(dist > distML) entonces
                p1ML = vP[i1];
                p2ML = vP[i2];
                distML = dist;
                finSi
            finVariar
        finVariar
    p1ML.mostrarP2D();
    p2ML.mostrarP2D();
    finSi
}

funcion real Punto2D::dist2D(Punto2D otro) {
regresa(raiz2(cuadrado(x-otro.x) + cuadrado(y-otro.y)));
}
