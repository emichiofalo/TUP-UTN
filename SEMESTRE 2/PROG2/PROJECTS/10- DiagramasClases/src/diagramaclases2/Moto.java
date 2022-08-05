package diagramaclases2;

import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class Moto extends Vehiculo implements Motor {
    
    public Moto (int ruedas, String duenio) {
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
    
    public String Tipo(){
        return TipoMotorMoto();                   
    }
    
    public String TipoMotorMoto() {
        String retorno = "";
        do {
            System.out.println("Selecciones el tipo de motor del auto: 1/2");
            System.out.println("1 - 150");
            System.out.println("2 - 350");
            String tipo = new Scanner(System.in).nextLine();
            if (tipo.equalsIgnoreCase("1")) {
                return "Tipo de motor: 150";
            }
            if (tipo.equalsIgnoreCase("2")) {
                return "Tipo de motor: 350";
            } else {
                System.out.println("Tipo no identificado. Intente nuevamente.");
            }
        } while (true);
    }
    
}
