package tp2;

import java.math.BigInteger;

public class Ej2 {

    public static void main(String[] args) {
        
        //Si se asigna un valor a una variable fuera de rango da error
        //int a = 23958719832475729346;
        
        //Lo podemos solucionar usando el paquete BigInteger
        //que tambien nos permite ingresar un número como String y usarlo como valor numérico
        BigInteger a = new BigInteger("23958719832475729346");
        System.out.println(a);
        
    }
    
}
