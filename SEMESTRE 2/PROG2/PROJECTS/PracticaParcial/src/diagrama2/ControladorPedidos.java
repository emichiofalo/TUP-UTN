package diagrama2;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class ControladorPedidos {                                               //metodos incompletos

    public ArrayList<Cliente> clientes = new ArrayList();
    public ArrayList<Pedido> pedidos = new ArrayList();

    public ControladorPedidos() {
    }
    
    public void cobrar_pedidos(){
        
    }
    
    public void servir_pedidos(){
        
    }
    
    public void confirmar_pedidos(){
        
    }

    public ArrayList<Cliente> getCliente() {
        return clientes;
    }

    public void setClientes(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido pedido) {
        pedidos.add(pedido);
    }

    
    
}
