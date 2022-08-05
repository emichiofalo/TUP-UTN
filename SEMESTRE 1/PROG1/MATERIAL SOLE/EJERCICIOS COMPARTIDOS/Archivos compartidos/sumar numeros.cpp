#include <program1.h>


int main() {
	double suma;
	double num;
	cout<<"Ingrese los numeros a sumar, cuando haya finalizado presione 0"<<endl;
		do{
			cout<<salto;
			cin>>num;
			if(num>0){
				cout<<"+";
			}
			suma=suma+num;
		}while(num>0);
	mostrar<<"="<<suma;
}
