package ejercicioseis;

import java.util.Date;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class TarjedaDeCredito {

    private Date fechaIngreso;
    private double limite;

    public TarjedaDeCredito() {
    }

    public TarjedaDeCredito(Date fechaIngreso, double limite) {
        this.fechaIngreso = fechaIngreso;
        this.limite = limite;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }        
}
