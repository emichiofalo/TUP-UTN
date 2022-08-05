/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseherencia_220322;

/**
 *
 * @author sebastiansulia
 */
public class Vehiculo {
    protected int cantRuedas;
    protected int cantPuertas;
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(int cantRuedas, int cantPuertas, String marca, String modelo, int anio) {
        this.cantRuedas = cantRuedas;
        this.cantPuertas = cantPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
}