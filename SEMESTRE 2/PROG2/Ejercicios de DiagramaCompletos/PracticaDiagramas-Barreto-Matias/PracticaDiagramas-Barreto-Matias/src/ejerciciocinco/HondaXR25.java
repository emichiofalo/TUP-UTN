package ejerciciocinco;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 * 
 */
public class HondaXR25 extends Moto {

    public HondaXR25() {
    }

    public HondaXR25(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
    }

    public void esquivarObstaculo(int metros) {
        System.out.println("Puede esquivar " + metros + " metros");
    }
}
