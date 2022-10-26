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
public class ProductoManufacturado {
    
    private int idProducto; 
    private int tiempoFabricacion; 
    private String denominacion; 
    private double precioVenta; 
    private double margenGanancia; 
    private Rubro rubro; 
    private List<SucursalEmpresa> sucursales; 
    private List<ProductoManufacturadoDetalle> detalles;

    public ProductoManufacturado() {
    }

    public ProductoManufacturado(int idProducto, int tiempoFabricacion, String denominacion, double precioVenta, double margenGanancia, Rubro rubro, List<SucursalEmpresa> sucursales, List<ProductoManufacturadoDetalle> detalles) {
        this.idProducto = idProducto;
        this.tiempoFabricacion = tiempoFabricacion;
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.margenGanancia = margenGanancia;
        this.rubro = rubro;
        this.sucursales = sucursales;
        this.detalles = detalles;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getTiempoFabricacion() {
        return tiempoFabricacion;
    }

    public void setTiempoFabricacion(int tiempoFabricacion) {
        this.tiempoFabricacion = tiempoFabricacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getMargenGanancia() {
        return margenGanancia;
    }

    public void setMargenGanancia(double margenGanancia) {
        this.margenGanancia = margenGanancia;
    }

    @ManyToOne(cascade = CascadeType.ALL)          
    @JoinColumn(name = "idrubro")
    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    @ManyToMany(fetch=FetchType.LAZY,                                           
    targetEntity=SucursalEmpresa.class,                                             
    cascade=CascadeType.ALL)
    @JoinTable(                                                                     
    name="ProductoSucursal",                                                         
    joinColumns=@JoinColumn(name="sucursales"),                                            //nombre del atributo del modelo de objeto de esta clase
    inverseJoinColumns=@JoinColumn(name="productos"))                                     //nombre del atributo del modelo de objeto de la clase con la que se relaciona
    public List<SucursalEmpresa> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<SucursalEmpresa> sucursales) {
        this.sucursales = sucursales;
    }

    public void addSucursal(SucursalEmpresa sucursal) {
        if (this.sucursales == null) {
            this.sucursales = new ArrayList();
        }
        this.sucursales.add(sucursal);
    }
    
    @OneToMany(mappedBy = "prodManuf", cascade = CascadeType.ALL)
    public List<ProductoManufacturadoDetalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<ProductoManufacturadoDetalle> detalles) {
        this.detalles = detalles;
    }
    
    public void addDetalle(ProductoManufacturadoDetalle detalle) {
        if (this.detalles == null) {
            this.detalles = new ArrayList();
        }
        this.detalles.add(detalle);
    }
    
    public void getPrecioVentaCalculado(){
        double costoTotal = 0;
        for(ProductoManufacturadoDetalle p : this.detalles){
            costoTotal += p.getInsumo().getIdInsumo();
        }
        this.setPrecioVenta(costoTotal * (1+this.margenGanancia));
    }
    
}
