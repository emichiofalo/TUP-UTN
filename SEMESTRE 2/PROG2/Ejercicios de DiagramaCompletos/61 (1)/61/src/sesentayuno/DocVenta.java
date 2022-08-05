package sesentayuno;

import java.util.Date;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class DocVenta {

    private double monto;
    private boolean estado;
    private Date fechaEmision;
    private Date fechaPago;

    public DocVenta() {
    }

    public DocVenta(double monto, boolean estado, Date fechaEmision, Date fechaPago) {
        this.monto = monto;
        this.estado = estado;
        this.fechaEmision = fechaEmision;
        this.fechaPago = fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "DocVenta{" + "monto=" + monto + ", estado=" + estado + ", fechaEmision=" + fechaEmision + ", fechaPago=" + fechaPago + '}';
    }
}
