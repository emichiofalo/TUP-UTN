package diagramaclases1;

/**
 *
 * @author Emi Chiófalo
 */
public class ContactoTipo {
    
    private Integer idContactoTipo;
    private String descripcion; 

    public ContactoTipo(Integer idContactoTipo, String descripcion) {
        this.idContactoTipo = idContactoTipo;
        this.descripcion = descripcion;
    }

    public Integer getIdContactoTipo() {
        return idContactoTipo;
    }

    public void setIdContactoTipo(Integer idContactoTipo) {         
        this.idContactoTipo = idContactoTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
