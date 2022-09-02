/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioC;

import EjercicioA.Expediente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class Sector {
    
    private int numero; 
    private String denominacion; 
    private String tipo; 
    private List<Persona> personas; 
    private Sector sector; 
    private List<Sector> sectores; 

    public Sector() {
    }

    public Sector(int numero, String denominacion, String tipo, List<Persona> personas, Sector sector, List<Sector> sectores) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.tipo = tipo;
        this.personas = personas;
        this.sector = sector;
        this.sectores = sectores;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void addPersona(Persona persona) {
        if (this.personas == null) {
            this.personas = new ArrayList();
        }
        this.personas.add(persona);
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public List<Sector> getSectores() {
        ArrayList<Expediente> lista = new ArrayList();
        obtenerTotalSubsectores(this,lista);
        return sectores;
    }

    public void addSector(Sector sector) {
        if (this.sectores == null) {
            this.sectores = new ArrayList();
        }
        this.sectores.add(sector);
    }
    
    public List<Sector> obtenerTotalSubsectores(Sector sectorPadre, List lista){
        lista.add(sectorPadre);
        if (sectorPadre.getSectores() != null) {
            for (Sector sect : sectorPadre.getSectores()){
                obtenerTotalSubsectores(sect, lista);
            }
        }
        return lista; 
    }
    
}
