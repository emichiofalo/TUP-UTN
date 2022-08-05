package sesentayuno;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Delirery extends FormaEntrega{
    
    private double monto;

    public Delirery() {
    }

    public Delirery(double monto, int idForma, String descripcion) {
        super(idForma, descripcion);
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Delirery{" + "monto=" + monto + '}';
    }        
}
