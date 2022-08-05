package AssociationClass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class Person {

    private String name;
    private List<Owns> investments = new ArrayList();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Owns> getInvestments() {
        return investments;
    }
    
    public void addInvestment(Owns o){
        investments.add(o);
    }

}
