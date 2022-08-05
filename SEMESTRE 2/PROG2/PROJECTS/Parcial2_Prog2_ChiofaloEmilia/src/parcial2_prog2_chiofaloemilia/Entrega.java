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
public class Entrega {
    
    protected int numeroEntrega; 
    protected String descripcion; 
    protected Pedido pedido; 

    public Entrega() {
    }

    public Entrega(int numeroEntrega, String descripcion, Pedido pedido) {
        this.numeroEntrega = numeroEntrega;
        this.descripcion = descripcion;
        this.pedido = pedido;
    }

    public int getNumeroEntrega() {
        return numeroEntrega;
    }

    public void setNumeroEntrega(int numeroEntrega) {
        this.numeroEntrega = numeroEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
     
    
    
}
