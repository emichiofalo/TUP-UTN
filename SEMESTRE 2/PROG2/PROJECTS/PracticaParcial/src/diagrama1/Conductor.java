/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

/**
 *
 * @author Emi Chiófalo
 */
public class Conductor extends Persona {
    
    private String domicilio; 

    public Conductor() {
    }

    public Conductor(String domicilio) {
        this.domicilio = domicilio;
    }

    public Conductor(String domicilio, String nombre, String apellido, int dni, String genero) {
        super(nombre, apellido, dni, genero);
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Conductor{" + "\n" + 
                "nombre=" + this.nombre + " apellido=" + this.apellido + "\n" +
                "dni=" + this.dni + " genero=" + this.genero + "\n" +
                "domicilio=" + domicilio + '}';
    }

   
    
    
}
