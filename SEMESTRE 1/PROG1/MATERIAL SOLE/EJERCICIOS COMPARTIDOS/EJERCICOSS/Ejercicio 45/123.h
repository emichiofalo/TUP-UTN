#include <program1.h>

principal
	int n,i=0;
entero vector[17];
real num=0,suma=0,promedio=0,sigma=0,desvStandar=0;
for( ; ; ){
	leerM(n,"INTRODUZCA  CANTIDAD DE NUMEROS MAXIMO 17 E IMPAR: \n");
	si (n>17 O esPar(n))entonces
		system("cls");			
	mostrar<<"ERROR Menor que 17 e impar"<<salto;
	sinoSi(esImpar(n))entonces
		mientras(i<n)
		leerM(num,"\nINGRESE VALORES "<<i*1<<": ");
	vector[i]=num;
	i++;          													//ES UN CONTADOR QUE CIERRA EL BUCLE CUANDO SUPERA EL VALOR DE n
	finMientras
		i=0;															//SE IGUALA A CERO PARA UTILIZARLO EN EL SIGUIENTE BUCLE MIENTRAS
	mientras(i<n)
		suma=suma+vector[i];				
	i++;
	finMientras
		promedio=suma/n;
	
	i=0;
	mientras(i<n)
		sigma=sigma+pow((vector[i]-promedio),2);
	i++;
	finMientras
		
		desvStandar=sqrt(sigma/(n-1));
	
	mostrar<<"La desviacion estandar es: "<<desvStandar;
	break;
	finSi
}
pausa;
finPrincipal
	
	
