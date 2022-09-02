/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.parteb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class HistoriaClinica {
    
    private int idHistriaClinica; 
    private int numero; 
    private Date fechaAlta; 
    private Paciente paciente; 
    private List<DetalleHistoriaClinica> detallesHC; 

    public HistoriaClinica() {
    }

    public HistoriaClinica(int idHistriaClinica, int numero, Date fechaAlta, Paciente paciente, List<DetalleHistoriaClinica> detallesHC) {
        this.idHistriaClinica = idHistriaClinica;
        this.numero = numero;
        this.fechaAlta = fechaAlta;
        this.paciente = paciente;
        this.detallesHC = detallesHC;
    }

    public int getIdHistriaClinica() {
        return idHistriaClinica;
    }

    public void setIdHistriaClinica(int idHistriaClinica) {
        this.idHistriaClinica = idHistriaClinica;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<DetalleHistoriaClinica> getDetallesHistoriaClinica() {
        return detallesHC;
    }

    public void addDetalleHistoriaClinica(DetalleHistoriaClinica detalleHC) {
        if (this.detallesHC == null) {
            this.detallesHC = new ArrayList();
        }
        this.detallesHC.add(detalleHC);
    }
    
    
}
