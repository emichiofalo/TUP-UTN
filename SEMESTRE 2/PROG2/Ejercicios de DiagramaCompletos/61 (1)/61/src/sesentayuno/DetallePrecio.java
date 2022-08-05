package sesentayuno;

import java.util.Date;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class DetallePrecio {

    private double precio;
    private Date fecha;

    public DetallePrecio() {
    }

    public DetallePrecio(double precio, Date fecha) {
        this.precio = precio;
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "DetallePrecio{" + "precio=" + precio + ", fecha=" + fecha + '}';
    }
}
