package diagramaclases6;

/**
 *
 * @author Emi Chiófalo
 */
public class Diagnostico {

    private String texto; 
    private TipoDiagnostico tipo;
    private Tratamiento tratamiento = new Tratamiento();

    public Diagnostico() {
    }

    public Diagnostico(String texto, TipoDiagnostico tipo) {
        this.texto = texto;
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }
    
    public void addTratamiento(Tratamiento tratamiento){
        this.tratamiento = tratamiento;
    }

    public TipoDiagnostico getTipo() {
        return tipo;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }    
    
    public boolean esAlta(){
        System.out.println("Paciente dado de alta.");
        return true;
    }
    
    public void tratar(Tratamiento tratamiento){                                
        System.out.println("Aplicando el tratamiento: " + tratamiento.getTexto());
        this.tipo = TipoDiagnostico.tdAlta; 
    }
    
}
