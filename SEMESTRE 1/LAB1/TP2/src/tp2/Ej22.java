package tp2;

import java.util.Scanner;

public class Ej22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();
        
        System.out.println(sumaDigitos(num));
        
    }
    
    public static int sumaDigitos (int num){
        if (num<10){
            return num;
        }else 
            return sumaDigitos (num/10)+num%10;
    }
    
}
