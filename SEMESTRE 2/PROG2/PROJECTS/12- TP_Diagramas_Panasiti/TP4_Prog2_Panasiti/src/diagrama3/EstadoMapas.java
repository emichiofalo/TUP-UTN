/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama3;

import java.util.ArrayList;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class EstadoMapas implements Estado{
    //Atributos de clase
    public static final double FACTOR_CONSUMO = 0;
    public static final double FACTOR_DIAGONAL = 0;
    //Atributos de objeto
    private Posicion posicion;
    private double gasolina;
    private double capacidad;
    private Posicion posicionFinal;

    public EstadoMapas(Posicion posicion, double gasolina, double capacidad, Posicion posicionFinal) {
        this.posicion = posicion;
        this.gasolina = gasolina;
        this.capacidad = capacidad;
        this.posicionFinal = posicionFinal;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public ArrayList<Operador> operadoresAplicables() {
        return new ArrayList<Operador>(); //falta implementar
    }

    @Override
    public boolean esFinal() {
        return false; //falta implementar
    }

    @Override
    public Estado aplicarOperador(Operador o) {
        return this; //falta implementar
    }

    @Override
    public boolean equals(Estado e) {
        return false; //falta implementar
    }
    
}
