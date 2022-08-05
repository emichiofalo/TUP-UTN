/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

import java.time.LocalDate;

/**
 *
 * @author Emi Chiófalo
 */
public class Licencias {

    private int idLicencia; 
    private LocalDate fechaDeVto;
    private int puntosInicialesLicencia; 
    private Conductor conductor = new Conductor();

    public Licencias() {
    }
    
    public Licencias(int idLicencia, LocalDate fechaDeVto, int puntosInicialesLicencia) {
        this.idLicencia = idLicencia;
        this.fechaDeVto = fechaDeVto;
        this.puntosInicialesLicencia = puntosInicialesLicencia;
    }

    public Licencias(int idLicencia, LocalDate fechaDeVto, int puntosInicialesLicencia, Conductor conductor) {
        this.idLicencia = idLicencia;
        this.fechaDeVto = fechaDeVto;
        this.puntosInicialesLicencia = puntosInicialesLicencia;
        this.conductor = conductor;
    }
    
    public int getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    public LocalDate getFechaDeVto() {
        return fechaDeVto;
    }

    public void setFechaDeVto(LocalDate fechaDeVto) {
        this.fechaDeVto = fechaDeVto;
    }

    public int getPuntosInicialesLicencia() {
        return puntosInicialesLicencia;
    }

    public void setPuntosInicialesLicencia(int puntosInicialesLicencia) {
        this.puntosInicialesLicencia = puntosInicialesLicencia;
    }

    @Override
    public String toString() {
        return "Licencias{" + "idLicencia=" + idLicencia + ", fechaDeVto=" + fechaDeVto + ", puntosInicialesLicencia=" + puntosInicialesLicencia + ", conductor=" + conductor.toString() + '}';
    }
    
    
    
    
}
