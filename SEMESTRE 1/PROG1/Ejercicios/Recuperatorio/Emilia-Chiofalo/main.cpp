#include "program1Windows.h"
#include "Verificacion2.h"
#include "Preguntas.h"
#include <locale.h>

procedimiento cantidadVAcen(vector<cadena> palabras);
procedimiento cantidadConso(vector<cadena> palabras);
procedimiento cantidadEmpiezanConso(vector<cadena> palabras);
procedimiento cantidadVACVA(vector<cadena> palabras);
procedimiento cantidadVAocCCVAoc(vector<cadena> palabras);
procedimiento cantidadVcCCCV(vector<cadena> palabras);
procedimiento cantidadVcCCCCV(vector<cadena> palabras);
procedimiento Silabeo(vector<cadena> palabras);

Principal
	limpiar;
	setlocale(LC_ALL, "Spanish");
	archivo datos;
	abrir(datos,"palabras4.txt",ALEER);
	vector<cadena> palabrasIniciales;
	vector<cadena> palabras;
	
	if(estaAbierto(datos)){
		
		while(!datos.eof()){
			cadena aux;
			datos >> aux;
			agregaEleVDin(palabrasIniciales, aux);
		}
		
		cout << "Cantidad de palabras del archivo: " << palabrasIniciales.size()-1 << "\n";
		
		verificacion(palabrasIniciales, palabras);
		
		cantidadVAcen(palabras);
		cantidadConso(palabrasIniciales);
		cantidadEmpiezanConso(palabras);
		cantidadVACVA(palabras);
		cantidadVAocCCVAoc(palabras);
		cantidadVcCCCV(palabras);
		cantidadVcCCCCV(palabras);
		Silabeo(palabras);
		
	} else {
		cout << "Error al abrir el archivo\n";
	}
	
cerrar(datos);
finPrincipal
	
