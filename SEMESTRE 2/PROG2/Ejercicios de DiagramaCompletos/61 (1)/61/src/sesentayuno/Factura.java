package sesentayuno;

import java.util.Date;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Factura extends DocVenta {

    private int nroFactura;

    public Factura() {
    }

    public Factura(int nroFactura, double monto, boolean estado, Date fechaEmision, Date fechaPago) {
        super(monto, estado, fechaEmision, fechaPago);
        this.nroFactura = nroFactura;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "nroFactura=" + nroFactura + '}';
    }
}
