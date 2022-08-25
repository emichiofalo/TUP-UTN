/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioA;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Control {
    
    private int id; 
    private String denominacion; 
    private boolean esObligatorio; 
    private EstadoControl estadoControl; 
    private ArrayList <Expediente> expedientes; 

    public Control() {
    }

    public Control(int id, String denominacion, boolean esObligatorio, EstadoControl estadoControl, ArrayList<Expediente> expedientes) {
        this.id = id;
        this.denominacion = denominacion;
        this.esObligatorio = esObligatorio;
        this.estadoControl = estadoControl;
        this.expedientes = expedientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public boolean isEsObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }

    public EstadoControl getEstadoControl() {
        return estadoControl;
    }

    public void setEstadoControl(EstadoControl estadoControl) {
        this.estadoControl = estadoControl;
    }

    public ArrayList<Expediente> getExpedientes() {
        return expedientes;
    }

    public void addExpedientes(Expediente expedientes) {
        if (this.expedientes == null) {
            this.expedientes = new ArrayList();
        }
        this.expedientes.add(expedientes);
    }
    
    
    
}
