package diagrama2;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class PedidoSimple extends Pedido{

    public Cuenta cuenta; 

    public PedidoSimple() {
    }

    public PedidoSimple(int total, EstadoPedido estado, LineaDePedido lineaPedido) {
        super(total, estado, lineaPedido);
    }

    public PedidoSimple(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public PedidoSimple(Cuenta cuenta, int total, EstadoPedido estado, LineaDePedido lineaPedido) {
        super(total, estado, lineaPedido);
        this.cuenta = cuenta;
    }
    
    
}
