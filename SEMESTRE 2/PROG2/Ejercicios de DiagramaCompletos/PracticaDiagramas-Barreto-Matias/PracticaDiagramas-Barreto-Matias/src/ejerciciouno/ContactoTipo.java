package ejerciciouno;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class ContactoTipo {

    private int idContactoTipo;
    private String descripcion;

    public ContactoTipo(int idContactoTipo, String descripcion) {
        this.idContactoTipo = idContactoTipo;
        this.descripcion = descripcion;
    }

    public int getIdContactoTipo() {
        return idContactoTipo;
    }

    public void setIdContactoTipo(int idContactoTipo) {
        this.idContactoTipo = idContactoTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }                
}
