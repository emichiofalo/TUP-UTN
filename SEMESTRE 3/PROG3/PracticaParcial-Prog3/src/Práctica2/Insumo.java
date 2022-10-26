/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Práctica2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author Emi Chiófalo
 */
@Entity
public class Insumo implements Serializable {
    
    private int idInsumo; 
    private String denominacion; 
    private double precioCosto; 
    private int stockActual; 
    private String unidadMedida; 
    private List<ProductoManufacturadoDetalle> detallesProductos;

    public Insumo() {
    }

    public Insumo(int idInsumo, String denominacion, double precioCosto, int stockActual, String unidadMedida, List<ProductoManufacturadoDetalle> detallesProductos) {
        this.idInsumo = idInsumo;
        this.denominacion = denominacion;
        this.precioCosto = precioCosto;
        this.stockActual = stockActual;
        this.unidadMedida = unidadMedida;
        this.detallesProductos = detallesProductos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @OneToMany(mappedBy = "insumo", cascade = CascadeType.ALL)
    public List<ProductoManufacturadoDetalle> getDetallesProductos() {
        return detallesProductos;
    }

    public void setDetallesProductos(List<ProductoManufacturadoDetalle> detallesProductos) {
        this.detallesProductos = detallesProductos;
    }
    
    public void addDetallesProducto(ProductoManufacturadoDetalle detalleProducto) {
        if (this.detallesProductos == null) {
            this.detallesProductos = new ArrayList();
        }
        this.detallesProductos.add(detalleProducto);
    }
    
}
