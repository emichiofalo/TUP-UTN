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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Emi Chiófalo
 */

@Entity
public class Medico extends Persona{
    
    private int matricula; 
    private long celular; 
    private List<Especialidad> especialidades; 
    private List<Turno> turnos; 

    public Medico() {
    }

    public Medico(int matricula, long celular, List<Especialidad> especialidades, List<Turno> turnos, int idPersona, String nombre, String apellido, long dni, Domicilio domicilio) {
        super(nombre, apellido, dni, domicilio);
        this.matricula = matricula;
        this.celular = celular;
        this.especialidades = especialidades;
        this.turnos = turnos;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    @ManyToMany(fetch=FetchType.LAZY,
    targetEntity=Especialidad.class,
    cascade=CascadeType.ALL)
    @JoinTable(
    name="MEDICO_ESPECIALIDAD",
    joinColumns=@JoinColumn(name="idMedico"),
    inverseJoinColumns=@JoinColumn(name="idEspecialidad")
    )
    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public void addEspecialidad(Especialidad especialidad) {
        if (this.especialidades == null) {
            this.especialidades = new ArrayList();
        }
        this.especialidades.add(especialidad);
    }

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    public List<Turno> getTurnos() {
        return turnos;
    }

    public void addTurno(Turno turno) {
        if (this.turnos == null) {
            this.turnos = new ArrayList();
        }
        this.turnos.add(turno);
    }
    
    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    
}
