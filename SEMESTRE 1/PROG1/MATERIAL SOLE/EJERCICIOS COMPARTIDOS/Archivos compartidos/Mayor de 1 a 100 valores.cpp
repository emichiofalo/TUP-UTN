#include <program1.h>
using namespace std;

double leerVec2(double[], int);
void leerVec(double[], int);
void imprVec(double[], int);
void imprMay(double[], int);
void leerTam(int &, int, int, string);

const int tamano=100;

int main(int argc, char *argv[]) {
	int usrTam;
	double valores[tamano];
	system("cls");
	//usrTam=leerTam(1, 100, "Ingrese la cantidad de valores a trabajar (de 1 hasta 100): ");
	leerTam(usrTam, 1, 100, "Ingrese la cantidad de valores a trabajar (de 1 hasta 100): ");
	leerVec(valores, usrTam);
	imprVec(valores, usrTam);
	imprMay(valores, usrTam);
	return 0;
}


void leerVec(double v[], int t){
	for(int i=0;i<t;i++){
		cout << "Valor (" << i+1 << "): ";
		cin >> v[i];
	}
}
void imprVec(double v[], int t){
	for(int i=0;i<t;i++){
		cout << v[i] << (char)9;
	}
	cout << endl;
}
void imprMay(double v[], int t){
	double aux;
	for(int i=0;i<t;i++){
		if(i==0) aux=v[i];
		if(v[i]>=aux) aux=v[i];
	}
	cout << "El numero mayor es: " << aux << endl;
}
void leerTam(int &tam, int min, int max, string texto){
	do{
		cout << texto;
		cin >> tam;
		if(tam>=min && tam<=max) break;
		cout << "Incorrecto. Intente nuevamente." << endl << endl;
	}while(true);
}
