package diagramaclases5;

/**
 *
 * @author Emi Chiófalo
 */
public class Proveedor extends Persona implements Estado_Cuenta{
    
    private String nombre_Comercial; 

    public Proveedor(String nombre_Comercial, int dni, String nombre, String apellido, long cuit) {
        super(dni, nombre, apellido, cuit);
        this.nombre_Comercial = nombre_Comercial;
    }

    public String getNombre_Comercial() {
        return nombre_Comercial;
    }

    public void setNombre_Comercial(String nombre_Comercial) {
        this.nombre_Comercial = nombre_Comercial;
    }
    
    public boolean problemaVerazCodeme(){
        System.out.println("Con problemas en el Veraz/Codeme");
        return true; 
    }
    
}
