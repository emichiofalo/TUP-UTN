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
public class Auto extends Vehiculo implements Motor {

    private int puertas;
    
    public Auto(int puertas, int ruedas, String duenio) {
        super(ruedas, duenio);
        this.puertas = puertas;
    }

    @Override
    public double Precio() {
        return 800000.0;
    }

    @Override
    public double Velocidad_Maxima() {
        return 220.0;
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
        return "Tipo de auto";
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Datos del auto:");
        System.out.println("\tDueño: " + this.duenio);
        System.out.println("\tPrecio: $" + this.Precio());
        System.out.println("\tVel. máx.: " + this.Velocidad_Maxima());
        System.out.println("\tTipo motor: " + this.Tipo());
        System.out.println("\tCant. puertas: " + this.puertas);
        System.out.println("");
    }
    
}
