package tp2;

import java.util.Scanner;

public class Ej9 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String phrase = "La lluvia en Mendoza es escasa";
        int numch = phrase.length();
                
        for (int i = 0; i < (numch-1); i++) {
            int ascii = (int) phrase.charAt(i);
            System.out.print(ascii+" ");
        }
        
    }
    
}
