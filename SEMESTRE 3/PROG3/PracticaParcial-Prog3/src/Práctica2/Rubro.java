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
public class Rubro {

    private int idRubro; 
    private String denominacion; 
    private Rubro rubro; 
    private List<Rubro> rubros; 
    private List<ProductoManufacturado> productos; 

    public Rubro() {
    }

    public Rubro(int idRubro, String denominacion, Rubro rubro, List<Rubro> rubros, List<ProductoManufacturado> productos) {
        this.idRubro = idRubro;
        this.denominacion = denominacion;
        this.rubro = rubro;
        this.rubros = rubros;
        this.productos = productos;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdRubro() {
        return idRubro;
    }

    public void setIdRubro(int idRubro) {
        this.idRubro = idRubro;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @ManyToOne(cascade = CascadeType.ALL)                                           
    @JoinColumn(name = "idRubroPadre")
    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    @OneToMany(mappedBy = "rubro", cascade = CascadeType.ALL)
    public List<Rubro> getRubros() {
        return rubros;
    }

    public void setRubros(List<Rubro> rubros) {
        this.rubros = rubros;
    }
    
    public void addRubro(Rubro rubro) {
        if (this.rubros == null) {
            this.rubros = new ArrayList();
        }
        this.rubros.add(rubro);
    }

    @OneToMany(mappedBy = "rubro", cascade = CascadeType.ALL)
    public List<ProductoManufacturado> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoManufacturado> productos) {
        this.productos = productos;
    }
    
    public List<ProductoManufacturado> getProductosXRubro(){
        List<ProductoManufacturado> listaprods = new ArrayList<>();
        recursionProdManufac(this, listaprods);
        return listaprods;
    }
    
    private void recursionProdManufac(Rubro rubro, List<ProductoManufacturado> listaprods) {
        for(ProductoManufacturado p : rubro.getProductos()){
            listaprods.add(p);
        }
        if(rubro.getRubros()!= null){
            for(Rubro rubroHijo : rubro.getRubros()){
                recursionProdManufac(rubroHijo, listaprods);
            }
        }
    }
    
    public ProductoManufacturado getProductoMayorPrecio(){
        List<ProductoManufacturado> prods = getProductosXRubro();
        ProductoManufacturado prodPrecioMax = new ProductoManufacturado(); 
        for(ProductoManufacturado p : prods){
            p.getPrecioVentaCalculado();
            if (p.getPrecioVenta()>prodPrecioMax.getPrecioVenta()) {
                prodPrecioMax = p;
            }
        }
        return prodPrecioMax; 
    }
}
