/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Emi Chiófalo
 */

@Entity
public class HistoriaClinica extends EntityApp{
    
    private int numero; 
    private Date fechaAltaHC; 
    private Paciente paciente; 
    private List<DetalleHistoriaClinica> detallesHC; 

    public HistoriaClinica() {
    }

    public HistoriaClinica(int numero, Date fechaAltaHC, Paciente paciente, List<DetalleHistoriaClinica> detallesHC) {
        this.numero = numero;
        this.fechaAltaHC = fechaAltaHC;
        this.paciente = paciente;
        this.detallesHC = detallesHC;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getFechaAltaHC() {
        return fechaAltaHC;
    }

    public void setFechaAltaHC(Date fechaAlta) {
        this.fechaAltaHC = fechaAlta;
    }

    @OneToOne(mappedBy = "historiaClinica", cascade = CascadeType.ALL)
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    @OneToMany(mappedBy = "historiaClinica", cascade = CascadeType.ALL)
    public List<DetalleHistoriaClinica> getDetallesHC() {
        return detallesHC;
    }

    public void setDetallesHC(List<DetalleHistoriaClinica> detallesHC) {
        this.detallesHC = detallesHC;
    }
    
    public void addDetalleHistoriaClinica(DetalleHistoriaClinica detalleHC) {
        if (this.detallesHC == null) {
            this.detallesHC = new ArrayList();
        }
        this.detallesHC.add(detalleHC);
    }

   
}
