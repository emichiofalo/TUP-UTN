/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2_prog2_chiofaloemilia;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class DetallePedido {

    private int cantidad; 
    private double precioVenta; 
    private ArrayList<Producto> productos = new ArrayList(); 
    private ArrayList<Pedido> pedido = new ArrayList();

    public DetallePedido() {
    }

    public DetallePedido(int cantidad, double precioVenta) {
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }
    
    public DetallePedido(int cantidad, double precioVenta, ArrayList<Producto> productos, ArrayList<Pedido> pedido) {
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.productos = productos;
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void addProductos(Producto producto) {
        this.productos.add(producto);
    }
    
    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }

    public void addPedido(Pedido pedido) {
        this.pedido.add(pedido);
    }
    
}
