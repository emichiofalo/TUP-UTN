package diagramaclases6;

import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class Cama {

    private Paciente paciente = new Paciente();
    
    public Paciente getPaciente(){
        if (paciente == null) {
            System.out.println("Cama vacía");
            return null;
        }else{
            return paciente;
        }
    }
    
    public boolean setPaciente(Paciente paciente){
        this.paciente = paciente;
        return true;
    }
    
    
    public boolean isOcupada(){
        System.out.println("Está ocupada la cama? S/N");
        String ocupada = new Scanner(System.in).nextLine();
        if (ocupada.equalsIgnoreCase("s")){
            return true;
        }else{
            return false;
        }       
    }
    
}
