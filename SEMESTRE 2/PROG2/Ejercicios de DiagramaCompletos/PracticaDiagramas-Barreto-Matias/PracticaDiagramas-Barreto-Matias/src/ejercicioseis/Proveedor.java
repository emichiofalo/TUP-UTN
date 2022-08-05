package ejercicioseis;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Proveedor extends Persona implements Estado_Cuenta{

    private String nombreComercial;

    public Proveedor() {
    }

    public Proveedor(String nombreComercial, int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        this.nombreComercial = nombreComercial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    @Override
    public boolean problemaVerazCodeme() {
        return false;
    }           
}
