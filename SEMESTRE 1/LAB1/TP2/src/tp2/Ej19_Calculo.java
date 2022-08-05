package tp2;

import java.util.Scanner;

public class Ej19_Calculo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        OperacionMatematica operacion = new OperacionMatematica();
        
        //operacion.setValor1(sc.nextDouble());
        operacion.setValor1(50.99);
        operacion.setValor2(78.67);
        
        System.out.println("Ingrese el tipo de operacion a realizar:");
        //String operator = sc.nextLine();
        operacion.setOperacion(sc.nextLine());
        System.out.println(operacion.aplicarOperacion(operacion.getOperacion()));
        
    }
    
   
}
