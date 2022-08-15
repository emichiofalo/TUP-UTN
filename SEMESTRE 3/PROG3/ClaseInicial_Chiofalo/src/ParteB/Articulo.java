/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class Articulo {
    
    private int codigo; 
    private String denominacion; 
    private double precio; 
    private String unidadMedida; 
    private List <DetalleFactura> detalleFactura;
    
    public Articulo(int codigo, String denominacion, double precio, String unidadMedida, List<DetalleFactura> detalleFactura) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
        this.detalleFactura = detalleFactura;
    }

    public Articulo() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public List<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    public void addDetalleFactura(DetalleFactura detalleFactura) {
        if (this.detalleFactura == null) {
            this.detalleFactura = new ArrayList(); 
        }
        this.detalleFactura.add(detalleFactura);
    }
        
}
