package tp2;

import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String chain1 = sc.nextLine();
        String chain2 = sc.nextLine();
        String chain1Lc = chain1.toLowerCase();
        String chain2Lc = chain2.toLowerCase();
        
        if (chain1Lc.contains(chain2Lc))
            System.out.println("La primer frase contiene a la segunda.");
        else 
            System.out.println("La primer frase no contiene a la segunda.");
        
    }
    
}

