/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioD;

/**
 *
 * @author Emi Chiófalo
 */
public class Habitacion {
    
    private long Id; 
    private String nombre; 
    private long metrosCuadrados; 
    private Vivienda vivienda; 

    public Habitacion() {
    }

    public Habitacion(long Id, String nombre, long metrosCuadrados, Vivienda vivienda) {
        this.Id = Id;
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.vivienda = vivienda;
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

    public long getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(long metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }
    
    
}
