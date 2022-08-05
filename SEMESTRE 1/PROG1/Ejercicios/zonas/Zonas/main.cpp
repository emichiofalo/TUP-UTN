#include <program1.h>

constante entero TAM = 19;

procedimiento leeVar(entero porRef,entero,entero,cadena);
procedimiento leeVarI(entero porRef,entero,entero,cadena);
procedimiento leeMat(entero,entero,real[TAM][TAM]);
funcion real promZM1(entero,real[TAM][TAM]);
funcion real promZM2(entero,real[TAM][TAM]);
funcion real promZM3(entero,real[TAM][TAM]);
funcion real promZM4(entero,real[TAM][TAM]);

principal                                                       // Unidad de programa principal
	real mat[TAM][TAM];
	entero t;
limpiar;                                                        // Limpia la pantalla.
	leeVarI(t,3,TAM,"Tamanio");                                      
	leeMat(t,t,mat);
	mostrar << "El promedio de la zona marcada es: " << promZM4(t,mat) << salto;
pausa;                                                          // Pausa antes de finalizar. 
finPrincipal                                                    // Fin de unidad de programa principal.

	//---
	//-xx
	//--x
	
funcion real promZM1(entero t, real m[TAM][TAM]) {
	real resul
		,suma = 0.0;                                               
	entero cant = 0                                                 
		,medio = t / 2                                            
		,f,c;                                                     
	variar(f,medio,t-1,1)
		variar(c,f,t-1,1)
		suma += m[f][c];                                       
		cant++;                                                    
		finVariar;
		finVariar;
		resul = suma / cant;                              
		retorna(resul);
}    

procedimiento leeMat(entero cF, entero cC, real m[TAM][TAM]) {
	entero f,c;
	variar(f,0,cF-1,1)
		variar(c,0,cC-1,1)
		leerM(m[f][c],"Matriz("<<f+1<<","<<c+1<<"): ");
	finVariar;
	finVariar;
}

procedimiento leeVarI(entero porRef v, entero vMin, entero vMax, cadena mens) {
	repetir
		leeVar(v,vMin,vMax,mens);
	hasta(esImpar(v));
}

procedimiento leeVar(entero porRef v, entero vMin, entero vMax, cadena mens) {
	repetir
		leerM(v,mens<<": ");
	hasta(vMin <= v Y v <= vMax);
}

//x--
//xx-
//---

funcion real promZM2(entero t, real m[TAM][TAM]) {
	real resul
		,suma = 0.0;                                               
	entero cant = 0                                                 
		,medio = t / 2                                            
		,f,c;                                                     
	variar(f,medio,0,-1)
		variar(c,f,0,-1)
		suma += m[f][c];                                       
		cant++;                                                    
		finVariar;
		finVariar;
		resul = suma / cant;                              
		retorna(resul);
}    

//x--
//xxx
//--x

funcion real promZM3(entero t, real m[TAM][TAM]) {
	real resul
		,suma = 0.0;                                               
	entero cant = 0                                                 
		,medio = t / 2                                            
		,f,c;                                                     
	variar(f,medio+1,t-1,1)
		variar(c,f,t-1,1)
		suma += m[f][c];                                       
		cant++;                                                    
		finVariar;
		finVariar;
	variar(f,medio-1,0,-1)
		variar(c,f,0,-1)
		suma += m[f][c];                                       
		cant++;                                                    
		finVariar;
		finVariar;
	variar(c,0,t-1,1)
		suma += m[medio][c];                                       
		cant++;                                                    
		finVariar;
		resul = suma / cant;                              
		retorna(resul);
}    

//--x
//xxx
//x--

funcion real promZM4(entero t, real m[TAM][TAM]) {
	real resul
		,suma = 0.0;                                               
	entero cant = 0                                                 
		,medio = t / 2                                            
		,f,c;
	variar(c,t-1,medio-1,-1)
		variar(f,aux,medio-1,1)
		suma += m[f][c];                                       
		cant++;
		finVariar;
		finVariar;
	variar(c,0,medio-1,1)
		variar(f,aux,medio-1,-1)
		suma += m[f][c];                                       
		cant++; 
		finVariar;
		finVariar;
	variar(c,0,t-1,1)
		suma += m[medio][c];                                       
		cant++;                                                    
		finVariar;
	resul = suma / cant;                              
	retorna(resul);
}    

