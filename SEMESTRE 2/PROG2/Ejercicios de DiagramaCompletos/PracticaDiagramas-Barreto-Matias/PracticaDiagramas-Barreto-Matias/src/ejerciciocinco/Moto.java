package ejerciciocinco;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 * 
 */
public class Moto extends Vehiculo {

    private final static int numRuedas = 2;

    public Moto() {
    }

    public Moto(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    public static int getNumRuedas() {
        return numRuedas;
    }
}
