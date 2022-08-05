package diagramaclases3;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Mafioso extends Persona {
    
    private ArrayList<Lugar> lugaresFrecuentes = new ArrayList();

    public ArrayList<Lugar> getLugaresFrecuentes() {
        return lugaresFrecuentes;
    }

    public void setLugaresFrecuentes(ArrayList<Lugar> lugaresFrecuentes) {
        this.lugaresFrecuentes = lugaresFrecuentes;
    }
    
    public void agregarLugar(Lugar lugar){
        lugaresFrecuentes.add(lugar);
    }
    
    public boolean quitarLugar(Lugar lugar){
        try {
            lugaresFrecuentes.remove(lugar);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public boolean investigar(){
        return true;
    }
    
}
