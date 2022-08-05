package ejerciciosiete;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Detective extends Persona{

    private String numeroPlaca;

    public Detective() {
    }

    public Detective(String numeroPlaca, String nombre, String apellido) {
        super(nombre, apellido);
        this.numeroPlaca = numeroPlaca;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
    
    public boolean investigarMafioso(Mafioso mafioso){
        return true;
    }
}
