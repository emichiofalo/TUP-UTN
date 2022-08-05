/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Invitado
 */
public class Animal {
    private boolean Cola;
    private boolean Macho;
    private int cantidad_crias;
    private String distribucion_geografica;
    private double peso;

    public Animal(boolean Cola, boolean Macho, int cantidad_crias, String distribucion_geografica, double peso) {
        this.Cola = Cola;
        this.Macho = Macho;
        this.cantidad_crias = cantidad_crias;
        this.distribucion_geografica = distribucion_geografica;
        this.peso = peso;
        
    }

//    public Animal() {
//    } no es necesario

    public boolean isCola() {
        return Cola;
    }

    public void setCola(boolean Cola) {
        this.Cola = Cola;
    }

    public boolean isMacho() {
        return Macho;
    }

    public void setMacho(boolean Macho) {
        this.Macho = Macho;
    }

    public int getCantidad_crias() {
        return cantidad_crias;
    }

    public void setCantidad_crias(int cantidad_crias) {
        this.cantidad_crias = cantidad_crias;
    }

    public String getDistribucion_geografica() {
        return distribucion_geografica;
    }

    public void setDistribucion_geografica(String distribucion_geografica) {
        this.distribucion_geografica = distribucion_geografica;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
