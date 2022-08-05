#include <program1.h>

plantilla(Tipo)
funcion entero dondeBin(entero t,Tipo v[],Tipo vAb) {
entero resul = (-1);
si(v[0] < vAb Y vAb < v[t-1]) entonces                                               // Está entre el primero y el último sin ser 1° ni último
    entero i = 0
          ,d = t - 1
          ,m;
    mientras(d - i >= 2)                                                             // Hay lugar para m -> i < m < d
        m = (i + d) / 2;                                                             // m está al medio
#ifdef DEPURACION
mostrar << "Buscando entre " << v[i] << " y " << v[d] << salto;
#endif
        si(v[m] < vAb) entonces                                                      // Esta en la mitad derecha
            i = m;
            sinoSi(vAb < v[m]) entonces                                               // Está en la mitad izquierda
            d = m;
            sino                                                                     // ¡Lo encontramos!
            resul = m;
            i = d;
            finSi
        finMientras
    sinoSi(v[0] > vAb O vAb > v[t-1]) entonces                                       // No está
    resul = (-1);
    sinoSi(v[0] ES vAb) entonces                                                     // Es el primero
    resul = 0;
    sino                                                                             // Es el último
    resul = t - 1;
    finSi
regresa(resul);
}
implementa funcion entero dondeBin(entero,real[],real);
implementa funcion entero dondeBin(entero,entero[],entero);

plantilla(Tipo)
funcion logico estaBin(entero t,Tipo v[],Tipo vAb) {
logico resul = dondeBin(t,v,vAb) >= 0;
regresa(resul);
}
implementa funcion logico estaBin(entero,real[],real);
implementa funcion logico estaBin(entero,entero[],entero);