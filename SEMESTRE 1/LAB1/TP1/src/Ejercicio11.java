import java.util.Scanner;

public class Ejercicio11 {

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        final String passw = "lab1";
        
               
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresar contraseña: ");
            String pass = sc.nextLine();
            String passLc = pass.toLowerCase();
            if (passLc.equals(passw)){
                System.out.println("Acceso Correcto.");
                i=3;
            }
            else if (i==2){
                System.out.println("Acceso Incorrecto.");
            }
        }
        
    }
    
}
