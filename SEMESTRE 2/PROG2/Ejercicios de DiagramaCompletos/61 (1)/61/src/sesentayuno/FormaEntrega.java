package sesentayuno;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class FormaEntrega {

    private int idForma;
    private String descripcion;

    public FormaEntrega() {
    }
            
    public FormaEntrega(int idForma, String descripcion) {
        this.idForma = idForma;
        this.descripcion = descripcion;
    }

    public int getIdForma() {
        return idForma;
    }

    public void setIdForma(int idForma) {
        this.idForma = idForma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "FormaEntrega{" + "idForma=" + idForma + ", descripcion=" + descripcion + '}';
    }        
}
