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
class objetoGrande {

        String cadena = "Aaaaaaaaaaaaaaaaaaaaaaaaaa";

        public objetoGrande() {
            for (int i = 0; i < 200; i++) {
                cadena = cadena.concat(cadena);
            }
        }
    }

    class D {

        D b1;
        objetoGrande o;

        public D() {
            o = new objetoGrande();
            b1 = new D();
        }
    }

public class Prueba1 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        D b1 = new D();
    }

}
