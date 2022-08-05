/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramaclases2_120422;

/**
 *
 * @author Emi Chiófalo
 */
public class Recibo extends Comprobante{
    
    private Proveedor proveedor = new Proveedor();                              //porque es composición 
    private double total; 
    private String detalle; 

    public Recibo() {
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}
