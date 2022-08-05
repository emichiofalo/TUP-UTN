import java.util.Scanner; 

public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        
        int aux = 0;
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if (num%i==0)
                aux++;
        }
       
        if (aux==2)
            System.out.println("El numero "+num+" es primo.");
        else 
            System.out.println("El numero "+num+" no es primo.");
        
    }
    
}
