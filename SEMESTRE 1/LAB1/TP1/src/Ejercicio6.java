import java.util.Scanner;

public class Ejercicio6 {

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double prize=sc.nextFloat(); 
        
        final double IVA=1.21;
                
        System.out.println("Total: $"+prize*IVA+" *IVA incluido");
        
    }
    
}
