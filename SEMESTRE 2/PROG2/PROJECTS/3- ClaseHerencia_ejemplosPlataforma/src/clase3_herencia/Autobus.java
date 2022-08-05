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
public class Autobus extends Vehiculo {
    private int num_pasajeros;
    private double costo_pasajes;
    private String[] paradas;

    public Autobus(int num_pasajeros, double costo_pasajes, String[] paradas, String marca, String modelo, int cantRuedas) {
        super(marca, modelo, cantRuedas);
        this.num_pasajeros = num_pasajeros;
        this.costo_pasajes = costo_pasajes;
        this.paradas = paradas;
    }

    public int getNum_pasajeros() {
        return num_pasajeros;
    }

    public void setNum_pasajeros(int num_pasajeros) {
        this.num_pasajeros = num_pasajeros;
    }

    public double getCosto_pasajes() {
        return costo_pasajes;
    }

    public void setCosto_pasajes(double costo_pasajes) {
        this.costo_pasajes = costo_pasajes;
    }

    public String[] getParadas() {
        return paradas;
    }

    public void setParadas(String[] paradas) {
        this.paradas = paradas;
    }


    
    
    
}
