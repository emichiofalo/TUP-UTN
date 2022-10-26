/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Práctica2;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Emi Chiófalo
 */
@Entity
public class ProductoManufacturadoDetalle implements Serializable {
    
    private int idDetalleProducto;
    private int cantidad; 
    private ProductoManufacturado prodManuf; 
    private Insumo insumo; 

    public ProductoManufacturadoDetalle() {
    }

    public ProductoManufacturadoDetalle(int idDetalleProducto, int cantidad, ProductoManufacturado prodManuf, Insumo insumo) {
        this.idDetalleProducto = idDetalleProducto;
        this.cantidad = cantidad;
        this.prodManuf = prodManuf;
        this.insumo = insumo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdDetalleProducto() {
        return idDetalleProducto;
    }

    public void setIdDetalleProducto(int idDetalleProducto) {
        this.idDetalleProducto = idDetalleProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @ManyToOne(cascade = CascadeType.ALL)          
    @JoinColumn(name = "idprodManuf")
    public ProductoManufacturado getProdManuf() {
        return prodManuf;
    }

    public void setProdManuf(ProductoManufacturado prodManuf) {
        this.prodManuf = prodManuf;
    }

    @ManyToOne(cascade = CascadeType.ALL)          
    @JoinColumn(name = "idInsumo")
    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
    
}
