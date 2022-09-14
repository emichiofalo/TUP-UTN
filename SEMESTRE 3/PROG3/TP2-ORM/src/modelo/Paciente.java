/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Emi Chiófalo
 */

@Entity
public class Paciente extends Persona{
    
    private int nroSocio; 
    private List<Turno> turnos; 
    private HistoriaClinica historiaClinica; 

    public Paciente() {
    }

    public Paciente(int idPaciente, int nroSocio, List<Turno> turnos, HistoriaClinica historiaClinica, int idPersona, String nombre, String apellido, long dni, Domicilio domicilio) {
        super(nombre, apellido, dni, domicilio);
        this.nroSocio = nroSocio;
        this.turnos = turnos;
        this.historiaClinica = historiaClinica;
    }

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    public List<Turno> getTurnos() {
        return turnos;
    }

    public void addTurnos(Turno turno) {
        if (this.turnos == null) {
            this.turnos = new ArrayList();
        }
        this.turnos.add(turno);
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "idHistoriaClinica")
    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
    
    
    
}
