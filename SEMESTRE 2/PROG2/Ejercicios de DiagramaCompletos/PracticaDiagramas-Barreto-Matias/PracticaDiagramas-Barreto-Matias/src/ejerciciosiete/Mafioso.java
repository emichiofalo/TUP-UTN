package ejerciciosiete;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Mafioso extends Persona implements Investigable{
    
    private ArrayList<Lugar> lugaresFrecuentes = new ArrayList<>();

    public Mafioso() {
    }

    public Mafioso(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public ArrayList<Lugar> getLugaresFrecuentes() {
        return lugaresFrecuentes;
    }

    public void addLugaresFrecuentes(Lugar lugaresFrecuentes) {
        this.lugaresFrecuentes.add(lugaresFrecuentes);
    }
            
    @Override
    public boolean investigar() {
        return true;
    }        
}
