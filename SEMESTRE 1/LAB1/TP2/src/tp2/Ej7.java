package tp2;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String chain = sc.nextLine();
        chain = chain.toLowerCase();
        
        int chainlg = chain.length();
        System.out.println("Largo de la cadena: "+chainlg);
        
        int vowel = 0;
        for (int i = 0; i < (chainlg-1); i++) {
            if (chain.charAt(i)=='a'||chain.charAt(i)=='e'||chain.charAt(i)=='i'||chain.charAt(i)=='o'||chain.charAt(i)=='u')
                vowel++;
        }
        
        System.out.println("La cadena ingresada tiene "+vowel+" vocales.");
                
    }
    
}
