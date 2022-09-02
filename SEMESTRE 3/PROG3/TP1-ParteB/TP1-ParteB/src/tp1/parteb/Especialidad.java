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
public class Especialidad {
    
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

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void addMedico(Medico medico) {
        if (this.medicos == null) {
            this.medicos = new ArrayList();
        }
        this.medicos.add(medico);
    }
    
    
}
