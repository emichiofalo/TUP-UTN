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
public class Pago implements Estado{
    
    protected int numeroPago; 
    protected String descripcion; 
    protected EstadoPedido estado; 
    protected double montoTotal; 

    public Pago() {
    }

    public Pago(int numeroPago, String descripcion, EstadoPedido estado, double montoTotal) {
        this.numeroPago = numeroPago;
        this.descripcion = descripcion;
        this.estado = estado;
        this.montoTotal = montoTotal;
    }

    public int getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = EstadoPedido.EN_PROCESO;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
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
