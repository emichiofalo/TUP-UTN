/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2_prog2_chiofaloemilia;

/**
 *
 * @author Emi Chiófalo
 */
public class DepositoBancario extends Pago{
    
    private int numeroBoucher; 

    public DepositoBancario() {
    }

    public DepositoBancario(int numeroBoucher) {
        this.numeroBoucher = numeroBoucher;
    }

    public DepositoBancario(int numeroBoucher, int numeroPago, String descripcion, EstadoPedido estado, double montoTotal) {
        super(numeroPago, descripcion, estado, montoTotal);
        this.numeroBoucher = numeroBoucher;
    }

    public int getNumeroBoucher() {
        return numeroBoucher;
    }

    public void setNumeroBoucher(int numeroBoucher) {
        this.numeroBoucher = numeroBoucher;
    }
    
    
}
