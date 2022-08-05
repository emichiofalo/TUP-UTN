package ejerciciocuatro;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 */
public class Moto extends Vehiculo implements Motor {

    public Moto(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    @Override
    public double precio(double precio) {
        return precio;
    }

    @Override
    public double Velocidad_Maxima(double velocidad) {
        return velocidad;
    }

    @Override
    public String tipo(String tipo) {
        return tipo;
    }
}
