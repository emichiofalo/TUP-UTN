/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Conexion.ConexionComponente;
import java.sql.SQLException;

/**
 *
 * @author Emi Chiófalo
 */
public class Componente {
    
   private long Id; 
   private String nombre; 
   private String nroSerie; 
   private Computadora computadora; 
   private ConexionComponente conectComp = new ConexionComponente();

    public Componente() {
    }

    public Componente(long Id, String nombre, String nroSerie, Computadora computadora) {
        this.Id = Id;
        this.nombre = nombre;
        this.nroSerie = nroSerie;
        this.computadora = computadora;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
    public boolean createComponente(Componente componente) throws SQLException {
        return conectComp.create(componente);
    }
    
}
