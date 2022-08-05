
package claseherencia_220322;

/**
 *
 * @author sebastiansulia
 */
public class ClaseHerencia_220322 {

    public static void main(String[] args) {
        Auto a1 = new Auto("CPD613", 4, 5, "Ford", "Fiesta", 1999);
        System.out.println(a1.getAnio());
        a1.setAnio(2000);
        System.out.println(a1.getAnio());
    }
    
}
