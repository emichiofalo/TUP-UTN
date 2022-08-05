package ejerciciouno;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class ContactoDomicilio {

    private int idContactoDomicilio;
    private String descripcion;

    public ContactoDomicilio(int idContactoDomicilio, String descripcion) {
        this.idContactoDomicilio = idContactoDomicilio;
        this.descripcion = descripcion;
    }

    public int getIdContactoDomicilio() {
        return idContactoDomicilio;
    }

    public void setIdContactoDomicilio(int idContactoDomicilio) {
        this.idContactoDomicilio = idContactoDomicilio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }        
}
