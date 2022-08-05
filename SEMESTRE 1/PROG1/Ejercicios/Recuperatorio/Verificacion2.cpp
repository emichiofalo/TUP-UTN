#include "program1Windows.h"

void verificacion(vector<cadena> palabrasIniciales, vector<cadena> &palabras){
	logico tieneLetras;
	entero contador = 0;
	//mostrar << "Palabras no verificadas: ";
	for(cadena palabra : palabrasIniciales){
		tieneLetras = true;
		for(sinSigno i = 0; i < palabra.length(); i++){
			tieneLetras &= (esLetra(palabra.at(i))) ? true : false;
		}
		logico palNoVerificada = true;
		for(sinSigno i = 0; i < palabra.length(); i++){
			if((esVocal(palabra[i]) || palabra[L1(palabra)] == 'Y') && tieneLetras){
				agregaEleVDin(palabras, palabra);
				contador++;
				palNoVerificada = false;
				break;
			}
		}
		//if(palNoVerificada){
		//	mostrar << palabra << tabulado;
		//}
	}
	cout << endl;
	mostrar << "Cantidad de palabras verificadas: " << palabras.size() << salto;
}
