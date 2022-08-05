package diagramaclases2;

import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public abstract class Vehiculo {
    protected int ruedas; 
    protected String duenio; 

    public Vehiculo(int ruedas, String duenio) {
        this.ruedas = ruedas;
        this.duenio = duenio;
    }
    
    public abstract double Precio();
    public abstract double Velocidad_Maxima();

    public abstract int getRuedas();

    public abstract void setRuedas(int ruedas);

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    public double LeerPrecio(){
        System.out.println("Ingrese el precio del vehículo:");
        double precio = new Scanner(System.in).nextDouble();
        return precio;
    }
    
    public double LeerVelocidadMaxima(){
        System.out.println("Ingrese la velocidad maxima del vehículo:");
        double velocidad = new Scanner(System.in).nextDouble();
        return velocidad;
    }
}
