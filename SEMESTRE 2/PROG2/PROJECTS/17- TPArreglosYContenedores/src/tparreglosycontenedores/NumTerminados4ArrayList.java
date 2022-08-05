package tparreglosycontenedores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class NumTerminados4ArrayList {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList();
        
        System.out.println("Ingrese 10 numeros enteros positivos:");
        
        for (int i = 0; i < 10; i++) {
            numeros.add(sc.nextInt());
        }
        
        System.out.println("Los numeros terminados en 4 son: ");
        for (Integer numero : numeros){
            if (terminaEn4(numero)) {
                System.out.println(numero);
            }
        }        
    }
    
    public static boolean terminaEn4 (Integer numero){
        String numeroSt = String.valueOf(numero);
        return numeroSt.endsWith("4");
    }
    
}
