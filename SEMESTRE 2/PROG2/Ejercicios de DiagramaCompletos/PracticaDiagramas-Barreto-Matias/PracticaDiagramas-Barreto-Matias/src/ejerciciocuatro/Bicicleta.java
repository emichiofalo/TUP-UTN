package ejerciciocuatro;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Bicicleta extends Vehiculo {

    public Bicicleta(int ruedas, String duenio) {
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
}
