package ejerciciotres;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Clinica {

    private ArrayList<Especialidad> especialidades = new ArrayList<>();

    public Clinica() {
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidad especialidades) {
        this.especialidades.add(especialidades);
    }

    @Override
    public String toString() {
        return "Clinica "+ "\n" 
                +"Especialidades = " + especialidades.get(0).getNombre() + "\n" 
                +"Medico: "+ especialidades.get(0).getMedicos().get(0).getNombreApellido()+ "\n" 
                +"Paciente: " + especialidades.get(0).getMedicos().get(0).getPaciente().get(0).toString()+ "\n"
                +"Habitacion " + especialidades.get(0).getHabitaciones().get(0).toString()+ "\n"
                +"Diagnostico " + especialidades.get(0).getMedicos().get(0).getPaciente().get(0).getDiagnostico().toString();
    }
}
