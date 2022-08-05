package tparreglosycontenedores;

import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class NumMayorPrimoArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int numMayorPrimo = 0;
        
        System.out.println("Ingrese 10 numeros enteros positivos:");
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
            if (esPrimo(numeros[i])) 
                if (numeros[i]>numMayorPrimo) {
                    numMayorPrimo = numeros[i];
                }
        }
        
        if (numMayorPrimo!=0) {
            System.out.println("El mayor número primo es " + numMayorPrimo + " y se encuentra en la/s posicion/es: ");

            for (int i = 0; i < 10; i++) {
                if (numeros[i] == numMayorPrimo) {
                    System.out.println(i + 1);
                }
            }
        }else {
            System.out.println("No se ingresaron numeros primos.");
        }
    }
    
    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            // Si es divisible por cualquiera de estos números, no es primo
            if (numero % i == 0) {
                return false;
            }
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }
    
}
