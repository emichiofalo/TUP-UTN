package ejerciciocuatro;

/**
 *
 * @author Matias Barreto 
 * Legajo: 49215 
 * mail: barretomatias93@gmail.com
 * 
 */
public abstract class Vehiculo {

    private int ruedas;
    private String duenio;

    public Vehiculo() {
    }

    public Vehiculo(int ruedas, String duenio) {
        this.ruedas = ruedas;
        this.duenio = duenio;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    public double precio(double precio){
        return precio;
    };
    
    public double Velocidad_Maxima(double velocidad){
        return velocidad;
    }
}
