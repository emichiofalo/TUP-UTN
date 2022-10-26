/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Práctica2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author Emi Chiófalo
 */
@Entity
public class SucursalEmpresa {
    
    private int idSucursal; 
    private String razonSocial; 
    private String cuit; 
    private long telefono; 
    private String email; 
    private List<ProductoManufacturado> productos; 

    public SucursalEmpresa() {
    }

    public SucursalEmpresa(int idSucursal, String razonSocial, String cuit, long telefono, String email, List<ProductoManufacturado> productos) {
        this.idSucursal = idSucursal;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.telefono = telefono;
        this.email = email;
        this.productos = productos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @ManyToMany(                                                                 
    cascade = {CascadeType.PERSIST, CascadeType.MERGE},
    mappedBy = "sucursales",                                                     
    targetEntity = ProductoManufacturado.class)                                  
    public List<ProductoManufacturado> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoManufacturado> productos) {
        this.productos = productos;
    }
    
    public void addProducto(ProductoManufacturado producto) {
        if (this.productos == null) {
            this.productos = new ArrayList();
        }
        this.productos.add(producto);
    }
    
    public List<ProductoManufacturado> getProductosXTiempoFabricacion (int tiempoMaximo){
        List<ProductoManufacturado> prodsTempMax = new ArrayList();
        for(ProductoManufacturado p : this.productos){
            if (p.getTiempoFabricacion() <= tiempoMaximo) {
                prodsTempMax.add(p);
            }
        }
        return prodsTempMax;
    }
}
