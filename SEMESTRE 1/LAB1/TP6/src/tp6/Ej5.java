package tp6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 

public class Ej5 {

    public static void main(String[] args) {
        Random numAleatorio = new Random();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
                
        for (int i = 0; i < 50; i++) {
            numeros.add(numAleatorio.nextInt(100)+1);
        }
        
        System.out.println("Ingrese el valor que desea buscar: ");
        int elemento = sc.nextInt();
        BusquedaSecuencial(numeros, elemento);
        
    }
    
    public static void BusquedaSecuencial(ArrayList<Integer> array, Integer element){
        int position = 0;
        boolean found = false; 
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == element) {
                found = true;
                position = i+1;
            }
        }
        if (found) {
            System.out.println("Encontrado: posicion " + position);
        }else{
            System.out.println("NO ENCONTRADO");
        }
    }
    
}
