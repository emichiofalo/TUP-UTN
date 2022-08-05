package diagramaclases4;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Boing747 extends Vehiculo {
    
    private static int viajes; 
    
    public void despegar(){
        System.out.println("Despegando...");
    }
    
    public void aterrizar(){
        System.out.println("Aterrizando...");
    }
    
    public static void agregarViaje(){
        Boing747.viajes ++;
    }

    public static int getViajes() {
        return viajes;
    }

    public static void setViajes(int viajes) {
        Boing747.viajes = viajes;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public ArrayList<Rueda> getRuedas() {
        return ruedas;
    }

    public void setRuedas(ArrayList<Rueda> ruedas) {
        this.ruedas = ruedas;
    }
    
    public void esquivarObstaculo(){
        System.out.println("Sobrevolar un obstáculo.");
    }
    
    public void esquivarObstaculo(int metros){
        System.out.println("En " + metros + " metros.");
    }
    
    public void romperInercia(){
        System.out.println("Aumentar velocidad en el vuelo");
    }
    
}
