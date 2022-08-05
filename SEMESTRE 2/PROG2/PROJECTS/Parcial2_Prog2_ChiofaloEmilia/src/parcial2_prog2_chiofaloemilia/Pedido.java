/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2_prog2_chiofaloemilia;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Pedido implements Estado{
    
    private int numeroPedido; 
    private double monto; 
    private EstadoPedido estado; 
    private Entrega entrega;
    private DocumentoVenta documentoVenta = new DocumentoVenta();
    private Pago pago = new Pago();
    private DetallePedido detallePedido;

    public Pedido() {
    }

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    
    public Pedido(int numeroPedido, double monto, EstadoPedido estado) {
        this.numeroPedido = numeroPedido;
        this.monto = monto;
        this.estado = estado;
    }
    
    public Pedido(int numeroPedido, double monto, EstadoPedido estado, Entrega entrega, DetallePedido detallePedido) {
        this.numeroPedido = numeroPedido;
        this.monto = monto;
        this.estado = estado;
        this.entrega = entrega;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
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

    public DocumentoVenta getDocumentoVenta() {
        return documentoVenta;
    }

    public void setDocumentoVenta(DocumentoVenta documentoVenta) {
        this.documentoVenta = documentoVenta;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public DetallePedido getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(DetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }
    
    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
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
    
    
    
}
