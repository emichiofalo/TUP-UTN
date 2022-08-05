package ejerciciocinco;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Auto extends Vehiculo{

    private final static int numRuedas = 4;

    public Auto() {
    }

    public Auto(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    public static int getNumRuedas() {
        return numRuedas;
    }        
}
