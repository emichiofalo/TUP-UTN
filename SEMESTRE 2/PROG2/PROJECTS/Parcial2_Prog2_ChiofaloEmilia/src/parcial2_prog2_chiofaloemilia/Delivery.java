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
public class Delivery extends Entrega implements Estado{
    
    private double precio; 
    private EstadoPedido estado; 
    private Repartidor repartidor; 

    public Delivery() {
    }

    public Delivery(double precio, EstadoPedido estado) {
        this.precio = precio;
        this.estado = estado;
    }

    public Delivery(double precio, EstadoPedido estado, Repartidor repartidor, int numeroEntrega, String descripcion, Pedido pedido) {
        super(numeroEntrega, descripcion, pedido);
        this.precio = precio;
        this.estado = estado;
        this.repartidor = repartidor;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = EstadoPedido.CERRADO;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
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
