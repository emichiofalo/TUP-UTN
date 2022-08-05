/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_profiling_gc_eden;

import java.util.Vector;




class miClase {

    Vector a = new Vector();

    public miClase() {
        for (int k = 0; k < 20000; k++) {
            a.add(new Float(k));
        }
    }
}

public class Main {

    public static void main(String[] args) {


        Vector a = new Vector();
        int cuenta = 1;

        for (int i = 0; i < 30000; i++) { 
            a.add(new miClase() );
            if (cuenta++ == 1000) {
                cuenta = 0;
                a.removeAllElements();
                //a.remove(cuenta);
                System.gc();
            }

        }
        System.out.println("finaliza");
    }
}
