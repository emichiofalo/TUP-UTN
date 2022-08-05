package tp2;

import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese dos palabras: ");
        String word1 = sc.nextLine(); 
        String word2 = sc.nextLine();
        
        if (word1.equals(word2))
            System.out.println("Las palabras son iguales.");
        else
            System.out.println("Las palabras no son iguales.");
        
        if (word1.compareTo(word2)==0)
            System.out.println("Las palabras son iguales.");
        else
            System.out.println("Las palabras no son iguales.");
        
        if (word1.compareToIgnoreCase(word2)==0)
            System.out.println("Las palabras son iguales.");
        else
            System.out.println("Las palabras no son iguales.");
        
        
        
    }
    
}
