/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

/**
 *
 * @author Emi Chiófalo
 */
public class TipoDeInfraccion {
    
    private int id_infrac;
    private String descripInfraccion;
    private String tipoGravedad;
    private double importeAsignadoInfraccion;
    private double porcentajeDescuento;

    public TipoDeInfraccion() {
    }

    public TipoDeInfraccion(int id_infrac, String descripInfraccion, String tipoGravedad, double importeAsignadoInfraccion, double porcentajeDescuento) {
        this.id_infrac = id_infrac;
        this.descripInfraccion = descripInfraccion;
        this.tipoGravedad = tipoGravedad;
        this.importeAsignadoInfraccion = importeAsignadoInfraccion;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getId_infrac() {
        return id_infrac;
    }

    public void setId_infrac(int id_infrac) {
        this.id_infrac = id_infrac;
    }

    public String getDescripInfraccion() {
        return descripInfraccion;
    }

    public void setDescripInfraccion(String descripInfraccion) {
        this.descripInfraccion = descripInfraccion;
    }

    public String getTipoGravedad() {
        return tipoGravedad;
    }

    public void setTipoGravedad(String tipoGravedad) {
        this.tipoGravedad = tipoGravedad;
    }

    public double getImporteAsignadoInfraccion() {
        return importeAsignadoInfraccion;
    }

    public void setImporteAsignadoInfraccion(double importeAsignadoInfraccion) {
        this.importeAsignadoInfraccion = importeAsignadoInfraccion;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "TipoDeInfraccion{" + "id_infrac=" + id_infrac + ", descripInfraccion=" + descripInfraccion + ", tipoGravedad=" + tipoGravedad + ", importeAsignadoInfraccion=" + importeAsignadoInfraccion + ", porcentajeDescuento=" + porcentajeDescuento + '}';
    }

    
        
}
