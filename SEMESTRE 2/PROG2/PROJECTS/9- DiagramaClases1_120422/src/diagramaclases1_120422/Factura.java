package diagramaclases1_120422;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Factura extends Comprobante{
    
    private double total; 
    private Cliente mCliente; 
    private ArrayList <Producto> mProducto = new ArrayList(); 

    public Factura() {
    }

    public double getTotal() {
        for (Producto prod : this.mProducto){
            this.total += prod.getPrecio();
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public Cliente getmCliente() {
        return mCliente;
    }

    public void setmCliente(Cliente mCliente) {
        this.mCliente = mCliente;
    }

    public ArrayList<Producto> getmProducto() {
        return mProducto;
    }

    public void setProducto(Producto producto) {
        mProducto.add(producto);
    }
    
}
