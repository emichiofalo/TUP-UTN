// Archivo de traducción de seudocódigo a C++
#include "program1.h"
/**
*    Enunciado: Dado un año , un mes y un dia, calcule el nro de diastranscurridos desde el 31 de diciembre del año anterior
*/
funcion logico esBisiesto(entero a){
	logico resul=esMult (a,1) Y
			 NO esMult (a ,100) O
		        esMult (a, 400);
	regresa (resul);
}
principal                                                       // Unidad de programa principal
entero d,m,a;																// Declaraciones: A continuación se declaran las variables del programa...										
limpiar;                                                        // Limpia la pantalla.
leerM(a,"año: ");
leerM(m,"mes(1 a 12):");
si (1<=m Y m<=12) entonces;
leerM(d , "dia:");
	segun (m)
		caso 1: si (1<=d ) entonces;
				mostrar<<d<<salto;
				sino 
					mostrar <<" ingrese un dia valido "<<salto;
				finSi
		otroCaso 2: si (1<=d Y(d<=28 O d ES 29 Y esBisiesto(a)))entonces;
					mostrar<<d+31<<salto;
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi
		otroCaso 3: si(1<= d Y d <=31)entonces;
					mostrar <<31+28+d+fSi(esBisiesto(a),1,0)<<salto;	
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi
		otroCaso 4: si(1<= d Y d <=30)entonces;
					mostrar <<31+28+31+d+fSi(esBisiesto(a),1,0)<<salto;	
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi
	    otroCaso 5: si(1<= d Y d <=31)entonces;
					mostrar <<31+28+31+30+d+fSi(esBisiesto(a),1,0)<<salto;	
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi				
	    otroCaso 6: si(1<= d Y d <=30)entonces;
					mostrar <<31+28+31+30+31+d+fSi(esBisiesto(a),1,0)<<salto;	
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi
		otroCaso 7: si(1<= d Y d <=31)entonces;
					mostrar <<31+28+31+30+31+30+d+fSi(esBisiesto(a),1,0)<<salto;	
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi				
		otroCaso 8: si(1<= d Y d <=31)entonces;
					mostrar <<31+28+31+30+31+30+31+d+fSi(esBisiesto(a),1,0)<<salto;	
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi
		otroCaso 9: si(1<= d Y d <=30)entonces;
					mostrar <<31+28+31+30+31+30+31+31+d+fSi(esBisiesto(a),1,0)<<salto;	
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi
		otroCaso 10: si(1<= d Y d <=31)entonces;
					mostrar <<31+28+31+30+31+30+31+31+30+d+fSi(esBisiesto(a),1,0)<<salto;
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi
		otroCaso 11: si(1<= d Y d <=30)entonces;
					mostrar <<31+28+31+30+31+30+31+31+30+31+d+fSi(esBisiesto(a),1,0)<<salto;
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi
		otroCaso 12: si(1<= d Y d <=31)entonces;
					mostrar <<31+28+31+30+31+30+31+31+30+31+30+d+fSi(esBisiesto(a),1,0)<<salto;	
					sino 
						mostrar <<" ingrese un dia valido "<<salto;
					finSi
	finSegun;
sino 
	mostrar <<"mes invalido"<<salto;
finSi
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.
