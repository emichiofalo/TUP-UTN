/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Emi Chiófalo
 */
class A1 {
    A1 proximo;
}

public class Prueba3 {
    static A1 a = new A1();
    
    public static void main(String[] args) {
        
        while(true){
            a.proximo = new A1();
            a = a.proximo;
            System.out.println("creando proximo");
        }
    } 
}
