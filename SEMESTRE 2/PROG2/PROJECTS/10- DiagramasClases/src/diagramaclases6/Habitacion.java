package diagramaclases6;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Habitacion {

    private static int siguienteNumero = 1;
    private int numero; 
    private ArrayList<Cama> camas = new ArrayList();

    public int getNumero() {
        return numero;
    }
    
    public int NumCamas(){
        return camas.size();
    }
    
    public void addCama(int n){
        //System.out.println("Cantidad de camas agregadas a la habitacion: " + n);
        for (int i = 0; i < n; i++) {
            camas.add(new Cama());
        }
    }
    
    public Cama getCama(int numero){
        return camas.get(numero-1);
    }
    
    public boolean ingresaPaciente(Paciente paciente){
        boolean retorno = false;
        for (Cama cama : camas){
            if (cama.setPaciente(paciente)) {
                retorno = true;
            }else{
                System.out.println("No hay camas disponibles.");
                retorno = false; 
            }
        }
        return retorno; 
    }
    
    public int getNumeroCamaPaciente(Paciente paciente){
        int numCama = 0;
        for(Cama cama : camas){
            if (cama.getPaciente().equals(paciente)) {
                numCama = camas.indexOf(cama);
            }
        }
        return numCama; 
    }
    
    public void quitarPaciente(Paciente paciente){
        for(Cama cama : camas){
            if (cama.getPaciente().equals(paciente)) {
                cama.setPaciente(null);
            }
        }
    }

    public ArrayList<Cama> getCamas() {
        return camas;
    }
   
}
