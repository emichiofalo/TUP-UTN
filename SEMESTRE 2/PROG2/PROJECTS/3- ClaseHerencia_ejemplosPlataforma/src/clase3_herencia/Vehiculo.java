/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3_herencia;

/**
 *
 * @author Martin Vargas
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    protected int cantRuedas;

    public Vehiculo(String marca, String modelo, int cantRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantRuedas = cantRuedas;
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
    
    
    
    
    
}
