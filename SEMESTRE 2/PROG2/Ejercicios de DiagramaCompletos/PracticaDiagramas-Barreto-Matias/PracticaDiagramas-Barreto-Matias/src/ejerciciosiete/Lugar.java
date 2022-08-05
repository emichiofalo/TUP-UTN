package ejerciciosiete;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Lugar {

    private String nombre;
    private String Direccion;

    public Lugar() {
    }

    public Lugar(String nombre, String Direccion) {
        this.nombre = nombre;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }            
}
