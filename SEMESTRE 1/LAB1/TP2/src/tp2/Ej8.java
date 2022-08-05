package tp2;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String chain = sc.nextLine();
        chain = chain.toLowerCase();
        
        int chainlg = chain.length();
        String newChain = "";
        
        for (int i = 0; i < (chainlg-1); i++) {
            if (chain.charAt(i)=='a')
                newChain = chain.replace('a','e');
        }
        
        System.out.println("Cadena modificada: "+newChain);
                
    }
            
}
