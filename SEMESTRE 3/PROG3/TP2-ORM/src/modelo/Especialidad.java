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
import javax.persistence.ManyToMany;

/**
 *
 * @author Emi Chiófalo
 */

@Entity
public class Especialidad extends EntityApp{
    
    private int idEspecialidad; 
    private String denominacion; 
    private List<Medico> medicos; 

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String denominacion, List<Medico> medicos) {
        this.idEspecialidad = idEspecialidad;
        this.denominacion = denominacion;
        this.medicos = medicos;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @ManyToMany(
    cascade = {CascadeType.PERSIST, CascadeType.MERGE},
    mappedBy = "especialidades",
    targetEntity = Medico.class
    )
    public List<Medico> getMedicos() {
        return medicos;
    }

    public void addMedico(Medico medico) {
        if (this.medicos == null) {
            this.medicos = new ArrayList();
        }
        this.medicos.add(medico);
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }
    
}
