package ejerciciodos;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Proveedor extends Persona {

    private String RUT;
    private String nombreComercial;

    public Proveedor() {
    }
            
    public Proveedor(String RUT, String nombreComercial, String documento, String nombre, String apellido, String direccion, int telefono, String ciudad) {
        super(documento, nombre, apellido, direccion, telefono, ciudad);
        this.RUT = RUT;
        this.nombreComercial = nombreComercial;
    }        
}
