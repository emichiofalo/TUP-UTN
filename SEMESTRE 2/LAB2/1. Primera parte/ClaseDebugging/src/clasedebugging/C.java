package clasedebugging;

/**
 *
 * @author Emi Chiófalo
 */
public class C {

    public void c(){
        int acu = 0;
        for (int i = 0; i < 1000; i++){ 
            acu+=i;                             //breakpoint de condición
//            if (i == 500){                    no es recomendable
//                System.out.println("acu");    tendríamos que usar un breakpoint mejor
//            }
        }
    }
    
}
