package AssociationClass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class Company {
    
    private String name;
    private List<Owns> owners = new ArrayList();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void addOwner(Owns o){
        owners.add(o);
    }

    public List<Owns> getOwners() {
        return owners;
    }
    
    
}
