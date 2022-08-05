package diagramaclases4;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class HondaXR25 extends Moto {
    
    public void esquivarObstaculo(int metros){
        System.out.println("En " + metros + " metros esquivar obstaculo.");
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
    
    public void romperInercia(){
        System.out.println("Acelerar en la ruta");
    }
    
    public void esquivarObstaculo(){
        System.out.println("Saltar un obstáculo.");
    }
    
}
