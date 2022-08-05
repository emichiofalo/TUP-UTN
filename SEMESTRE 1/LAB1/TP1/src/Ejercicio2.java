import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println ("Ingrese su nombre: ");
        String name = sc.nextLine();
        JOptionPane.showMessageDialog (null, "Bienvenido/a " + name + "!");
        
    }
    
}
