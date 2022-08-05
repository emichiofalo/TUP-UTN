#include <program1.h>
/**
*  Enunciado:  
*/
funcion int particion(vector<real> &v, int inicio, int fin){
	real valorPivote = v[inicio];
	int i = inicio + 1;
	for(int j = i; j <= fin; j++){
		if(v[j] < valorPivote){
			swap(v[i],v[j]);
			i++;
		}
	}
	swap(v[inicio], v[i - 1]);
	return i - 1;
}
	
	void quickSort(vector<real> &v, int inicio, int fin){
		if(inicio < fin){
			int indicePivote = particion(v, inicio, fin);
			quickSort(v, inicio, indicePivote - 1);
			quickSort(v, indicePivote + 1, fin);
		}
	}

principal
	
	vector<real> v;
	
	archivo datos;
	real num;
	
	abrir(datos,"datos.txt",ALEER);
	
	mientras(!esFinDArch(datos))
		datos >> num;
		agregaEleVDin(v,num)
			mientras(datos >> num)
				agregaEleVDin(v,num)
			finMientras		
	finMientras
	
	quickSort(v, 0, tamanio(v) - 1);		
			
	//mostrar << "v[" << 0 << "] = " << v[0] << salto;
	mostrar << "v[" << tamanio(v) - 1 << "] = " << v[tamanio(v) - 1] << salto;
			
			
finPrincipal
