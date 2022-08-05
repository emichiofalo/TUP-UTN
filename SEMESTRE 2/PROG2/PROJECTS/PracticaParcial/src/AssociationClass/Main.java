package AssociationClass;

/**
 *
 * @author Emi Chiófalo
 */
public class Main {

    public static void main(String[] args) {
        
        Company c = new Company("abc");
        Person p = new Person("pepe");
        
        p.addInvestment(new Owns(c, p, 20));
        
        System.out.println(c.getOwners().get(0).getOwner().getName());
        
    }
    
}
