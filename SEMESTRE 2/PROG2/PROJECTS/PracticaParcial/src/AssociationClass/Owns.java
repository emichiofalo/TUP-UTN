package AssociationClass;

/**
 *
 * @author Emi Chiófalo
 */
public class Owns {

   private Person owner;
   private Company company;
   private int shares;
   public Owns(Company c, Person p, int num) {
      company = c;
      owner = p;
      shares = num;
      c.addOwner(this);
      p.addInvestment(this);
   }

    public Person getOwner() {
        return owner;
    }

    public Company getCompany() {
        return company;
    }

    public int getShares() {
        return shares;
    }
   
   
}

