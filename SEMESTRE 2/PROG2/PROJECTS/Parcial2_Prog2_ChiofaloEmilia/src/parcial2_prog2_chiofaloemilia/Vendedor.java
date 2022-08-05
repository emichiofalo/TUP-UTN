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
public class Vendedor extends Persona{
    
    private int numeroVendedor; 
    private Pedido pedidoVendedor; 

    public Vendedor() {
    }

    public Vendedor(int numeroVendedor, Pedido pedidoVendedor) {
        this.numeroVendedor = numeroVendedor;
        this.pedidoVendedor = pedidoVendedor;
    }

    public Vendedor(int numeroVendedor, Pedido pedidoVendedor, int Personadni, String nombrePersona, String apellidoPersona) {
        super(Personadni, nombrePersona, apellidoPersona);
        this.numeroVendedor = numeroVendedor;
        this.pedidoVendedor = pedidoVendedor;
    }

    public int getNumeroVendedor() {
        return numeroVendedor;
    }

    public void setNumeroVendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    public Pedido getPedidoVendedor() {
        return pedidoVendedor;
    }

    public void setPedidoVendedor(Pedido pedidoVendedor) {
        this.pedidoVendedor = pedidoVendedor;
    }
    
    
    
    
    
}
