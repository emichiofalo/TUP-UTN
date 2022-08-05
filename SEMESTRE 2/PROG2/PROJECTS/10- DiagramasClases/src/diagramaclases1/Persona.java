package diagramaclases1;

/**
 *
 * @author Emi Chiófalo
 */
public abstract class Persona {
    
    private String nombre; 
    private String apellido; 
    private Integer idPersona;

    public Persona(String nombre, String apellido, Integer idPersona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }
    
    
    
}
