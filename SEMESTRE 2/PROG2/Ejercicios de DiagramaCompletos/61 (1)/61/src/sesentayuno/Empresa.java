package sesentayuno;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Empresa extends Cliente {
    
    private String baseLegal;
    private String nombreComercial;

    public Empresa() {
    }

    public Empresa(String baseLegal, String nombreComercial, int idCliente, String direccion, String tel, String email, boolean estado) {
        super(idCliente, direccion, tel, email, estado);
        this.baseLegal = baseLegal;
        this.nombreComercial = nombreComercial;
    }

    public String getBaseLegal() {
        return baseLegal;
    }

    public void setBaseLegal(String baseLegal) {
        this.baseLegal = baseLegal;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    @Override
    public String toString() {
        return "Empresa{" + "baseLegal=" + baseLegal + ", nombreComercial=" + nombreComercial + '}';
    }        
}
