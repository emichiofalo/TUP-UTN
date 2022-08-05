import java.util.Scanner;

public class Ejercicio5 {

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        
        if (num%2==0)
            System.out.println("El numero "+num+" es divisible por 2.");
        else
            System.out.println("El numero "+num+" no es divisible por 2.");
    }
    
}
