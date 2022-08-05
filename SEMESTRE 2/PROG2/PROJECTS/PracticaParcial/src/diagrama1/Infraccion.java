/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Infraccion {

    private String descripInfraccion;
    private double importeInfraccion; 
    private ArrayList<TipoDeInfraccion> infraccionNomenclada = new ArrayList();

    public Infraccion() {
    }

    public Infraccion(String descripInfraccion, double importeInfraccion) {
        this.descripInfraccion = descripInfraccion;
        this.importeInfraccion = importeInfraccion;
    }
    
    public Infraccion(String descripInfraccion, double importeInfraccion, TipoDeInfraccion tipoInfraccion) {
        this.descripInfraccion = descripInfraccion;
        this.importeInfraccion = importeInfraccion;
        addInfraccionNomenclada(tipoInfraccion);
    }

    public String getDescripInfraccion() {
        return descripInfraccion;
    }

    public void setDescripInfraccion(String descripInfraccion) {
        this.descripInfraccion = descripInfraccion;
    }

    public double getImporteInfraccion() {
        return importeInfraccion;
    }

    public void setImporteInfraccion(double importeInfraccion) {
        this.importeInfraccion = importeInfraccion;
    }

    public ArrayList<TipoDeInfraccion> getInfraccionNomenclada() {
        return infraccionNomenclada;
    }

    public void setInfraccionNomenclada(ArrayList<TipoDeInfraccion> infraccionNomenclada) {
        this.infraccionNomenclada = infraccionNomenclada;
    }
    
    public void addInfraccionNomenclada(TipoDeInfraccion infraccionNomenclada) {
        this.infraccionNomenclada.add(infraccionNomenclada);
    }

    @Override
    public String toString() {
        return "Infraccion{" + "descripInfraccion=" + descripInfraccion + ", importeInfraccion=" + importeInfraccion + ", infraccionNomenclada=" + infraccionNomenclada.get(0).toString() + '}';
    }
    
}
