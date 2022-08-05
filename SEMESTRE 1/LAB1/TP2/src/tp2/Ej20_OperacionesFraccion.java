package tp2;

import java.util.Scanner;

public class Ej20_OperacionesFraccion {

    /**
     * Clase OperacionesFraccion (metodo main) 
     *      solicitar ingreso de 4 valores int 
     *          crea 2 objetos fraccion
     *          despues de crearlos ejecuta los 4 metodos
     *              asigna el resultado a una variable tipo Fraccion (de la clase que yo creé)
     *              muestra el resultado por pantalla
     */     
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cuatro valores enteros.");
        
        int num1=sc.nextInt(), num2=sc.nextInt(), num3=sc.nextInt(), num4=sc.nextInt();
        
        Fraccion f1 = new Fraccion(num1,num2);
        Fraccion f2 = new Fraccion(num3,num4);
        Fraccion result = new Fraccion();
        
        System.out.print("Suma de las fracciones = ");
        result=result.sumarFracciones(f1, f2);
        result.mostrar();
        
        System.out.print("Resta de las fracciones = ");
        result=result.restarFracciones(f1, f2);
        result.mostrar();
        
        System.out.print("Multiplicacion de las fracciones = ");
        result=result.multiplicarFracciones(f1, f2);
        result.mostrar();
        
        System.out.print("Division de las fracciones = ");
        result=result.dividirFracciones(f1, f2);
        result.mostrar();
    }
    
}
