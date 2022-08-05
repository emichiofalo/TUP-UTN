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
public class Auto extends Vehiculo {
    
    private String patente;

    public Auto(String patente, int cantRuedas, int cantPuertas, String marca, String modelo, int anio) {
        super(cantRuedas, cantPuertas, marca, modelo, anio);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
}
