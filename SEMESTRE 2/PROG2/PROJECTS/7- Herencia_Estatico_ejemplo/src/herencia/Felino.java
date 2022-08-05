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
public class Felino extends Animal {
    private String tipos_de_felinos;
    private String color_pelaje;
    private String emision_de_sonido;

    public Felino(String tipos_de_felinos, String color_pelaje, String emision_de_sonido, boolean Cola, boolean genero, int cantidad_crias, String distribucion_geografica, double peso) {
        super(Cola, genero, cantidad_crias, distribucion_geografica, peso);
        this.tipos_de_felinos = tipos_de_felinos;
        this.color_pelaje = color_pelaje;
        this.emision_de_sonido = emision_de_sonido;
    }

    public Felino(boolean Cola, boolean Macho, int cantidad_crias, String distribucion_geografica, double peso) {
        super(Cola, Macho, cantidad_crias, distribucion_geografica, peso);
    }

    public Felino() {
        super (true, false, 4, "chile", 55.4);
    }

    public String getTipos_de_felinos() {
        return tipos_de_felinos;
    }

    public void setTipos_de_felinos(String tipos_de_felinos) {
        this.tipos_de_felinos = tipos_de_felinos;
    }

    public String getColor_pelaje() {
        return color_pelaje;
    }

    public void setColor_pelaje(String color_pelaje) {
        this.color_pelaje = color_pelaje;
    }

    public String getEmision_de_sonido() {
        return emision_de_sonido;
    }

    public void setEmision_de_sonido(String emision_de_sonido) {
        this.emision_de_sonido = emision_de_sonido;
    }
    
}
