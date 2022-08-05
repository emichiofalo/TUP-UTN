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
public class Bicicleta extends Vehiculo{

    public Bicicleta(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public double Precio() {
        return 5000.0;
    }

    @Override
    public double Velocidad_Maxima() {
        return 25.0f;
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
    public void mostrarDatos() {
        System.out.println("Datos de la bicicleta:");
        System.out.println("\tDueño: " + this.duenio);
        System.out.println("\tPrecio: $" + this.Precio());
        System.out.println("\tVel. máx.: " + this.Velocidad_Maxima());
        System.out.println("\tCant. ruedas: " + this.getRuedas());
        System.out.println("");
    }
    
}
