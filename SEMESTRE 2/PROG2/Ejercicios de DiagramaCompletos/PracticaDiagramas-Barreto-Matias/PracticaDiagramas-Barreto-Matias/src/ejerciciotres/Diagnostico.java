package ejerciciotres;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 *
 */
public class Diagnostico {

    private String texto;
    private TipoDiagnostico tipo;
    private ArrayList<Tratamiento> tratamientos = new ArrayList<>();
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

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoDiagnostico getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiagnostico tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void addTratamientos(Tratamiento tratamientos) {
        this.tratamientos.add(tratamientos);
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "\nTexto = " + texto +"\n"
                + "Tipo = " + tipo +"\n"
                + "Tratamiento = " + tratamiento.toString() + "\n";
    }
    
}
