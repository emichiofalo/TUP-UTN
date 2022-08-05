package diagramaclases4;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public abstract class Moto extends Vehiculo {

    public static final int NRUEDAS = 2; 

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
    
    public void agregarRuedas (){
        for (int i = 0; i < this.NRUEDAS; i++) {
            super.agregarUnaRueda(new Rueda());
        }
    }
    
    public abstract void romperInercia();
    
    public abstract void esquivarObstaculo();
    
}
