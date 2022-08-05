package tp3;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[5];
        int array2[] = new int[10];
        
        System.out.println("Ingrese los valores del primer arreglo: ");
        for (int i = 0; i < 5; i++) {
            array1[i]=sc.nextInt();
        }
        
        System.out.println("Ingrese los valores del segundo arreglo: ");
        for (int i = 0; i < 10; i++) {
            array2[i]=sc.nextInt();
        }
        
        productoArreglos(array1,array2);
        
    }
        
    public static void productoArreglos(int array1[], int array2[]){
        int array3[] = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) { 
                array3[i]=array3[i]+array1[i]*array2[j];
            }
        }
        mostrarArreglo(array3);
    }
    
    public static void mostrarArreglo(int array3[]){
        System.out.println("Resultados: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array3[i]+" ");
        }
    }
}
