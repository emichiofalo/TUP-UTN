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
public class Ruta {

    private String nombreRuta; 
    private String kmRuta; 
    private TipoRuta tipoRuta;

    public Ruta() {
    }

    public Ruta(String nombreRuta, String kmRuta, TipoRuta tipoRuta) {
        this.nombreRuta = nombreRuta;
        this.kmRuta = kmRuta;
        this.tipoRuta = tipoRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public String getKmRuta() {
        return kmRuta;
    }

    public void setKmRuta(String kmRuta) {
        this.kmRuta = kmRuta;
    }

    public TipoRuta getTipoRuta() {
        return tipoRuta;
    }

    public void setTipoRuta(TipoRuta tipoRuta) {
        this.tipoRuta = tipoRuta;
    }
    
    public boolean esRutaInternacional(){
        return true;
    }
    
    public boolean esRutaNacional(){
        return false;
    }
    
    public boolean esRutaProvincial(){
        return false; 
    }

    @Override
    public String toString() {
        return "Ruta{" + "nombreRuta=" + nombreRuta + ", kmRuta=" + kmRuta + ", tipoRuta=" + tipoRuta.toString() + '}';
    }
    
    
    
}
