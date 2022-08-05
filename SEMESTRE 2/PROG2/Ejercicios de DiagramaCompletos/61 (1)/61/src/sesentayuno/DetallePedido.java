package sesentayuno;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class DetallePedido {

    private int cantidad;
    private double precioVenta;
    private boolean estado;
    private Producto producto;
    private Pedido pedido;

    public DetallePedido() {
    }

    public DetallePedido(int cantidad, double precioVenta, boolean estado, Producto producto, Pedido pedido) {
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.estado = estado;
        this.producto = producto;
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "cantidad=" + cantidad + ", precioVenta=" + precioVenta + ", estado=" + estado + "\n"+", producto=" + producto + "\n"+", pedido=" + pedido + '}';
    }        
}
