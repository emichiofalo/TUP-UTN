package diagramaclases5;

import java.util.Date;

/**
 *
 * @author Emi Chiófalo
 */
public class Factura {

    private Empleado empleado = new Empleado();                                                               
    private Cliente cliente = new Cliente(); 
    private int nro_Factura; 
    private Date fecha; 
    private double monto; 

    public Factura(Empleado empleado, Cliente cliente, int nro_Factura, Date fecha, double monto) {
        this.empleado = empleado;                                               
        this.cliente = cliente;
        this.nro_Factura = nro_Factura;
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

    public int getNro_Factura() {
        return nro_Factura;
    }

    public void setNro_Factura(int nro_Factura) {
        this.nro_Factura = nro_Factura;
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
