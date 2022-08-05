/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ej_profiling_01;

class Valor {
    Float numero;
    String valor;
    public Valor(String s, Float n) {
        numero = n;
        for(int i=0;i<15;i++)
            s = s.concat( s );
        valor = s;
    }
}
class Base {
    java.util.Vector valores = new java.util.Vector();
    public Base() {
        for(int i=0; i<10000; i++ ) {
            Valor v = new Valor( String.valueOf(i), Float.valueOf(i));
            valores.add( v );
            System.out.println( i );
            //if(i % 50 == 0) valores.removeAllElements();
            try {Thread.sleep(60);}catch(Exception e){ }
        }
    }
    public Float promedio() {
        Float acu= new Float(0);
        for(int i=0;i < valores.size(); i++ ) {
            acu = (Float) valores.get(i);
        }
        return acu;
    }
}



public class Main {
    public static void main(String[] args) {
     Base b = new Base();
    }

}
