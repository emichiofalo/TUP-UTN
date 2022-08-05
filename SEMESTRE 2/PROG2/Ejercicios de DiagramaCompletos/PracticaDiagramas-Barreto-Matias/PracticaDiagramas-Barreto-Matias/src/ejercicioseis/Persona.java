package ejercicioseis;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public abstract class Persona {

    private int dni;
    private String nombre;
    private String apellido;
    private long cuit;

    public Persona() {
    }

    public Persona(int dni, String nombre, String apellido, long cuit) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }        
}
