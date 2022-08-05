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
public class TipoRuta {
    
    private String descTipoRuta; 
    private String nombreRipoDeRuta; 

    public TipoRuta() {
    }

    public TipoRuta(String descTipoRuta, String nombreRipoDeRuta) {
        this.descTipoRuta = descTipoRuta;
        this.nombreRipoDeRuta = nombreRipoDeRuta;
    }

    public String getDescTipoRuta() {
        return descTipoRuta;
    }

    public void setDescTipoRuta(String descTipoRuta) {
        this.descTipoRuta = descTipoRuta;
    }

    public String getNombreRipoDeRuta() {
        return nombreRipoDeRuta;
    }

    public void setNombreRipoDeRuta(String nombreRipoDeRuta) {
        this.nombreRipoDeRuta = nombreRipoDeRuta;
    }
    
    public boolean esInternacional(){
        return true;
    }
    
    public boolean esNacional(){
        return false;
    }
    
    public boolean esProvincial(){
        return false; 
    }

    @Override
    public String toString() {
        return "TipoRuta{" + "descTipoRuta=" + descTipoRuta + ", nombreRipoDeRuta=" + nombreRipoDeRuta + '}';
    }
    
    
    
}
