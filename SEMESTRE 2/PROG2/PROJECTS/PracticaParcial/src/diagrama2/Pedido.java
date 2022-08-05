package diagrama2;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Pedido {

    private int total; 
    private EstadoPedido estado; 
    private LineaDePedido lineaPedido; 

    public Pedido() {
    }

    public Pedido(int total, EstadoPedido estado, LineaDePedido lineaPedido) {
        this.total = total;
        this.estado = estado;
        this.lineaPedido = lineaPedido;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public LineaDePedido getLineaPedido() {
        return lineaPedido;
    }

    public void setLineaPedido(LineaDePedido lineaPedido) {
        this.lineaPedido = lineaPedido;
    }

    

   
}
