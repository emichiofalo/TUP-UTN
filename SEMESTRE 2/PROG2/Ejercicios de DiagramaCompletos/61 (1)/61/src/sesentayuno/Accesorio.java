package sesentayuno;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Accesorio extends Producto {

    private String modelo;

    public Accesorio(String modelo, int idPr, String descripcion, String marca, double precio, int stock) {
        super(idPr, descripcion, marca, precio, stock);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Accesorio{" + "modelo=" + modelo + '}';
    }
}
