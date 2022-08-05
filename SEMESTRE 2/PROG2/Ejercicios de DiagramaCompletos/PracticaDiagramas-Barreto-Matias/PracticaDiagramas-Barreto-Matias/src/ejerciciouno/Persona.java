package ejerciciouno;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 */
public abstract class Persona {

    private String nombre;
    private String apellido;
    private int idPersona;

    public Persona(String nombre, String apellido, int idPersona) {
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

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre +"\n" 
                + "Apellido = " + apellido +"\n" 
                + "ID Persona = " + idPersona +"\n";
    }    
}
