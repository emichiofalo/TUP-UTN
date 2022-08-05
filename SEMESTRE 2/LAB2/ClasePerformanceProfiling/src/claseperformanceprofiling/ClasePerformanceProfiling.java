package claseperformanceprofiling;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */

class A{
    String cadena = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    
    public A(){
        for (int i = 0; i < 15; i++) {
            cadena = cadena.concat(cadena);
        }
    }
}

public class ClasePerformanceProfiling {

    public static void main(String[] args) {
    ArrayList ar = new ArrayList();
        A a;
        int cont = 0;
        while (true){
            try{Thread.sleep(100);}catch(Exception e){}
            ar.add(new A());
            
            if(cont++ == 100){
                ar.clear();
                cont = 0; 
                System.gc();
            }
        }
        
    }
}

