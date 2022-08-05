#include "program1Windows.h"

procedimiento cantidadVAcen(vector<cadena> palabras){
	entero i,cantidad=0;
	paraCada(palabra,palabras)
		variarMas1(i,0,longitud(palabra)-1)
		si(palabra.at(i)=='á'||palabra.at(i)=='é'||palabra.at(i)=='í'||palabra.at(i)=='ó'||palabra.at(i)=='ú'||palabra.at(i)=='Á'||palabra.at(i)=='É'||palabra.at(i)=='Í'||palabra.at(i)=='Ó'||palabra.at(i)=='Ú')entonces
		cantidad+=1;
	break;
	finSi
		finVariar
		finPara
		mostrar<<"Cantidad de palabras validas con vocal acentuada: "<< cantidad <<salto;
}
	
procedimiento cantidadConso(vector<cadena> palabras){
	entero cantidad=0;
	paraCada(palabra,palabras)
		for(unsigned i=0; i<palabra.length();i++){
			si(esConso(palabra[i]))entonces
				cantidad+=1;
			finSi
		}
	finParaCada
		mostrar<<"Cantidad de consonantes del archivo de datos: "<<cantidad<<salto;
}

procedimiento cantidadEmpiezanConso(vector<cadena> palabras){
	entero cantidad=0;
	paraCada(palabra,palabras)
		si(esConso(palabra.at(0)))entonces
		cantidad+=1;
	finSi
		finPara
		mostrar<<"Cantidad de palabras validas que empiezan con consonante: "<<cantidad<<salto;
}
	
procedimiento cantidadVACVA(vector<cadena> palabras){	
	entero i,cantidad=0;
	paraCada(palabra,palabras)
		si(longitud(palabra)>=3)entonces
		variarMas1(i,0,longitud(palabra)-3)
		si(strchr("äëöaeoáéóAÁEÉOÓ",palabra[i]) Y esConso(palabra.at(i+1)) Y strchr("äëöaeoáéóAÁEÉOÓ",palabra[i+2]))entonces
		cantidad+=1;
	break;
	finSi
		finVariar
		finSi
		finPara
		mostrar<<"Cantidad de palabras validas con vocal abierta-consonante-vocal abierta: "<<cantidad<<salto;
}
	
procedimiento cantidadVAocCCVAoc(vector<cadena> palabras){
	int suma = 0;
	bool cumplio = FALSO;
	for(cadena palabra : palabras){
		cumplio=FALSO;
		if(palabra.length() >= 4){
			for(unsigned i = 0; i < palabra.length() - 3; i++){
				if(cumplio NOES VERDADERO){
					bool vocalesOpcion1 = (strchr("aeoáéóAEOÁÉÓ",palabra[i])) && (strchr("iuíúïüIUÍÚÏÜ",palabra[i+3]));
					bool vocalesOpcion2 = (strchr("iuíúïüIUÍÚÏÜ",palabra[i])) && (strchr("aeoáéóAEOÁÉÓ",palabra[i+3]));
					bool vocales = vocalesOpcion1 || vocalesOpcion2;
					suma += (vocales && esConso(palabra[i+1]) && esConso(palabra[i+2])) ? 1 : 0;
					cumplio = (vocales && esConso(palabra[i+1]) && esConso(palabra[i+2])) ? VERDADERO : FALSO;
				}
			}
		}
	}
	cout << "Cantidad de palabras validas con vocal-consonante-consonante-vocal con una vocal abierta y una cerrada: " << suma << endl;
}
	
procedimiento cantidadVcCCCV(vector<cadena> palabras){
	entero i,cantidad=0;
	paraCada(palabra,palabras)
		si(longitud(palabra)>=5)entonces
		variarMas1(i,0,longitud(palabra)-5)
		si(strchr("iuíúïüIUÍÚÏÜ",palabra[i]) Y esConso(palabra.at(i+1)) Y esConso(palabra.at(i+2)) Y esConso(palabra.at(i+3)) Y esVocal(palabra[i+4]))entonces
		cantidad+=1;
	break;
	finSi
		finVariar
		finSi
		finPara
		mostrar<<"Cantidad de palabras validas con vocal cerrada-consonante-consonante-consonante-vocal: "<<cantidad<<salto;
}	
	
procedimiento cantidadVcCCCCV(vector<cadena> palabras){
	entero i,cantidad=0;
	paraCada(palabra,palabras)
		si(longitud(palabra)>=6)entonces
		variarMas1(i,0,longitud(palabra)-6)
		si(strchr("iuíúïüIUÍÚÏÜ",palabra[i]) Y esConso(palabra.at(i+1)) Y esConso(palabra.at(i+2)) Y esConso(palabra.at(i+3)) Y esConso(palabra.at(i+4)) Y esVocal(palabra[i+5]))entonces
		cantidad+=1;
	break;
	finSi
		finVariar
		finSi
		finPara
		mostrar<<"Cantidad de palabras validas con vocal cerrada-consonante-consonante-consonante-consonante-vocal: "<<cantidad<<salto;
}	
	
