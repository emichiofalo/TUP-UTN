/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.parteb;

/**
 *
 * @author Emi Chiófalo
 */
public class Empleado extends Persona{
    
    private int idEmpleado; 
    private int nroLegajo; 
    private double sueldo; 

    public Empleado() {
    }

    public Empleado(int idEmpleado, int nroLegajo, double sueldo, int idPersona, String nombre, String apellido, long dni, Domicilio domicilio) {
        super(idPersona, nombre, apellido, dni, domicilio);
        this.idEmpleado = idEmpleado;
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
