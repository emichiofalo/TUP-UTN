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
public class Camion extends Vehiculo {
    private double cap_carga;
    private boolean mat_peligroso;
    private double costo_total_seguro;
    private String inicio_recorrido;
    private String final_recorrido;

    public Camion(double cap_carga, boolean mat_peligroso, double costo_total_seguro, String inicio_recorrido, String final_recorrido, String marca, String modelo, int cantRuedas) {
        super(marca, modelo, cantRuedas);
        this.cap_carga = cap_carga;
        this.mat_peligroso = mat_peligroso;
        this.costo_total_seguro = costo_total_seguro;
        this.inicio_recorrido = inicio_recorrido;
        this.final_recorrido = final_recorrido;
    }

    public Camion() {
    }

    public double getCap_carga() {
        return cap_carga;
    }

    public void setCap_carga(double cap_carga) {
        this.cap_carga = cap_carga;
    }

    public boolean isMat_peligroso() {
        return mat_peligroso;
    }

    public void setMat_peligroso(boolean mat_peligroso) {
        this.mat_peligroso = mat_peligroso;
    }

    public double getCosto_total_seguro() {
        return costo_total_seguro;
    }

    public void setCosto_total_seguro(double costo_total_seguro) {
        this.costo_total_seguro = costo_total_seguro;
    }

    public String getInicio_recorrido() {
        return inicio_recorrido;
    }

    public void setInicio_recorrido(String inicio_recorrido) {
        this.inicio_recorrido = inicio_recorrido;
    }

    public String getFinal_recorrido() {
        return final_recorrido;
    }

    public void setFinal_recorrido(String final_recorrido) {
        this.final_recorrido = final_recorrido;
    }
   

}
