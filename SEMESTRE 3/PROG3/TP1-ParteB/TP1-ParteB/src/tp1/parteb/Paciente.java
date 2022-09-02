/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.parteb;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class Paciente extends Persona{
    
    private int idPaciente; 
    private int nroSocio; 
    private List<Turno> turnos; 
    private HistoriaClinica historiaClinica; 

    public Paciente() {
    }

    public Paciente(int idPaciente, int nroSocio, List<Turno> turnos, HistoriaClinica historiaClinica, int idPersona, String nombre, String apellido, long dni, Domicilio domicilio) {
        super(idPersona, nombre, apellido, dni, domicilio);
        this.idPaciente = idPaciente;
        this.nroSocio = nroSocio;
        this.turnos = turnos;
        this.historiaClinica = historiaClinica;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void addTurnos(Turno turno) {
        if (this.turnos == null) {
            this.turnos = new ArrayList();
        }
        this.turnos.add(turno);
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    
    
    
}
