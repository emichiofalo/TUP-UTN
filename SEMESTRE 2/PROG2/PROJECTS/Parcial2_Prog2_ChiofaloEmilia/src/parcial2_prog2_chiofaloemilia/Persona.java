/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2_prog2_chiofaloemilia;

/**
 *
 * @author Emi Chiófalo
 */
public abstract class Persona {
    
    protected int Personadni; 
    protected String nombrePersona; 
    protected String apellidoPersona; 

    public Persona() {
    }

    public Persona(int Personadni, String nombrePersona, String apellidoPersona) {
        this.Personadni = Personadni;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }
    
}   
