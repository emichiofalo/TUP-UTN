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
public class Cliente extends Persona {
    
    private int numeroCliente; 
    private String direccionCliente; 
    private String telefonoCliente; 
    private Pedido pedidoCliente; 

    public Cliente() {
    }

    public Cliente(int numeroCliente, String direccionCliente, String telefonoCliente, int Personadni, String nombrePersona, String apellidoPersona) {
        super(Personadni, nombrePersona, apellidoPersona);
        this.numeroCliente = numeroCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
    }    
    
    public Cliente(int numeroCliente, String direccionCliente, String telefonoCliente, Pedido pedidoCliente) {
        this.numeroCliente = numeroCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.pedidoCliente = pedidoCliente;
    }

    public Cliente(int numeroCliente, String direccionCliente, String telefonoCliente, Pedido pedidoCliente, int Personadni, String nombrePersona, String apellidoPersona) {
        super(Personadni, nombrePersona, apellidoPersona);
        this.numeroCliente = numeroCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.pedidoCliente = pedidoCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Pedido getPedidoCliente() {
        return pedidoCliente;
    }

    public void setPedidoCliente(Pedido pedidoCliente) {
        this.pedidoCliente = pedidoCliente;
    }

    
    
    
    
}
