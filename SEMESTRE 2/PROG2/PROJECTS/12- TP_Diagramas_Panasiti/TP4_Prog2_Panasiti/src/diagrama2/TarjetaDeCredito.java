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
public class TarjetaDeCredito {
    private Date fechaIngreso;
    private double limite;
    private Cliente cliente;

    public TarjetaDeCredito(Date fechaIngreso, double limite) {
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

    public Cliente getCliente() {
        return cliente;
    }
    
}
