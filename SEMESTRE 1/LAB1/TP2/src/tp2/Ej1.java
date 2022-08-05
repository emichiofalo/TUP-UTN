package tp2;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese un numero decimal.");
        double valorDecimal = sc.nextDouble();
        
        long valorL = (long) valorDecimal;
        int valorI = (int) valorDecimal; 
        short valorSh = (short) valorDecimal;
        float valorF = (float) valorDecimal;
        String valorSt = Double.toString(valorDecimal);
                     
        System.out.println("Long: "+valorL);
        System.out.println("Int: "+valorI);
        System.out.println("Short: "+valorSh);
        System.out.println("Float: "+valorF);
        System.out.println("String: "+valorSt);
                
    }
    
    /** 
     * Integer.parseInt(String x) pasa de String a int
     * Integer.valueOf(x) pasa a Integer el valor de la variable x
     * String.valueOf(x) pasa a String el valor de la variable x
    */
    
    
}
