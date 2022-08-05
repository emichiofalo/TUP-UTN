package AssociationClass2;

/**
 *
 * @author Emi Chiófalo
 */
public class Persona {
    
    private String nombre; 
    private Renta renta;

    public void setRentaConstructor(Renta renta) {
        this.renta = renta;
    }

    public Renta getRenta() {
        return renta;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}
