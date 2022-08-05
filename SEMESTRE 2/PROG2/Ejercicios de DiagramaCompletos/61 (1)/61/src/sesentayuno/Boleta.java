package sesentayuno;

import java.util.Date;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Boleta extends DocVenta{
    
    private int nroBol;

    public Boleta(int nroBol, double monto, boolean estado, Date fechaEmision, Date fechaPago) {
        super(monto, estado, fechaEmision, fechaPago);
        this.nroBol = nroBol;
    }

    public int getNroBol() {
        return nroBol;
    }

    public void setNroBol(int nroBol) {
        this.nroBol = nroBol;
    }

    @Override
    public String toString() {
        return "Boleta{" + "nroBol=" + nroBol + '}';
    }        
}
