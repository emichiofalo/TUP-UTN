#include <program1.h>
#include "busquedabin.h"

plantilla(Tipo)
funcion largo dondeBin(vectorDin(Tipo) v, Tipo vAb) {
entero t = tamanio(v);
entero resul = (-1);
si((primeroDelVec(v) < vAb) Y (vAb < ultimoDelVec(v))) entonces                  // Está entre el primero y el último sin ser 1° ni último
    entero i = 0
          ,d = t - 1
          ,m;
    mientras(d - i >= 2)                                                         // Hay lugar para m -> i < m < d
        m = (i + d) / 2;                                                         // m está al medio
                                                                                //#ifdef DEPURACION
                                                                                //mostrar << "Buscando entre " << v[i] << " y " << v[d] << salto;
                                                                                //#endif
        si(v[m] < vAb) entonces                                                  // Esta en la mitad derecha
            i = m;
            sinoSi(vAb < v[m]) entonces                                          // Está en la mitad izquierda
            d = m;
            sino                                                                 // ¡Lo encontramos!
            resul = m;
            i = d;
            finSi
        finMientras
    sinoSi(v[0] ES vAb) entonces                                                 // Es el primero
    resul = 0;
    sinoSi(v[t-1] ES vAb) entonces                                               // Es el último
    resul = t - 1;
////    sinoSi(v[0] > vAb O vAb > v[t-1]) entonces                                       // No está
////    resul = (-1);
    finSi
regresa(resul);
};

implementa funcion largo dondeBin(vectorDin(Persona),Persona);
implementa funcion largo dondeBin(vectorDin(Marcacion),Marcacion);

plantilla(Tipo)
funcion logico estaBin(vectorDin(Tipo) v, Tipo vAb) {
logico resul {(tamanio(v) > 0) Y (dondeBin(v,vAb) >= 0)};
regresa(resul);
};

implementa funcion logica estaBin(vectorDin(Persona),Persona);
implementa funcion logica estaBin(vectorDin(Marcacion),Marcacion);

plantilla(Tipo)
funcion largo posicionBin(vectorDin(Tipo) v, Tipo vAb) {
entero t = tamanio(v);
entero resul = 0;
si(t > 0) entonces
    si((primeroDelVec(v) < vAb) Y (vAb < ultimoDelVec(v))) entonces                  // Está entre el primero y el último sin ser 1° ni último
        entero i = 0
              ,d = t - 1
              ,m;
        mientras(d - i >= 2)                                                         // Hay lugar para m -> i < m < d
            m = (i + d) / 2;                                                         // m está al medio
                                                                                    //#ifdef DEPURACION
                                                                                    //mostrar << "Buscando entre " << v[i] << " y " << v[d] << salto;
                                                                                    //#endif
            si(v[m] < vAb) entonces                                                  // Esta en la mitad derecha
                i = m;
                resul = d;
                sinoSi(vAb < v[m]) entonces                                          // Está en la mitad izquierda
                d = m;
                resul = d;
                sino                                                                 // ¡Lo encontramos!
                resul = m;
                i = d;
                finSi
            finMientras
        sinoSi(v[0] >= vAb) entonces                                                 // Es el primero
        resul = 0;
        sinoSi(v[t-1] ES vAb) entonces                                               // Es el último
        resul = t - 1;
        sino                                                                         // No está
        resul = t;
        finSi
    finSi
regresa(resul);
};

implementa funcion largo posicionBin(vectorDin(Persona),Persona);
implementa funcion largo posicionBin(vectorDin(Marcacion),Marcacion);