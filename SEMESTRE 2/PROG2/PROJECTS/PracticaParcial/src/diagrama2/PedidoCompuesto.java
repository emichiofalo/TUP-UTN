package diagrama2;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class PedidoCompuesto extends Pedido{
    
    ArrayList<PedidoSimple> pedidos_simples = new ArrayList();
    ArrayList<Pedido> pedidos = new ArrayList();

    public PedidoCompuesto() {
    }

    public PedidoCompuesto(int total, EstadoPedido estado, LineaDePedido lineaPedido) {
        super(total, estado, lineaPedido);
    }

    public ArrayList<PedidoSimple> getPedidos_simples() {
        return pedidos_simples;
    }

    public void setPedidos_simples(PedidoSimple pedido_simple) {
        pedidos_simples.add(pedido_simple);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void añadirPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void eliminar_pedido(Pedido pedido){
        if (this.pedidos.contains(pedido)) {
            pedidos.remove(pedido);
        }
    }    
    
//    public int obtener_total(){
//        return super.obtener_Total();
//    }
    
    public boolean cobrar(){
        return true;
    }
    
    public void obtener_detalle(){
        
    }
    
//    public ArrayList<Cuenta> obtener_cuentas(){
//        
//    }
    
    
    
}
