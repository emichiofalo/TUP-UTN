package ejerciciodos;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 */
public class Cliente extends Persona {

    public Cliente() {
    }
            
    public Cliente(String documento, String nombre, String apellido, String direccion, int telefono, String ciudad) {
        super(documento, nombre, apellido, direccion, telefono, ciudad);
    }        
}
