package sesentayuno;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class DepositoBancario extends FormaPago{
    
    private String nroBoucher;

    public DepositoBancario(String nroBoucher, String idFormaPago, String descripcion, boolean estado) {
        super(idFormaPago, descripcion, estado);
        this.nroBoucher = nroBoucher;
    }

    public String getNroBoucher() {
        return nroBoucher;
    }

    public void setNroBoucher(String nroBoucher) {
        this.nroBoucher = nroBoucher;
    }

    @Override
    public String toString() {
        return "DepositoBancario{" + "nroBoucher=" + nroBoucher + '}';
    }        
}
