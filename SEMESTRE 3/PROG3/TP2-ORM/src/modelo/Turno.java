/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Emi Chiófalo
 */

@Entity
public class Turno extends EntityApp{
    
    private int idTurno; 
    private Date fecha; 
    private int hora; 
    private int minutos; 
    private Paciente paciente; 
    private Medico medico; 

    public Turno() {
    }

    public Turno(int idTurno, Date fecha, int hora, int minutos, Paciente paciente, Medico medico) {
        this.idTurno = idTurno;
        this.fecha = fecha;
        this.hora = hora;
        this.minutos = minutos;
        this.paciente = paciente;
        this.medico = medico;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    @Temporal(TemporalType.DATE)
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPaciente")
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idMedico")
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
}
