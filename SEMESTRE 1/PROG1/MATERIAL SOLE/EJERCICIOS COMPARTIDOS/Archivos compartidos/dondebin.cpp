#include <program1.h>
/**
*    Funci�n de b�squeda binaria versi�n UTN-FRM
*/
#undef DEPURACION
funcion entero dondeBin(entero t, real v[], real vAb) {
entero izq,med,der
      ,resul = (-1);                                            // Hip�tesis pesimista
si(v[0] < vAb Y vAb < v[t-1]) entonces                          // Lo buscaremos en forma binaria
    izq = 0;
    der = t-1;
    mientras(izq+1 < der)                                       // Bucle de b�squeda
        med = (izq + der) / 2;
#ifdef DEPURACION
mostrar << "Izq:" << izq << tabulado <<"Der:" << der << salto;
#endif
        si(v[med] < vAb) entonces                               // El valor central est� a la izquierda del valor buscado
            izq = med;                                          // v[izq] < vAb < v[der]
            sinoSi(v[med] > vAb) entonces                       // sino, si est� a la derecha
            der = med;                                          // v[izq] < vAb < v[der]    
            sino                                                // �Lo encontramos!
            resul = med;                                        // y regresamos su posici�n.
            izq = der;                                          // Para salir de inmediato del bucle...
            finSi
        finMientras
    sinoSi(v[0] ES vAb) entonces
    resul = 0;
    sinoSi(v[t-1] ES vAb) entonces
    resul = t-1;
    finSi
regresa(resul);
}
