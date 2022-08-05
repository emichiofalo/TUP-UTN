package diagrama2;

/**
 *
 * @author Emi Chiófalo
 */
public enum EstadoPedido {
    
    PENDIENTE(1),
    PAGADO(2), 
    SERVIDO(3),
    CONFIRMADO(4),
    RECHAZADO(5);
    
    private int estadoPedido;

    private EstadoPedido(int estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    
}
