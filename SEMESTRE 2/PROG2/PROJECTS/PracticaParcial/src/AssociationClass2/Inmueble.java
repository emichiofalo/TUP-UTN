package AssociationClass2;

/**
 *
 * @author Emi Chiófalo
 */
public class Inmueble {
    
    private String calle; 
    private int numero; 
    private Renta renta;

    public Renta getRenta() {
        return renta;
    }

    public void setRentaConstructor(Renta renta) {
        this.renta = renta;
    }

    public Inmueble(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "calle=" + calle + ", numero=" + numero + ", renta=" + renta + '}';
    }
    
}
