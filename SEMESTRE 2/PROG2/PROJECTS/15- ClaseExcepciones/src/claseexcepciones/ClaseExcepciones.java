package claseexcepciones;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emi Chiófalo
 */
public class ClaseExcepciones {

    public static void main(String[] args) {
        
//        try {
//            calcula(3,0);
//        } catch (Exception ex) {
//            Logger.getLogger(ClaseExcepciones.class.getName()).log(Level.SEVERE, null, ex);
//        }

        calcula();
        
    }
    
    public static float divide(float a, float b) throws Exception {
            if (b==0) throw new Exception(); 
            return a/b;
    }
    
//    public static float calcula(float a, float b) throws Exception{
//        float result = a - b + divide(a,b);
//        return result;
//    }
    
    public static float calcula(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numero enteros:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        
        float result = 0; 
        try {
            result = a - b + divide(a,b);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("Error en el metodo divide. El segundo numero tiene que ser distinto de cero. ");
            calcula();
        }
        return result; 
    }
    
}
