package tp2;

import java.util.Scanner;

public class Ej3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 3 digitos: ");
                
        int num = sc.nextInt();
        
        while (num<100 || num>999){
            System.out.println("Número fuera de rango.");
            num = sc.nextInt();
        }
        
        int cent = num/100;
        int auxcent = cent*100; 
        int auxdec = num-auxcent;
        int u = auxdec%10;
        int dec = (auxdec - u)/10;
                
        System.out.println(cent+dec+u);
                
    }
    
}
