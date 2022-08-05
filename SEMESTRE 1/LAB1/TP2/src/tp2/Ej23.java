package tp2;

import java.util.Scanner;

public class Ej23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String chain = sc.nextLine(); 
        int length = chain.length();
        
        System.out.println(Reverse(chain,length));
    }
    
    public static String Reverse(String chain, int length){
        if (length==1) {
            return chain.substring(0);
        }else
            return chain.substring(length-1,length)+Reverse(chain.substring(0, length-1),length-1);
        
    }
}