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
public class Avion extends Vehiculo {
    
    private int cantTurbinas;

    public Avion(int cantTurbinas, int cantRuedas, int cantPuertas, String marca, String modelo, int anio) {
        super(cantRuedas, cantPuertas, marca, modelo, anio);
        this.cantTurbinas = cantTurbinas;
    }

    public int getCantTurbinas() {
        return cantTurbinas;
    }

    public void setCantTurbinas(int cantTurbinas) {
        this.cantTurbinas = cantTurbinas;
    }
    
}
