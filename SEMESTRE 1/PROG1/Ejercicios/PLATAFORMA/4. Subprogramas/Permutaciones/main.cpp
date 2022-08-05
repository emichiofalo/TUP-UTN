#include <program1.h>
#include "muestraV.h"
/**
*    Enunciado: Dado un conjunto, mostrar todas sus permutaciones.
*/
procedimiento permuta(entero t, vectorDin(entero) v) {
si(t > 2) entonces
    entero ind;
    variarMas1(ind,0,t-1)
        permuta(t-1,v);
        swap(v[ind],v[t-1]);
        finVariar
    sinoSi(t ES 2) entonces
    muestraV(v);
    swap(v[0],v[1]);
    muestraV(v);
    sino
    muestraV(v);
    finSi
}

funcion matrizDin2D(entero) permutaciones(entero t, vectorDin(entero) v) {
matrizDin2D(entero) resul {}
    ,mAux {};
si(t > 2) entonces
    entero ind;
    variarMas1(ind,0,t-1)
        mAux = permutaciones(t-1,v);
        paraCadaValor(vAux,mAux)
            agregaEleVDin(resul,vAux);
            finPara
        swap(v[ind],v[t-1]);
        finVariar
    sinoSi(t ES 2) entonces
    agregaEleVDin(resul,v);
    swap(v[0],v[1]);
    agregaEleVDin(resul,v);
    sino
    agregaEleVDin(resul,v);
    finSi
//muestraV(resul);
regresa(resul);
}

funcion largo largo valor(vectorDin(entero) v) {
largo largo resul = 0;
paraCadaValor(ele,v)
    resul = resul * 10 + ele;
    finPara
regresa(resul);
}

//procedimiento ordena(matrizDin2D(entero) porRef vPer) {
//logico estaOrd = VERDADERO;
//entero i,fin
//      ,ult = tamanio(vPer)-1
//      ,uc = ult;
//repetir
//    estaOrd = VERDADERO;
//    fin = uc;
//    variarMas1(i,1,ult)
//        si(valor(vPer[i])<valor(vPer[i-1])) entonces
//            swap(vPer[i],vPer[i-1]);
//            uc = i;
//            estaOrd = FALSO;
//            finSi
//        finVariar
//    hasta(estaOrd)
//}
procedimiento ordenaZona(entero izq, entero med, entero der, matrizDin2D(entero) porRef mat) {
matrizDin2D(entero) m1Aux,m2Aux;
entero i1,i2;
variarMas1(i1,izq,med)
    agregaEleVDin(m1Aux,mat[i1]);
    finVariar
//muestraV(m1Aux);
variarMas1(i2,med+1,der)
    agregaEleVDin(m2Aux,mat[i2]);
    finVariar
//muestraV(m2Aux);
i1 = 0; i2 = 0;
entero i3
    ,t1 = tamanio(m1Aux)
    ,t2 = tamanio(m2Aux);
variarMas1(i3,izq,der)
//    muestraV(m1Aux[i1]);
//    muestraV(m2Aux[i2]);
    si((i1 < t1) Y ((i2 >= t2) O (valor(m1Aux[i1]) < valor(m2Aux[i2])))) entonces
        mat[i3] = m1Aux[i1++];
        sino
        mat[i3] = m2Aux[i2++];
        finSi
    finVariar
}

procedimiento ordenaRecursivo(entero izq,entero der,matrizDin2D(entero) porRef mPer) {
//mostrar << "Ordenando entre "<< izq << " y " << der << "...\n";
si((der - izq) >= 2) entonces
    entero med = (izq+der) / 2;
    ordenaRecursivo(izq,med,mPer);
    ordenaRecursivo(med+1,der,mPer);
    ordenaZona(izq,med,der,mPer);
    sinoSi(der - izq ES 1 Y valor(mPer[der]) < valor(mPer[izq])) entonces
    swap(mPer[izq],mPer[der]);
    finSi
//mostrar << "Completado entre "<< izq << " y " << der << "...\n";
}

procedimiento ordena(matrizDin2D(entero) porRef vPer) {
ordenaRecursivo(0,tamanio(vPer)-1,vPer);
}


principal                                                       // Unidad de programa principal
vectorDin(entero) conj;
entero ind;
limpiar;                                                        // Limpia la pantalla.
mostrar << "Comenzado " << cadLargaAhora() << " - " << salto;
variarMas1(ind,0,9)
    agregaEleVDin(conj,ind);
    finVariar
//muestraV(conj);
mostrar << "Generando permutaciones..." << salto;
auto cronometro = ahora();
matrizDin2D(entero) vPermu = permutaciones(tamanio(conj),conj);
auto crono2= ahora();
//muestraV(vPermu);
mostrar << tamanio(vPermu)<< " Completadas en " << lapsoMilisegs(cronometro,crono2) << " milisegundos."<< salto
<< "Ordenando..." << salto;
ordena(vPermu);
mostrar << "Completado en " << lapsoMilisegs(crono2,ahora()) << " milisegundos."<< salto;
//muestraV(vPermu);
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal
