/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class Mapa {
    private int numFilas;
    private int numColumnas;
    private int[][] celdas;
    private ArrayList<Posicion> gasolineras;
    
    public Mapa(String fichero){
        System.out.println("Leyendo el archivo..");
        this.numColumnas = 5;
        this.numFilas = 5;
        this.celdas = new int[this.numFilas][this.numColumnas];
    }
    
    public void cargarFichero(String nombreFichero){
        System.out.println("Cargando fichero..");
    }
    
    public boolean esPosicionValida(Posicion posicion){
        return esPosicionValida(posicion.getFila(), posicion.getColumna());
    }
    public boolean esPosicionValida(int fila, int columna){
        if((fila < this.numFilas) && (columna < this.numColumnas)){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean esGasolinera(Posicion posicion){
        return esGasolinera(posicion.getFila(), posicion.getColumna());
    }
    public boolean esGasolinera(int fila, int columna){
        Iterator g = gasolineras.iterator();
        Posicion gasolinera;
        while (g.hasNext()) {
            gasolinera = (Posicion) g.next();
            if(this.esPosicionValida(fila, columna) && gasolinera.getColumna() == columna && gasolinera.getFila() == fila){
                return true;
            }
        }
        return false;
    }
    
    public double obtenerPeso(Posicion posicion){
        return this.obtenerPeso(posicion.getFila(), posicion.getColumna());
    }
    public double obtenerPeso(int fila, int columna){
        //falta implementar
        return 0.0;
    }
    
    public ArrayList<Direccion> direccionesValidas(Posicion posicion){
        //falta implementar
        return new ArrayList<Direccion>();
    }
    
    public Posicion gasolineraMasCercana(Posicion posicion){
        //falta implementar
        return new Posicion(this, numFilas, numColumnas);
    }
    
    public double calcularDistancia(Posicion origen, Posicion destino){
        //falta implementar
        return 0.0;
    }
    
    public void volcar(PrintStream out){
        
    }
    public void volcar(){
        
    }
    
    public void volcarRuta(ArrayList<Posicion> ruta, PrintStream out){
        
    }
    public void volcar(ArrayList<Posicion> ruta){
        
    }
    
}
