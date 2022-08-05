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
class A {

    B b;// = new B();
}

class B {

    A a = new A();
}

public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        B b1 = new B();
        b1.a = new A();

    }

}
