/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama4;

import java.util.ArrayList;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class Mafioso extends Persona{
    private ArrayList<Lugar> lugaresFrecuentes = new ArrayList<Lugar>();

    public Mafioso() {
        super();
    }
    
    public void agregarLugar(Lugar lugar){
        this.lugaresFrecuentes.add(lugar);
    }
    
    public boolean quitarLugar(Lugar lugar){
        try {
            this.lugaresFrecuentes.remove(lugar);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean investigar(){
        return true;
    }
}
