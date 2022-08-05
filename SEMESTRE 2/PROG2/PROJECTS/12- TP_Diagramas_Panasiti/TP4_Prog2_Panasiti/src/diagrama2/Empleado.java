/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama2;

import java.util.Date;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class Empleado extends Persona{
    private Date fechaIngreso;
    private int nroLegajo;

    public Empleado(long dni, String nombre, String apellido, long cuit, Date fechaIngreso, int nroLegajo) {
        super(dni, nombre, apellido, cuit);
        this.fechaIngreso = fechaIngreso;
        this.nroLegajo = nroLegajo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }
    
}
