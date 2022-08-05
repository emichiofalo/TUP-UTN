package ClassPractise;

//Se debe realizar un programa que:

import java.util.ArrayList;
import java.util.Scanner;

//
//1º) Pida por teclado un número (entero positivo).
//
//2º) Pregunte al usuario si desea introducir o no otro número.
//
//3º) Repita los pasos 1º y 2º mientras que el usuario no responda n/N (no).
//
//4º) Muestre por pantalla la suma de los números introducidos por el usuario.

public class Ej2 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        String salida;
        do {
            int num = PedirInt();
            if (num>0) {
               numeros.add(num); 
            }
            salida = OtroNum();
        } while (!salida.equalsIgnoreCase("N"));  
        
        sumarValoresArrayList(numeros);
        
    }
    
    public static int PedirInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int num = sc.nextInt();
        if (num<=0) {
            System.out.println("Numero ingresado incorrecto.");
        }
        return num;
    }
    
    public static String OtroNum (){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea ingresar otro numero? S/N ");
        String option = sc.nextLine();
        return option;
    }
    
    public static void sumarValoresArrayList(ArrayList<Integer> numeros){                    
        int suma = 0;
        for (int num : numeros){
            suma += num;
        }
        System.out.println("La suma de los valores ingresados es " + suma);
    }
    
}
