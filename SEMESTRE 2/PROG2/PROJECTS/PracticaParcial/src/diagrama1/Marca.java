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
public class Marca {
    
    private String marcaAuto; 
    private Modelo modelo; 

    public Marca() {
    }

    public Marca(String marcaAuto, Modelo modelo) {
        this.marcaAuto = marcaAuto;
        this.modelo = modelo;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Marca{" + "marcaAuto=" + marcaAuto + ", modelo=" + modelo.toString() + '}';
    }
    
    
    
    
}
