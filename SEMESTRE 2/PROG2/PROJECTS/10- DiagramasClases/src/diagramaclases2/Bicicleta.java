package diagramaclases2;

import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class Bicicleta extends Vehiculo{

    public Bicicleta(int ruedas, String duenio) {
        super(ruedas, duenio);
    }
    
    public double Precio(){
        return LeerPrecio();                     
    }
    
    public double Velocidad_Maxima(){
        return LeerVelocidadMaxima();                     
    }
    
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    
}
