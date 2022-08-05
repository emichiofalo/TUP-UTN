package diagramaclases3;

/**
 *
 * @author Emi Chiófalo
 */
public class Detective extends Persona{
    
    private String numeroPlaca; 
    
    public boolean InvestigarMafioso(Mafioso mafioso){
        System.out.println("El mafioso " + mafioso.getNombre() + " " +
                mafioso.getApellido() + " está siendo investigado.");
        return true;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
    
}
