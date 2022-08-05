package ejerciciotres;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Medico {

    private String nombreApellido;
    private ArrayList<Paciente> paciente = new ArrayList<>();

    public Medico() {
    }

    public Medico(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public ArrayList<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente.add(paciente);
    }

    @Override
    public String toString() {
        return "Medico{" + "nombreApellido=" + nombreApellido + ", paciente=" + paciente.get(0).getNombreApellido() 
                + "\n" + "paciente = " + paciente.get(0).getNombreApellido() + "\n" 
                + "\n" + "paciente = " + paciente.get(0).getFecha()+ "\n"
                + "\n" + "paciente = " + paciente.get(0).getSexo()+ "\n"
                + "\n" + "paciente = " + paciente.get(0).getDiagnostico().getTratamientos().get(0).getTexto()+ "\n";
    }

}
