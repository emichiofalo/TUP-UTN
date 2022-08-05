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
public class Posicion {
    private Mapa mapa;
    private int fila;
    private int columna;

    public Posicion(Mapa mapa, int fila, int columna) {
        this.mapa = mapa;
        this.fila = fila;
        this.columna = columna;
    }
    public Posicion(String str, Mapa mapa) {
        this.mapa = mapa;
        this.fila = 0;
        this.columna = 0;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    public double getPeso(){
        //falta implementar
        return 0.0;
    }
    public boolean esGasolinera(){
        return this.mapa.esPosicionValida(this);
    }
    
    public Posicion gasolineraMasCercana(){
        return this.mapa.gasolineraMasCercana(this);
    }
    
    public Posicion moverPosicion(Direccion direccion){
        //falta implementar
        return this;
    }
    
    public ArrayList<Direccion> direccionesValidas(){
        return this.mapa.direccionesValidas(this);
    }
}
