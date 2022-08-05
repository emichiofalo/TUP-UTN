package sesentayuno;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Tarjeta extends FormaPago {

    private long numTarjeta;

    public Tarjeta(long numTarjeta, String idFormaPago, String descripcion, boolean estado) {
        super(idFormaPago, descripcion, estado);
        this.numTarjeta = numTarjeta;
    }

    public long getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(long numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "numTarjeta=" + numTarjeta + '}';
    }
}
