package tparreglosycontenedores;

import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class NumMayorArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int numMayor = 0;
        
        System.out.println("Ingrese 10 numeros enteros positivos:");
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i]>numMayor) 
                numMayor = numeros[i];
        }
        
        System.out.println("El número mayor es " + numMayor + " y se encuentra en la/s posicion/es: ");
        
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == numMayor) {
                System.out.println(i+1);
            }
        }
    }
    
}
