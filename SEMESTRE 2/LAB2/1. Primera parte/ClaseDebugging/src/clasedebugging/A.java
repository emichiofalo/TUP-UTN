package clasedebugging;

/**
 *
 * @author Emi Chiófalo
 */
public class A {
    
    B b1 = new B();
    
    public void a(){
        b();
    }
    
    public void b(){
        c();
    }
    
    public void c(){
        b1.a();
    }
}
