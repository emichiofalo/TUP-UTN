#include <program1.h>

funcion logico EsPalabra (cadena palabra){
	logico EsPalabra = FALSO;
	if(palabra.length()>1){
		for(int i=0; i<palabra.length();i++){
			if(!strchr("ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyzáéíóúüÁÉÍÓÚÜ",palabra[i])){
				EsPalabra = FALSO;
				return (EsPalabra);
			}else if (esVocal(palabra[i]) O palabra[palabra.length()-1]=='y'){
				EsPalabra = VERDADERO;
			}
		}
	}else{ 
		EsPalabra = FALSO;
		return (EsPalabra);
	}
	return (EsPalabra);
}
	
funcion logico PVconVocalAcentuada(cadena palabra){
	for(int i=0; i<palabra.length();i++){
		if(strchr("áéóíú",palabra[i])){
			return (VERDADERO);
		}else{
			return (FALSO);
		}
	}
}	

funcion int CantConsonantes(cadena palabra){
	int cantConsos = 0;
	for(int i=0; i<palabra.length();i++){
		if(esConso(palabra[i])){
			cantConsos++;
		}
	}
	return (cantConsos);
}

funcion logico TeminadaEnN(cadena palabra){
	for(int i=0; i<palabra.length();i++){
		if(palabra[palabra.length()-1]=='n'){
			return (VERDADERO);
		}else{
			return (FALSO);
		}
	}
}

funcion logico VaCVa(cadena palabra){
	logico existe;
	if(palabra.length() > 2){
		for(int i = 2; i < palabra.length() - 2; i++){
			logico VA1 = strchr("aeoáéó",palabra[i-2]);
			logico VA2 = strchr("aeoáéó",palabra[i]);
			logico Conso = esConso(palabra[i-1]);
			if((VA1 && Conso && VA2)){
				existe=VERDADERO;
			}else{
				existe=FALSO;
			}
		}		 
	}
	return (existe);
}
	
funcion logico VaCCVa(cadena palabra){
	logico existe;
	if(palabra.length() > 3){
		for(int i = 3; i < palabra.length() - 3; i++){
			logico VA1 = strchr("aeoáéó",palabra[i-3]);
			logico VA2 = strchr("aeoáéó",palabra[i]);
			logico Conso = esConso(palabra[i-1]) && esConso(palabra[i-2]);
			if((VA1 && Conso && VA2)){
				existe=VERDADERO;
			}else{
				existe=FALSO;
			}
		}		 
	}
	return (existe);
}
	
funcion logico VaCCCVa(cadena palabra){
	logico existe;
	if(palabra.length() > 4){
		for(int i = 4; i < palabra.length() - 4; i++){
			logico VA1 = strchr("aeoáéó",palabra[i-4]);
			logico VA2 = strchr("aeoáéó",palabra[i]);
			logico Conso = esConso(palabra[i-1]) && esConso(palabra[i-2]) && esConso(palabra[i-3]);
			if((VA1 && Conso && VA2)){
				existe=VERDADERO;
			}else{
				existe=FALSO;
			}
		}		 
	}
	return (existe);
}
	
funcion logico VaCCCCV(cadena palabra){
	logico existe;
	if(palabra.length() > 5){
		for(int i = 4; i < palabra.length() - 5; i++){
			logico VA1 = strchr("aeoáéó",palabra[i-5]);
			logico VA2 = strchr("aeoiuáéóíú",palabra[i]);
			logico Conso = esConso(palabra[i-1]) && esConso(palabra[i-2]) && esConso(palabra[i-3])&& esConso(palabra[i-4]);
			if((VA1 && Conso && VA2)){
				existe=VERDADERO;
			}else{
				existe=FALSO;
			}
		}		 
	}
	return (existe);
}

principal
	archivo datos;
	cadena palabra, silaba;
	vector<cadena> palabras;
	int palabrasLeidas=0;
	int PVcVocAcent=0,cantConsos=0,terminaN=0,cantVaCVa=0,cantVaCCVa=0,cantVaCCCVa=0,cantVaCCCCV=0;
	
limpiar;
abrir(datos,"datos.txt",ALEER);
	iterar
	datos >> palabra;
	salirSi(datos.eof() O palabra=="");
	palabrasLeidas++;
	cantConsos+=CantConsonantes(palabra);
	if (EsPalabra(palabra)){
		agregaEleVDin(palabras, palabra);
	}
	finIterar 

	paraCada(palabra, palabras)
		if(PVconVocalAcentuada(palabra)){
			PVcVocAcent++;
		}
		if(TeminadaEnN(palabra)){
			terminaN++;
		}
		if(VaCVa(palabra)){
			cantVaCVa++;
		}
		if(VaCCVa(palabra)){
			cantVaCCVa++;
		}
		if(VaCCCVa(palabra)){
			cantVaCCCVa++;
		}
		if(VaCCCCV(palabra)){
			cantVaCCCCV++;
		}
	}
	
	mostrar << "Total palabras leidas: " << palabrasLeidas << salto;	
	mostrar << "Total palabras validas: " << palabras.size() << salto;
	mostrar << "Palabras validas con vocal acentuada: " << PVcVocAcent << salto;
	mostrar << "Cantidad total de consonantes en el archivo: " << cantConsos << salto;
	mostrar << "Palabras validas terminadas en n: " << terminaN << salto;
	mostrar << "Palabras validas con vocal abierta-consonante-vocal abierta: " << cantVaCVa << salto;
	mostrar << "Palabras validas con vocal abierta-consonante-consonante-vocal abierta: " << cantVaCCVa << salto;
	mostrar << "Palabras validas con vocal abierta-consonante-consonante-consontante-vocal abierta: " << cantVaCCCVa << salto;
	mostrar << "Palabras validas con vocal abierta-consonante-consonante-consontante-consonante-vocal: " << cantVaCCCCV << salto;
	
pausa;
finPrincipal

