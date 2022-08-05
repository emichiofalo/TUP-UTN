package diagramaclases6;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Medico {

    private String nombreApellidos;
    private ArrayList<Paciente> pacientes = new ArrayList();

    public Medico() {
    }

    public Medico(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }
    
    public void addPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    
    public int getCargaPacientes(){                                             //qué pide el método? 
        return pacientes.size();
    }
    
    public boolean quitarPaciente(Paciente paciente){
        for(Paciente pac : pacientes){
            if (pac.getNombreApellidos().equals(paciente.getNombreApellidos())) {
                pacientes.remove(pac);
                return true;
            }
        }
        return false;
    }
    
    public boolean tieneAlPaciente(Paciente paciente){
        for(Paciente pac : pacientes){
            if (pac.equals(paciente)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    
}
