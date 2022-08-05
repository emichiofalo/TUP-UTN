package tp3;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimension del array: ");
        int array[] = new int [sc.nextInt()];
        FillArray(array);
        ShowArray(array);        
    }
    
    public static void FillArray(int array[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i]=(i+1)*num;
        }
    }
    
    public static void ShowArray(int array[]){
        System.out.println("Los múltiplos del número ingresado son: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
