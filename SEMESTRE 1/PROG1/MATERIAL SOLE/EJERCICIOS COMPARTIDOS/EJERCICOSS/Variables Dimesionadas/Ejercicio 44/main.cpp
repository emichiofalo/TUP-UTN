/*
    program1.h es el archivo de traducci�n de seudoc�digo a C++
    Copiarlo (en Linux): /usr/local/include
            o en Windows: c:\Archivos de Programa\Zinjai\MingW\Include              
    Si se mantiene en la misma carpeta que los fuentes, cambiar #include <program1.h> 
                                                            por #include "program1.h"
*/
#include <program1.h>
//#include "/home/carlos/.Zinjai/program1.h"
/**
*    Enunciado: Demostrar la Conjetura de Goldbach para los números pares entre 4 y 1000000.
*/
#include "../leemuestvec.h"
#include "../busquedabin.h"
procedimiento generaPrimos(entero,entero[],entero porRef,entero);
procedimiento muestraGoldbach(entero,entero[]);
funcion logico esPrimo(entero);

constante entero MAXVALOR = 1000100; 
constante entero TAM = 78500+(MAXVALOR-1000000)/20;

principal                                                                            // Unidad de programa principal
entero primo[TAM]
      ,cantPrimo;
limpiar;                                                                             // Limpia la pantalla.
generaPrimos(TAM,primo,cantPrimo,MAXVALOR);
mostrar << "Hay " << cantPrimo << " primos entre 1 y " << MAXVALOR << salto;
pausa;
//muestraVec(cantPrimo,primo);
muestraGoldbach(cantPrimo,primo);
pausa;                                                                               // Pausa antes de finalizar. 
finPrincipal                                                                         // Fin de unidad de programa principal

procedimiento muestraGoldbach(entero t,entero vP[]) {
entero primo1
      ,posPrimo2
      ,estePrimo
      ,noPrimo;
variar(noPrimo,4,MAXVALOR,2)
    estePrimo = 0;
    iterar
        primo1 = vP[estePrimo];
        posPrimo2 = dondeBin(t,vP,(noPrimo-primo1));
        salirSi(estePrimo >= (t -1) O posPrimo2 >= 0);
        estePrimo++;
        finIterar
    si(posPrimo2 >= 0) entonces
//        mostrar << noPrimo << " = " << primo1 << " + " << vP[posPrimo2] << salto;
        sino
        mostrar << "¡¡Goldbach se equivocó!!" << salto;
        pausa;
        finSi
    finVariar
}

procedimiento generaPrimos(entero t,entero vP[],entero porRef cPri,entero valorHasta) {
entero esteNro;
cPri = 0;                                                                            // Cantidad generada (ninguno)
variar(esteNro,1,valorHasta,1)                                                       // Nro. a verificar
    si(esPrimo(esteNro)) entonces                                                    // Si es primo,
        vP[cPri] = esteNro;                                                          // lo agregamos al vector
        cPri++;                                                                      //y lo contamos.
        finSi
    finVariar
}

funcion logico esPrimo(entero nro) {
logico resul = VERDADERO;
si(nro <= 0) entonces
    resul = FALSO;
    sinoSi(nro > 3) entonces
    entero divi = 2;
    mientras(resul Y divi * divi <= nro)
        si(esMult(nro,divi)) entonces
            resul = FALSO;
            sino
            divi++;
            finSi
        finMientras
    finSi
regresa(resul);
}