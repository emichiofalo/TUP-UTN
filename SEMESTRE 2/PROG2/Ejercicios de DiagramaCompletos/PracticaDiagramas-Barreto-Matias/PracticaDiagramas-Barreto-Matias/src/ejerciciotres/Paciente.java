package ejerciciotres;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Paciente {

    private String NSIP;
    private String nombreApellido;
    private char sexo;
    private Fecha fecha = new Fecha();
    private Diagnostico diagnostico = new Diagnostico();

    public Paciente() {
    }

    public Paciente(String NSIP, String nombreApellido, char sexo, Fecha fecha) {
        this.NSIP = NSIP;
        this.nombreApellido = nombreApellido;
        this.sexo = sexo;
        this.fecha = fecha;
    }

    public String getNSIP() {
        return NSIP;
    }

    public void setNSIP(String NSIP) {
        this.NSIP = NSIP;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "\nNSIP= " + NSIP + "\n"
                + "Nombre Apellido= " + nombreApellido + "\n"
                + "Sexo= " + sexo + "\n"
                + "Fecha= " + fecha.getDia() + "/" + fecha.getMes() + "/" + fecha.getAnio() + "\n"
                + "Diagnostico= " + diagnostico.getTexto() + "\n";
    }

}
