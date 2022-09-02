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
public class Persona {
    
    private String nombre; 
    private String tipoDocumento; 
    private long nroDocumento; 
    private int telefono; 
    private String email; 
    private String celular; 
    private List<Actividad> actividades; 
    private Sector sector; 

    public Persona() {
    }

    public Persona(String nombre, String tipoDocumento, long nroDocumento, int telefono, String email, String celular, List<Actividad> actividades, Sector sector) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.telefono = telefono;
        this.email = email;
        this.celular = celular;
        this.actividades = actividades;
        this.sector = sector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(long nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
    
    public double totalPuntosAsignados(){
        int totalPuntos = 0; 
        for (Actividad actividad : this.actividades){
            totalPuntos += actividad.getTipoActividad().getPuntosAsignados();
        }
        return totalPuntos;
    }
    
    public double totalPuntosAsignados(int codigo){
        int totalPuntos = 0;
        for (Actividad actividad : this.actividades){
            if (actividad.getTipoActividad().getCodigo() == codigo) {
                totalPuntos += actividad.getTipoActividad().getPuntosAsignados();
            }
        }
        return totalPuntos; 
    }   
    
    public double totalPuntosAsignados(int codigo, int anio){
        int totalPuntos = 0;
        for (Actividad actividad : this.actividades){
            if (actividad.getTipoActividad().getCodigo() == codigo && actividad.getFechaInicio().getYear() == anio) {
                totalPuntos += actividad.getTipoActividad().getPuntosAsignados();
            }
        }
        return totalPuntos; 
    }
    
}
