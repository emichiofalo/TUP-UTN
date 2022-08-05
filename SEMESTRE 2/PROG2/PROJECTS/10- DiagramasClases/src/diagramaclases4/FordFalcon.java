package diagramaclases4;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class FordFalcon extends Auto {

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
    
    public void romperInercia(){
        System.out.println("Acelerar en la autopista");
    }
    
    public void esquivarObstaculo(){
        System.out.println("Frenar ante un obstáculo.");
    }
}
