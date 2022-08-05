package diagramaclases6;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Clinica {

    ArrayList<Especialidad> especialidades = new ArrayList();
    
    public void addEspecialidad (Especialidad especialidad){
        especialidades.add(especialidad);
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
    
    public Especialidad buscarEspecialidadPaciente(Paciente paciente){
        Especialidad retorno = null; 
        for (Especialidad especialidad : especialidades){
            for(Medico medico : especialidad.getMedicos()){
                for(Paciente pac : medico.getPacientes()){
                    if (medico.getPacientes().contains(paciente)) {
                        retorno = especialidad; 
                    }
                }
            }
        }
        return retorno; 
    }
    
    public Especialidad obtenerEspecialidad(String nombre){
        Especialidad retorno = null; 
        for(Especialidad especialidad : especialidades){
            if (especialidad.getNombre().equalsIgnoreCase(nombre)){
                return especialidad;                 
            }
        }
        System.out.println("No existe esa especialidad en la clinica");
        return retorno;
    }
    
}
