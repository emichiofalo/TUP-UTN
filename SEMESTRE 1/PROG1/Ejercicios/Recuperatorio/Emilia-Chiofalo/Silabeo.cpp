#include "program1Windows.h"
#include <map>

bool alMenosUnaVocal(string palabra){
	for(int i=0;i<palabra.length();i++){
		if(esVocal(palabra.at(i))) return true;
	}
	if(palabra.at(palabra.length()-1)=='y') return true;
return false;
}


funcion cadena minusculas(cadena cad){
	cadena resul = cad
		,mayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZÜÁÉÍÓÚ"
		,minus = "abcdefghijklmnñopqrstuvwxyzüáéíóú";
	sinSigno pos;
	variarMas1(pos,0,longitud(minus)-1)
		cambiaCad(resul,mayus[pos],minus[pos]);
	finVariar
regresa(resul);
}	


bool VocConVoc(string palabra){
	if(palabra.length()>2){
		for(int i=0;i<palabra.length()-2;i++){
			if(esVocal(palabra.at(i))&&!esVocal(palabra.at(i+1))&&esVocal(palabra.at(i+2))) return true;
		}
	}
return false;
}
	
bool VocConConVoc(string palabra){
	if(palabra.length()>3){
		for(int i=0;i<palabra.length()-3;i++){
			if(esVocal(palabra.at(i))&&!esVocal(palabra.at(i+1))&&!esVocal(palabra.at(i+2))&&esVocal(palabra.at(i+3))) return true;
		}
	}
return false;
}

bool VocConConConVoc(string palabra){
	if(palabra.length()>4){
		for(int i=0;i<palabra.length()-4;i++){
			if(esVocal(palabra.at(i))){
			if(!esVocal(palabra.at(i+1))&&!esVocal(palabra.at(i+2))&&!esVocal(palabra.at(i+3))&&esVocal(palabra.at(i+4))) return true;
			}
		}
	}
return false;
}

bool VocConConConConVoc(string palabra){
	if(palabra.length()>5){
		for(int i=0;i<palabra.length()-5;i++){
			if(esVocal(palabra.at(i)))
			if(!esVocal(palabra.at(i+1)))
			if(!esVocal(palabra.at(i+2)))
			if(!esVocal(palabra.at(i+3)))
			if(!esVocal(palabra.at(i+4)))
			if(esVocal(palabra.at(i+5)))
		return true;
		}
	}return false;
}

int cantConsonantes(string palabra){
	int suma=0;
	for(int i=0;i<palabra.length();i++){
		if(!esVocal(palabra.at(i))) suma++;
	}
return suma;
}

bool consonantesInseparables(char a,char b){
	if(strchr("bcdgfktr",a) && b=='r')return true;
	if(strchr("bcgfkpl",a) && b=='l')return true;
	if(a=='c'&&b=='h')return true;
return false;
}

string silaba(string p){
	if(p.length()<=2) return p;
	if(p.length()==3 && cantConsonantes(p)==2 && p.at(2)!='y') return p;
	if(p.length()==4 && cantConsonantes(p)==3 && p.at(3)!='y') return p;
	
	if(esVocal(p.at(0))){
		if(esVocal(p.at(1))) return p.substr(0,1)+silaba(p.substr(1));
		if(VocConConVoc(p.substr(0,4))){
			if(consonantesInseparables(p.at(1),p.at(2))) return p.substr(0,1);
			else return p.substr(0,2);
		}else if(VocConConConVoc(p.substr(0,5))){
			if(consonantesInseparables(p.at(1),p.at(2))) return p.substr(0,1);
			if(consonantesInseparables(p.at(2),p.at(3))) return p.substr(0,2);
			return p.substr(0,2);
		}else if(VocConConConConVoc(p.substr(0,6))){
			return p.substr(0,3);
		}else return p.substr(0,1);
		
	}
	if(esVocal(p.at(1)) O p.at(1)=='y'){
		return p.substr(0,1)+silaba(p.substr(1));
	}else if(esVocal(p.at(2))O p.at(2)=='y'){
		return p.substr(0,2)+silaba(p.substr(2));
	}else if(esVocal(p.at(3))O p.at(3)=='y'){
		return p.substr(0,3)+silaba(p.substr(3));
	}
	
}
std::map<std::string,int> mapa;
string separarEnSilabas(string palabra){
	string resul="";
	while(palabra.length()>0){
		string sil=silaba(palabra);
		sil=minusculas(sil);
		if(mapa.find(sil) != mapa.end()){
			mapa[sil]=mapa[sil]+1;
		}else mapa[sil]=1;
		resul+=sil+"-";
		
		palabra=palabra.substr(sil.length());
	}
	return resul.substr(0,resul.length()-1) ;
}

procedimiento Silabeo(vector<cadena> palabras){
	
	paraCada(palabra,palabras)
		if(alMenosUnaVocal(palabra)){
		separarEnSilabas(palabra);
		}
	}
	
	auto iter = mapa.begin();
	
	string silabasMasUsadas="";
	int maximo=0,totales=0;
	while(iter != mapa.end()){   
		totales++;
		if(iter->second>maximo) {
			maximo=iter->second;			
		}
		iter++; 
	}
	iter = mapa.begin();
	
	while(iter != mapa.end()){   
		if(iter->second==maximo) {
			silabasMasUsadas+=iter->first+", ";
		}
		iter++; 
	}
	
	//mostrar<<totales++<<salto;
	
	mostrar<<"Silaba(s) mas usada(s): "<<silabasMasUsadas.substr(0,silabasMasUsadas.length()-2)<<salto;

}
