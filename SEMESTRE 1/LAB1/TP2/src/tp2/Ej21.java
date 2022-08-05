package tp2;

import java.util.Scanner;

public class Ej21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un número entero:");
            num = sc.nextInt();
        }while (num<=0);
        
        System.out.println(sumNums(num));
        
    }
    
    public static int sumNums(int num){
        if (num==0){
            return num;
        }else{ 
            return num+sumNums(num-1);
        }
    }
}
