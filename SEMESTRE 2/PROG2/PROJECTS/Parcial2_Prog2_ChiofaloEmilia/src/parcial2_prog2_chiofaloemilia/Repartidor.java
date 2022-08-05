/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2_prog2_chiofaloemilia;

import java.util.ArrayList;

/**
 *
 * @author Emi Chiófalo
 */
public class Repartidor extends Persona{
    
    private int numeroRepartidor; 
    private ArrayList<Delivery> deliverys = new ArrayList(); 

    public Repartidor() {
    }

    public Repartidor(int numeroRepartidor) {
        this.numeroRepartidor = numeroRepartidor;
    }

    public Repartidor(int numeroRepartidor, int Personadni, String nombrePersona, String apellidoPersona) {
        super(Personadni, nombrePersona, apellidoPersona);
        this.numeroRepartidor = numeroRepartidor;
    }

    public int getNumeroRepartidor() {
        return numeroRepartidor;
    }

    public void setNumeroRepartidor(int numeroRepartidor) {
        this.numeroRepartidor = numeroRepartidor;
    }

    public ArrayList<Delivery> getDeliverys() {
        return deliverys;
    }

    public void setDeliverys(ArrayList<Delivery> deliverys) {
        this.deliverys = deliverys;
    }

    public void addDeliverys(Delivery delivery) {
        this.deliverys.add(delivery);
    }
   
}
