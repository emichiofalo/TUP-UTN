package sesentayuno;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Chip extends Producto{
    
    private String ICC;
    private String Capacidad;

    public Chip() {
    }

    public Chip(String ICC, String Capacidad, int idPr, String descripcion, String marca, double precio, int stock) {
        super(idPr, descripcion, marca, precio, stock);
        this.ICC = ICC;
        this.Capacidad = Capacidad;
    }

    public String getICC() {
        return ICC;
    }

    public void setICC(String ICC) {
        this.ICC = ICC;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    @Override
    public String toString() {
        return "Chip{" + "ICC=" + ICC + ", Capacidad=" + Capacidad + '}';
    }             
}
