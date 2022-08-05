// Archivo de traducción de seudocódigo a C++
#include <program1.h>
/**
*    Enunciado: 
*/
principal																		// Unidad de programa principal
limpiar;
int tam=100;
int taman;
cout << "Ingrese numero de valores a trabajar: ";
cin >> taman;
double prom, variacion;
double vector[100], vector2[100];
for(int i=0;i<taman;i++){
	cout << "Valor (" << i+1 << "): ";
	cin >> vector[i];
}
for(int i=0;i<taman;i++){
	cout << vector[i] << " ";
}
cout << endl;
for(int i=0;i<taman;i++){
	prom+=vector[i];
	if(i==taman-1) prom=prom/taman;
}
cout << "El promedio es: " << prom << endl;
for(int i=0;i<tam;i++){
	vector2[i]=vector[i];
}
cout << "El nuevo vector tiene..." << endl;
for(int i=0;i<taman;i++){
	cout << vector2[i] << " ";
}
cout << endl;
for(int i=0;i<taman;i++){
	vector2[i]=pow(vector[i]-prom, 2);
	variacion+=vector2[i];
}
cout << "El nuevo vector variado..." << endl;
for(int i=0;i<taman;i++){
	cout << vector2[i] << " ";
}
cout << endl;
cout << "La suma de las varianzas es: " << variacion << endl;
variacion = sqrt(variacion);
cout << "La variacion estandar es: " << variacion;
cout << endl;
pausa;																			// Pausa antes de finalizar. 
finPrincipal																	// Fin de unidad de programa principal
