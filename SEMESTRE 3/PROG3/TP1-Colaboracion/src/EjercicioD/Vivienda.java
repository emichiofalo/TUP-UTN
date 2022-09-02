/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioD;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emi Chiófalo
 */
public class Vivienda {
    
    private long Id; 
    private String calle; 
    private int numeroCalle; 
    private double superficioTerreno;
    private Barrio barrio; 
    private List<Habitacion> habitaciones; 

    public Vivienda() {
    }

    public Vivienda(long Id, String calle, int numeroCalle, double superficioTerreno, Barrio barrio, List<Habitacion> habitaciones) {
        this.Id = Id;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.superficioTerreno = superficioTerreno;
        this.barrio = barrio;
        this.habitaciones = habitaciones;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public double getSuperficioTerreno() {
        return superficioTerreno;
    }

    public void setSuperficioTerreno(double superficioTerreno) {
        this.superficioTerreno = superficioTerreno;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void addHabitacion(Habitacion habitacion) {
        if (this.habitaciones == null) {
            this.habitaciones = new ArrayList();
        }
        this.habitaciones.add(habitacion);
    }
    
    public double getMetrosCuadradosCubiertos() throws Exception{
        double metrosCuadradosCubiertos = 0;
        for (Habitacion hab : this.habitaciones){
            metrosCuadradosCubiertos += hab.getMetrosCuadrados();
        }
        if (metrosCuadradosCubiertos<=this.superficioTerreno) {
            return metrosCuadradosCubiertos;
        }else{
            throw new Exception ("La superficie cubierta no puede ser mayor a la superficie del terreno."); 
        }
    }
    
}
