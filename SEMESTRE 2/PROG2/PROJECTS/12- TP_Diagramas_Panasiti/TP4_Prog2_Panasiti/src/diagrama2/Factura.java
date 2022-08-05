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
public class Factura {
    private Empleado emp;
    private Cliente cli;
    private int nroFactura;
    private Date fecha;
    private double monto;

    public Factura(Empleado emp, Cliente cli, int nroFactura, Date fecha, double monto) {
        this.emp = emp;
        this.cli = cli;
        this.nroFactura = nroFactura;
        this.fecha = fecha;
        this.monto = monto;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
