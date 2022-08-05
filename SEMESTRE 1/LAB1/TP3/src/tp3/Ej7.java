package tp3;

import java.util.Scanner; 
import java.util.Arrays;
import java.util.Collections;

public class Ej7 {

    public static void main(String[] args) {
              
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Ingrese números enteros: ");
        for (int i = 0; i < 10; i++) {
            array[i]=sc.nextInt();
        }
        Ascendente(array);
                
    }

    public static void Ascendente(int array[]){
        int arrayAsc[] = new int[10];
        arrayAsc = array;
        Arrays.sort(arrayAsc);
        
        System.out.println("Arreglo en orden ascendente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayAsc[i]);
        }
        System.out.println("");
        
        Descendente(arrayAsc);
    } 
    
    public static void Descendente(int arrayAsc[]){
        int arrayDesc[] = new int[10];
        int j=9;
        System.out.println("Arreglo en orden descendente:");
        for (int i = 0; i < 10; i++) {
            arrayDesc[i]=arrayAsc[j];
            j--;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayDesc[i]);
        }
        System.out.println("");
    }
     
}
