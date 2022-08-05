package diagramaclases6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class Especialidad {

    private String nombre; 
    private ArrayList<Habitacion> habitaciones = new ArrayList();
    private ArrayList<Medico> medicos = new ArrayList();
    
    private boolean asignarHabitacion (Paciente paciente){
        boolean retorno = false; 
        for (Habitacion habitacion : habitaciones){
            if (habitacion.ingresaPaciente(paciente)) {
                retorno = true;
            }else{
                retorno = false; 
            }
        }
        return retorno;
    }
    
    private void asignarMedico(Paciente paciente){
        System.out.println("Ingrese el nombre del médico que le corresponde al paciente: ");
        String medElegido = new Scanner(System.in).nextLine();
        for (Medico medico : medicos){
            if (medElegido.equalsIgnoreCase(medico.getNombreApellidos())) {
                medico.addPaciente(paciente);
            }
        }
    }

    public Especialidad() {
    }

    public Especialidad(String nombre, Medico jefe) {
        this.nombre = nombre;
    }
    
    public void addHabitacion (Habitacion habitacion){
        habitaciones.add(habitacion);
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean ingresarPaciente (Paciente paciente){
        boolean retorno = false;
        for (Habitacion habitacion : habitaciones){
            if (habitacion.ingresaPaciente(paciente)) {
                retorno = true;
            }else{
                System.out.println("No hay habitaciones disponibles");
                retorno = false; 
            }
        }
        return retorno; 
    }
    
    public void addMedico(Medico medico){
        medicos.add(medico);
    }
    
    public ArrayList<Paciente> getPacientesListosParaElAlta(){
        ArrayList<Paciente> pacientesParaAlta = new ArrayList();
        for (Medico medico : medicos){
            for (Paciente paciente : medico.getPacientes()){
                for (Diagnostico diagnostico : paciente.getDiagnosticos()){
                    if (diagnostico.getTipo() == TipoDiagnostico.tdAlta) {
                        pacientesParaAlta.add(paciente);
                    }
                }
            }
        }
        return pacientesParaAlta;
    }
    
    public boolean darAlta(Paciente paciente){
        boolean retorno = false;
        for (Medico medico : medicos){
            if (medico.getPacientes().contains(paciente)){
                for (Diagnostico diagnostico : paciente.getDiagnosticos()){
                    if (diagnostico.esAlta()) {
                        retorno = true;
                    }
                }
            }
        }
        return retorno; 
    }
    
    public Habitacion buscarHabitacion(Paciente paciente){
        Habitacion retorno = null;
        for(Habitacion habitacion : habitaciones){
            for(Cama cama : habitacion.getCamas()){
                if (cama.getPaciente().equals(paciente)) {
                    retorno = habitacion;
                }
            }
        }
        return retorno;
    }
    
    public Medico buscarMedico(Paciente paciente){
        Medico retorno = null; 
        for(Medico medico : medicos){
            if (medico.getPacientes().contains(paciente)) {
                retorno = medico;
            }
        }
        return retorno;
    }
    
    public boolean estaIngresado(Paciente paciente){
        boolean retorno = false; 
        for(Habitacion habitacion : habitaciones){
            for(Cama cama : habitacion.getCamas()){
                if (cama.getPaciente().equals(paciente)) {
                    System.out.println("El paciente está ingresado");
                    retorno = true;
                }
            }
        }
        return retorno; 
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }
    
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
}
