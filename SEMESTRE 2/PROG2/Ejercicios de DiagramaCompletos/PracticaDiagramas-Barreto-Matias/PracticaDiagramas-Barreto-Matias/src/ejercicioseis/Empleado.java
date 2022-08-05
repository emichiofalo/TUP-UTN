package ejercicioseis;

import java.util.Date;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Empleado extends Persona{

    private Date fechaIngreso;
    private int nroLegajo;

    public Empleado() {
    }

    public Empleado(Date fechaIngreso, int nroLegajo, int dni, String nombre, String apellido, long cuit) {
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
