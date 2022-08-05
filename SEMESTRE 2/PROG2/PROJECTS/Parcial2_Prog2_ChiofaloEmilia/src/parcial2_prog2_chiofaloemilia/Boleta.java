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
public class Boleta extends DocumentoVenta{
    
    private int numeroBoleta; 

    public Boleta() {
    }

    public Boleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public Boleta(int numeroBoleta, int numeroDocumentoVenta, double monto, EstadoPedido estado) {
        super(numeroDocumentoVenta, monto, estado);
        this.numeroBoleta = numeroBoleta;
    }

    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }
    
    
}
