package ejercicioseis;

import java.util.Date;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 * 
 */

public class Factura {
    
    private Empleado empleado = new Empleado();
    private Cliente cliente = new Cliente();
    private int numeroFactura;
    private Date fecha;
    private double monto;

    public Factura() {
    }

    public Factura(int numeroFactura, Date fecha, double monto) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.monto = monto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
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
