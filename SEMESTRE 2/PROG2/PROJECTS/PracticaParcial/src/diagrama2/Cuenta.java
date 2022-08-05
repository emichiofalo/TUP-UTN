package diagrama2;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Cuenta {
    
    private int disponible; 
    private String numero_tarjeta; 
    private ArrayList<PedidoSimple> pedidos = new ArrayList();

    public Cuenta() {
    }

    public Cuenta(int disponible, String numero_tarjeta) {
        this.disponible = disponible;
        this.numero_tarjeta = numero_tarjeta;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public ArrayList<PedidoSimple> getPedidos() {
        return pedidos;
    }

    public void setPedidos(PedidoSimple pedido) {
        pedidos.add(pedido);
    }
    
    public void aumentar_disponible(int cantidad){
        
    }
    
    public void pagar_pedido(int cantidad){
        
    }
    
    
}
