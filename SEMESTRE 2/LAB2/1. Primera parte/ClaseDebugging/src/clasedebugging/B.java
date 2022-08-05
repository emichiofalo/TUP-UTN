package clasedebugging;

/**
 *
 * @author Emi Chiófalo
 */
public class B {
    
    C c1 = new C();
    
    public void a(){
        b();
    }
    
    public void b(){
        c1.c();
    }
    
}
