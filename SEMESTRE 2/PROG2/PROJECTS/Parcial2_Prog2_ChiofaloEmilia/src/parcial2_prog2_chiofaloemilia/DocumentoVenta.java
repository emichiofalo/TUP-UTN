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
public class DocumentoVenta implements Estado{
    
    protected int numeroDocumentoVenta; 
    protected double monto; 
    protected EstadoPedido estado; 

    public DocumentoVenta() {
    }

    public DocumentoVenta(int numeroDocumentoVenta, double monto, EstadoPedido estado) {
        this.numeroDocumentoVenta = numeroDocumentoVenta;
        this.monto = monto;
        this.estado = estado;
    }
    
    @Override
    public boolean estadoPedido(EstadoPedido estadoPedido){
        switch (estadoPedido) {
            case ABIERTO:
                return true;
            case CERRADO:
                return false;
            case EN_PROCESO:
                return true;
            default:
                return false;
        }     
    }

    public int getNumeroDocumentoVenta() {
        return numeroDocumentoVenta;
    }

    public void setNumeroDocumentoVenta(int numeroDocumentoVenta) {
        this.numeroDocumentoVenta = numeroDocumentoVenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = EstadoPedido.ABIERTO;
    }
    
    
    
}
