/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Invitado
 */
public class Anfibio extends Animal {
    private String especies;
    private String tipo_de_respiracion;
    private boolean piel_venenosa;
    private static int contador_anfibio_macho = 0;
    private static int contador_anfibio_hembra = 0;
    
    public Anfibio(int var, String especies, String tipo_de_respiracion, boolean piel_venenosa, boolean Cola, boolean Macho, int cantidad_crias, String distribucion_geografica, double peso) {
        super(Cola, Macho, cantidad_crias, distribucion_geografica, peso);
        this.especies = especies;
        this.tipo_de_respiracion = tipo_de_respiracion;
        this.piel_venenosa = piel_venenosa;
        this.setContador_anfibio(var);
    }

    private String getEspecies() {
        return especies;
    }
    public String llamarEspecies(){
        return getEspecies();
    }
    public void setEspecies(String especies) {
        this.especies = especies;
    }

    public String getTipo_de_respiracion() {
        return tipo_de_respiracion;
    }

    public void setTipo_de_respiracion(String tipo_de_respiracion) {
        this.tipo_de_respiracion = tipo_de_respiracion;
    }

    public boolean isPiel_venenosa() {
        return piel_venenosa;
    }

    public void setPiel_venenosa(boolean piel_venenosa) {
        this.piel_venenosa = piel_venenosa;
    }
    
    public static int getContador_anfibio_macho(){
        return contador_anfibio_macho;
    }
    
    public static int getContador_anfibio_hembra(){
        return contador_anfibio_hembra;
    }
    
    private void setContador_anfibio(int var) {
       if(var == 1){ contador_anfibio_macho = contador_anfibio_macho +1; }
       else if(var == 2){ contador_anfibio_hembra = contador_anfibio_hembra +1; }
    }
    
    

    
}
