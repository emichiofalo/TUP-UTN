

package ej_debug0;

class B {
    public int acumular() {
        int acu =0;
        
        for(int i=-1000; i<1000; i++) {
            if (i==-700) {
                System.out.println(acu);
            }
            acu += i/2;
        }
        return acu;
    }
}
class A {
    
    public void callB() {
       B b1 = new B();   
       System.out.println( b1.acumular() );
    }
}


public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.callB();
    }

}
