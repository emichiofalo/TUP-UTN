package ClassPractise;

import java.util.Scanner;

//Escriba un programa que lea un número entero (altura) y a partir de él cree 
//una escalera invertida de asteriscos con esa altura. Por ejemplo, si 
//ingresamos una altura de 5 se deberá mostrar: ***** **** *** ** */

public class Ej3 {

    public static void main(String[] args) {
        int altura = PedirInt();
        ImprimirEscalera(altura);
    }
    
    public static int PedirInt(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero entero: ");
    int num = sc.nextInt();
        if (num<=0) {
            System.out.println("Numero ingresado incorrecto.");
        }
    return num;
    }
    
    public static void ImprimirEscalera (int altura){
        if (altura>0) {
            for (int i = 0; i < altura; i++) {
                System.out.print("*");
            }
            System.out.println("");
            ImprimirEscalera(altura-1); 
        }
    }
}
