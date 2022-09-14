/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;

/**
 *
 * @author Emi Chiófalo
 */

@Entity
public class Empleado extends Persona{
    
    private int nroLegajo; 
    private double sueldo; 

    public Empleado() {
    }

    public Empleado(int nroLegajo, double sueldo, int idPersona, String nombre, String apellido, long dni, Domicilio domicilio) {
        super(nombre, apellido, dni, domicilio);
        this.nroLegajo = nroLegajo;
        this.sueldo = sueldo;
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
