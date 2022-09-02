/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioC;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class TipoActividad {
    
    private int Codigo; 
    private String denominacion; 
    private double puntosAsignados; 
    private List<Actividad> actividades; 

    public TipoActividad() {
    }

    public TipoActividad(int Codigo, String denominacion, double puntosAsignados, List<Actividad> actividades) {
        this.Codigo = Codigo;
        this.denominacion = denominacion;
        this.puntosAsignados = puntosAsignados;
        this.actividades = actividades;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPuntosAsignados() {
        return puntosAsignados;
    }

    public void setPuntosAsignados(double puntosAsignados) {
        this.puntosAsignados = puntosAsignados;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void addActividad(Actividad actividad) {
        if (this.actividades == null) {
            this.actividades = new ArrayList();
        }
        this.actividades.add(actividad);
    }
    
    
    
}
