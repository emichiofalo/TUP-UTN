import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num=0;         
        do {
            System.out.println("Ingrese un numero mayor o igual a 0:");
            num = sc.nextDouble();
        } while (num<0); 
        
        JOptionPane.showMessageDialog (null, "El numero ingresado es: "+num);
    }
    
}
