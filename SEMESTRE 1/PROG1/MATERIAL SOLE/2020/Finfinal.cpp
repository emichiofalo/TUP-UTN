#include <iostream>
#include <fstream>
#include <vector>
#include <cmath>

using namespace std;

struct Punto{
	
	double x;
	double y;
	
};

struct Triangulo{
	Punto punto1;
	Punto punto2;
	Punto punto3;
	double area;
};

static vector<Triangulo> triang;


bool cargarVector(vector<Punto>& vectorPuntos, istream& datos){
	Punto punto;
	datos >> punto.x >> punto.y;

		if(punto.x == 0 && punto.y == 0){
			return true;
		}else{
			vectorPuntos.push_back(punto);
		}

	return false;
}

	
	
void entradaDatos(istream& datos, vector<Punto>& vectorPuntos){
	bool salida = false;
	Punto punto;
	datos >> punto.x >> punto.y;
	vectorPuntos.push_back(punto);
	while (!salida){
		salida = cargarVector(vectorPuntos, datos);
	}
}
	
	
	
	
	
void mostrarPuntos(vector<Triangulo> vectorPuntos){ //Debug
	if(vectorPuntos.size() !=0){
	for(Triangulo tri: vectorPuntos){
		cout << "Coordenada X del vertice 1: " << tri.punto1.x << ", " << "Coordenada Y del vertice 1:  " << tri.punto1.y << endl;
		cout << "Coordenada X del vertice 2: " << tri.punto2.x << ", " << "Coordenada Y del vertice 2: " << tri.punto2.y << endl;
		cout << "Coordenada X del vertice 3: " << tri.punto3.x << ", " << "Coordenada Y del vertice 3: " << tri.punto3.y << endl;
		cout << "area: " << tri.area << endl;
		cout<<"------------Fotro-----------------------"<<endl;
		
	}
	}else cout <<"no se obtuvo resultados"<<endl;	
}
	
void validarCantidad(vector<Punto> vectorPuntos){
	if(vectorPuntos.size() < 2){
		cout << "No hay puntos suficientes para resolver";
		exit(1);
	}
}

	double distancia2P(Punto p1, Punto p2){
		float distancia;
		distancia = sqrt(((p2.x-p1.x)*(p2.x-p1.x))+(p2.y-p1.y)*(p2.y-p1.y));
		return distancia;
	}
	
	double formulaHeron(long double distancia1, long double distancia2, long double distancia3){
		float semiperimetro, area;
		semiperimetro = (distancia1+distancia2+distancia2)/2;
		area = sqrt(semiperimetro*(semiperimetro-distancia1)*(semiperimetro-distancia2)*(semiperimetro-distancia3));
		return area;
	}
		
void puntoInterno(Punto punto, Triangulo triangulo){
	
	double puntoInterno, res1,res2,res3;
	puntoInterno = ((triangulo.punto1.x -  triangulo.punto3.x)*(triangulo.punto2.y -  triangulo.punto3.y)*(triangulo.punto1.y -  triangulo.punto3.y)*triangulo.punto2.x -  triangulo.punto3.x);
		res1=((triangulo.punto1.x -  punto.x)*(triangulo.punto2.y -  punto.y)*(triangulo.punto1.y -  punto.y)*(triangulo.punto2.x -  punto.x));
		res2=((triangulo.punto2.x -  punto.x)*(triangulo.punto3.y -  punto.y)*(triangulo.punto2.x -  punto.y)*(triangulo.punto3.x -  punto.x));
		res3=((triangulo.punto3.x -  punto.x)*(triangulo.punto1.y -  punto.y)*(triangulo.punto3.x -  punto.y)*(triangulo.punto1.x -  punto.x));
	if(puntoInterno>=0){
		if(res1>=0 && res2>=0 && res3>=0){
			
		triang.push_back(triangulo);
		}
		else if(puntoInterno<0){
		if(res1<0 && res2<0 && res3<0){
			triang.push_back(triangulo);
		}
		
	}
}
}
	
void mayorArea(vector<Triangulo> triangulos){
		double mayorArea = 0;
		Triangulo triang;
		for(Triangulo tri: triangulos){
				if(tri.area>mayorArea){
					mayorArea = tri.area;
					triang = tri;
				}
		}
			//cout<<fixed;
		cout << "Coordenada X del vertice 1: " << triang.punto1.x << ", " << "Coordenada Y del vertice 1:  " << triang.punto1.y << endl;
		cout << "Coordenada X del vertice 2: " << triang.punto2.x << ", " << "Coordenada Y del vertice 2: " << triang.punto2.y << endl;
		cout << "Coordenada X del vertice 3: " << triang.punto3.x << ", " << "Coordenada Y del vertice 3: " << triang.punto3.y << endl;
		cout << "Area total: " << triang.area << endl;
		cout <<"------------Finalizacion del programa-----------------------"<<endl;
			
	}
	   
	   
	void vectorTriangulo(vector<Punto> puntos, vector<Triangulo> triangulos){
	
		for(int i=0;i<triangulos.size();i++){
		for(int j=0; j<puntos.size();j++){
			puntoInterno(puntos[j], triangulos[i]);
		}
	}
}
		
		
void areaHeron(vector<Punto> puntos, vector<Triangulo>& triangulos){
	double distancia1, distancia2, distancia3;
	long double area;
	for(int i=0;i<puntos.size();i++){
		for(int j=0;j<puntos.size();j++){
			for(int k=0;k<puntos.size();k++){
				distancia1 = distancia2P(puntos[i],puntos[j]);
				distancia2 = distancia2P(puntos[i],puntos[k]);
				distancia3 = distancia2P(puntos[j],puntos[k]);
				area = formulaHeron(distancia1,distancia2,distancia3);
				Triangulo tri;
				tri.punto1= puntos[i];
				tri.punto2= puntos[j];
				tri.punto3= puntos[k];
				tri.area = area;
				if(area != 0){
					triangulos.push_back(tri);
				}
			}
		}
		
	}
	
	
}
	
	

int main(int argc, char *argv[]) {

	vector<Punto> vectorPuntos;
	vector <Triangulo> vectorTriangulos;
	ifstream datos;
	datos.open("datos2.txt");
	
	entradaDatos(datos, vectorPuntos);
	validarCantidad(vectorPuntos);
	areaHeron(vectorPuntos, vectorTriangulos);
	mayorArea(vectorTriangulos);
	
	
	int a;
	cin >> a ;
	return 0;

}
