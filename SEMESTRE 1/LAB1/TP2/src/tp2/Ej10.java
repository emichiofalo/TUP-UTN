package tp2;

import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String phrase = sc.nextLine();
        
        System.out.println("Elegir una opcion: ");
        System.out.println("1- Convertir a mayusculas.");
        System.out.println("2- Convertir a minusculas.");
        
        int option = sc.nextInt();
        switch (option){
            case 1: 
                System.out.println(phrase.toUpperCase());
                break;
            case 2:
                System.out.println(phrase.toLowerCase());
                break;
        }    
        
    }
    
}
