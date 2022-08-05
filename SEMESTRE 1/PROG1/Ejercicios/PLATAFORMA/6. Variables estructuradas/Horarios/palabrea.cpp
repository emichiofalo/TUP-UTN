#include <program1.h>                                           // Archivo de traducción de seudocódigo a C++
funcion vectorDin(cadena) palabrea(cadena fr) {
vectorDin(cadena) resul;
cadena pal;
caracter cAnt = ' ';
fr += ".";
paraCada(c,fr)
    si(esComPal(cAnt,c)) entonces
        pal = c;
        sinoSi(NO esSigno(c)) entonces
        pal += c;
        sinoSi(esFinPal(cAnt,c)) entonces
        agregaEleVDin(resul,pal);
        finSi
    cAnt = c;
    finParaCada
regresa(resul);
}
