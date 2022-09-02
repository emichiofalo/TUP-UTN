/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioB;

import java.time.LocalDate;

/**
 *
 * @author Emi Chiófalo
 */
public class Asistencia {
    
    private long Id; 
    private String tipo; 
    private LocalDate fecha; 
    private int hora; 
    private int minuto; 
    private Empleado empleado; 

    public Asistencia() {
    }

    public Asistencia(long Id, String tipo, LocalDate fecha, int hora, int minuto, Empleado empleado) {
        this.Id = Id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
        this.minuto = minuto;
        this.empleado = empleado;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    
}
