package tp3;

import java.util.Random;
import java.util.Scanner; 

public class Ej6 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int array[] = new int[50];
        for (int i = 0; i < 50; i++) {
            array[i]=random.nextInt(101);
        }
        
        System.out.println("Ingrese el numero que desea buscar entre 0 y 100: ");
        int num = sc.nextInt();
        
        NumberSearch(array,num);
                
    }
    
    public static void NumberSearch(int[] array, int num){
        int i=0;
        boolean exit=false;
        while (exit!=true) {            
            if (i==50) {
                System.out.println("No se encontraron coincidencias.");
                exit = true;
            }else if(num==array[i]) {
                System.out.println("Numero encontrado. Posicion: "+i);
                exit = true;
            }else if (num!=array[i]) {
                i++;
            } 
        }
    }
}
