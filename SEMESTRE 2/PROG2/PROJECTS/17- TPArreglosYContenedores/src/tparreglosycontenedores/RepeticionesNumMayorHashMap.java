package tparreglosycontenedores;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class RepeticionesNumMayorHashMap {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        
        HashMap<Integer, Integer> numeros = new HashMap();
        
        System.out.println("Ingrese 10 numeros enteros positivos:");
        
        for (int i = 0; i < 10; i++) {
            numero = sc.nextInt();
            if (numeros.containsKey(numero)) {
                numeros.put(numero, numeros.get(numero)+1);
            }else{
                numeros.put(numero, 1);
            }
        }
        
        Integer mayor = 0;
        for (Map.Entry<Integer,Integer> entrada : numeros.entrySet()){
            if (entrada.getKey()>mayor) {
                mayor = entrada.getKey();
            }
        }
        
        System.out.println("El mayor numero es " + mayor + " y se repite " + numeros.get(mayor) + " veces.");
        
    }
    
}
