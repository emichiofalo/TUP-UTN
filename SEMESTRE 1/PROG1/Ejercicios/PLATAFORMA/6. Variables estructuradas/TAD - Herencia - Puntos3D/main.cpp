#include <program1.h>
#include "Punto3D.h"
/**
*    Enunciado: 
*/



principal                                                       // Unidad de programa principal
Punto1D p1
       ,p2("2")
       ,p3(3.3);
Punto2D p4("4")
       ,p5("5",5.5,5.55);
p1.leePunto();
p2 = p1;
p1.muestraPunto(VERDADERO);
p2.muestraPunto(VERDADERO);
p3 = p2;
p4.leePunto();
p3.muestraPunto(VERDADERO);
p4.muestraPunto(VERDADERO);
Punto3D p6
       ,p7("7",6.,4.,3.)
       ,p8("8",9.,8.,8.);
p6.leePunto();
p7.muestraPunto(VERDADERO);
mostrar << "La distancia entre puntos es " << p7.distancia3D(p8) << salto;
vectorDin(Punto1D) vP;
agregaEleVDin(vP,p1);
agregaEleVDin(vP,p2);
agregaEleVDin(vP,p3);
agregaEleVDin(vP,p4);
agregaEleVDin(vP,p5);
agregaEleVDin(vP,p6);
agregaEleVDin(vP,p7);
agregaEleVDin(vP,p8);
paraCada(p,vP)
    p.muestraPunto(VERDADERO);
    finPara
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal

