package tp6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer num;
        System.out.println("Ingrese numeros: ");
        
        do {
            num = sc.nextInt();
            if (num>=0) {
                list.add(num);
            }
        } while (num>=0);
        
        System.out.println(list);
    }
    
}
