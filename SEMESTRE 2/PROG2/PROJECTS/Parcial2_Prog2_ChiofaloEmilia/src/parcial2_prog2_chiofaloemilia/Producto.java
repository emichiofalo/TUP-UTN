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
public class Producto {
    
    private int numeroProducto;
    private String marca; 
    private double precio; 
    private int stock; 
    private DetallePedido detallePedido; 

    public Producto() {
    }

    public Producto(int numeroProducto, String marca, double precio, int stock) {
        this.numeroProducto = numeroProducto;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }
    
    public Producto(int numeroProducto, String marca, double precio, int stock, DetallePedido detallePedido) {
        this.numeroProducto = numeroProducto;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.detallePedido = detallePedido;
    }

    

    public int getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public DetallePedido getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(DetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }

    
    
    
}
