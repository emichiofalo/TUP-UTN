/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama5;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class Moto extends Vehiculo implements Motor{

    public Moto(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public double Precio() {
        return Float.MAX_VALUE;
    }

    @Override
    public double Velocidad_Maxima() {
        return 100;
    }

    @Override
    public int getRuedas() {
        return this.ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String Tipo() {
        return "Tipo de moto";
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Datos de la moto:");
        System.out.println("\tDueño: " + this.duenio);
        System.out.println("\tPrecio: $" + this.Precio());
        System.out.println("\tVel. máx.: " + this.Velocidad_Maxima());
        System.out.println("\tTipo motor: " + this.Tipo());
        System.out.println("");
    }
    
}
