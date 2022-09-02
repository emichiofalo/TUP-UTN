/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.parteb;

/**
 *
 * @author Emi Chiófalo
 */
public class Domicilio {
    
    private int idDomicilio; 
    private String localidad; 
    private String calle; 
    private int numero; 
    private Persona persona; 

    public Domicilio() {
    }

    public Domicilio(int idDomicilio, String localidad, String calle, int numero, Persona persona) {
        this.idDomicilio = idDomicilio;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
        this.persona = persona;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
}
