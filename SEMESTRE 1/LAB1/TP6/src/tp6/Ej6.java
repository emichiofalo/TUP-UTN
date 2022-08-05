package tp6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ej6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> original = new ArrayList<Integer>();
        
        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 0; i < 10; i++) {
            original.add(sc.nextInt());
        }
        
        ArrayList<Integer> ascendente = new ArrayList<Integer>(original);
        ArrayList<Integer> descendente = new ArrayList<Integer>(original);
        
        Collections.sort(ascendente);
        System.out.println("Lista ascendente:");
        MostrarLista(ascendente);
        Collections.sort(descendente, Collections.reverseOrder());
        System.out.println("Lista descendente:");
        MostrarLista(descendente);
        
    }
    
    public static void MostrarLista (ArrayList<Integer> lista){
        for (Integer value : lista) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}
