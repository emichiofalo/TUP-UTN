package tparreglosycontenedores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class NumPrimos2ArrayList {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        
        for (int i = 100; i < 300; i++) {
            if (esPrimo(i)) {
                numeros.add(i);
            }
        }
        
        System.out.println("Los numeros primos comprendidos entre 100 y 300 son: ");
        for (Integer numero : numeros){
            System.out.println(numero);
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
