/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama3;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class OperadorMapaMovimiento extends OperadorMapa{
    private Direccion direccion;
    private double coste;

    public OperadorMapaMovimiento(Direccion direccion, double coste) {
        this.direccion = direccion;
        this.coste = coste;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
    
    @Override
    public String getEtiqueta(){
        return "Etiqueta de OperadorMapaMovimiento";
    }
}
