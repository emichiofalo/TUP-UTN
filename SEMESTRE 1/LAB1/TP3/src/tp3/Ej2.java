package tp3;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int array[] = new int[5];
        
        System.out.println("Ingrese los valores numericos para el arreglo: ");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        
        System.out.println("Los valores ingresados son: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
