package ejerciciocinco;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 *
 */
public class Vehiculo implements Desplazable {

    private double velocidadPromedio;
    private int velocidadMaxima;
    
    private ArrayList<Rueda> ruedas = new ArrayList<>();

    public Vehiculo() {
    }

    public Vehiculo(double velocidadPromedio, int velocidadMaxima) {
        this.velocidadPromedio = velocidadPromedio;
        this.velocidadMaxima = velocidadMaxima;
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

    public void addRuedas(Rueda ruedas) {
        this.ruedas.add(ruedas);
    }
            
    @Override
    public void esquivarObstaculo() {
        System.out.println("Si puede esquivar?, que se supone que ponga aca?");
    }

}
