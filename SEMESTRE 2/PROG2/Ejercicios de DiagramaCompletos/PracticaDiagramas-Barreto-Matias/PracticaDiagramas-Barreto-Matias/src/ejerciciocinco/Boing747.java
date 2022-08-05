package ejerciciocinco;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Boing747 extends Vehiculo{

    private static int viajes = 0;

    public Boing747() {
    }

    public Boing747(double velocidadPromedio, int velocidadMaxima) {
        super(velocidadPromedio, velocidadMaxima);
        viajes++;
    }

    public int getViajes() {
        return viajes;
    }

    public void setViajes(int viajes) {
        this.viajes = viajes;
    }
    
    public void despegar(){
        System.out.println("Despegando...");
    }
    
    public void aterrizar(){
        System.out.println("Aterrizando...");
    }
    
    public void agregarViaje(){
        viajes++;
    }
}
