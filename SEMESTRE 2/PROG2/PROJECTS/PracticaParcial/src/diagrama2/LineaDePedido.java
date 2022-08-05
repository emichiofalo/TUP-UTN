package diagrama2;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class LineaDePedido {

    private int num;
    public ArrayList<Producto> productos = new ArrayList();
    public Pedido pedido; 

    public LineaDePedido(int num, Pedido pedido) {
        this.num = num;
        this.pedido = pedido;
    }

    public LineaDePedido() {
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Producto producto) {
        productos.add(producto);
    }
    
    public boolean cambiar(int num){                                            //incompleto
        return true;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
   
}
