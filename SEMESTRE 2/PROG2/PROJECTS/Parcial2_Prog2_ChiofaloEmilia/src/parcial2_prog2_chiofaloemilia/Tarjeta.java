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
public class Tarjeta extends Pago{
    
    private int numeroTarjeta;

    public Tarjeta() {
    }

    public Tarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Tarjeta(int numeroTarjeta, int numeroPago, String descripcion, EstadoPedido estado, double montoTotal) {
        super(numeroPago, descripcion, estado, montoTotal);
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    
    
}
