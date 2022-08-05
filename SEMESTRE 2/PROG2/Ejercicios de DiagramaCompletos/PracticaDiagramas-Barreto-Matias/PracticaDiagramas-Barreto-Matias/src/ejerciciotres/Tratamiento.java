package ejerciciotres;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 */
public class Tratamiento {

    private String texto;

    public Tratamiento() {
    }

    public Tratamiento(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Tratamiento"+"\n"
                + "Texto = " + texto + "\n";
    }    
}
