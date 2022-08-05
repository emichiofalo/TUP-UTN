package diagramaclases4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public abstract class Vehiculo implements Desplazable{

    protected double velocidadPromedio; 
    protected int velocidadMaxima; 
    protected ArrayList<Rueda> ruedas = new ArrayList();
    
    public abstract void romperInercia();
    
    public abstract void esquivarObstaculo();                                            

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = leerVelocidadPromedio();
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = leerVelocidadMaxima();
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }
    
    public int getCantRuedas(){
        return ruedas.size();
    }

    public void addRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }
    
    public void agregarUnaRueda(Rueda rueda){
        this.ruedas.add(rueda);
    }
    
    public double leerVelocidadPromedio(){
        System.out.println("Ingrese la velocidad promedio del vehiculo:");
        double velocidadProm = new Scanner(System.in).nextDouble();
        return velocidadProm;
    }
    
    public int leerVelocidadMaxima(){
        System.out.println("Ingrese la velocidad maxima del vehiculo:");
        int velocidadMax = new Scanner(System.in).nextInt();
        return velocidadMax;
    }
    
}
