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
public class Factura extends DocumentoVenta{
    
    private int numeroFactura; 
    private TipoFactura tipoFactura; 

    public Factura() {
    }

    public Factura(int numeroFactura, TipoFactura tipoFactura) {
        this.numeroFactura = numeroFactura;
        this.tipoFactura = tipoFactura;
    }

    public Factura(int numeroFactura, TipoFactura tipoFactura, int numeroDocumentoVenta, double monto, EstadoPedido estado) {
        super(numeroDocumentoVenta, monto, estado);
        this.numeroFactura = numeroFactura;
        this.tipoFactura = tipoFactura;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(TipoFactura tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    
    
}
