package diagramaclases2;

import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class Auto extends Vehiculo implements Motor{

    private int puertas; 

    public Auto(int puertas, int ruedas, String duenio) {
        super(ruedas, duenio);
        this.puertas = puertas;
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

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public String Tipo(){
        return TipoMotorAuto();                
    }
    
    public String TipoMotorAuto(){
        String retorno = "";
        do {
            System.out.println("Selecciones el tipo de motor del auto: N/D");
            System.out.println("N - Naftero");
            System.out.println("D - Diesel");
            String tipo = new Scanner(System.in).nextLine();
            if (tipo.equalsIgnoreCase("N")) {
                return "Tipo de motor: Naftero";
            }if (tipo.equalsIgnoreCase("D")) {
                return "Tipo de motor: Diesel";
            }else{
                System.out.println("Tipo no identificado. Intente nuevamente.");
            }
        } while (true);   
    }   
}
