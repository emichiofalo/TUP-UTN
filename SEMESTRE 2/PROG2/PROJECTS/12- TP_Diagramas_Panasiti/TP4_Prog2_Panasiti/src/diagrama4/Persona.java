/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama4;

import java.util.ArrayList;
import static utilidades.Utilidades.*;
/**
         *
         * @author Juan Marcelo Panasiti
         */

public class Persona {

    private String nombre;
    private String apellido;
    private Foto foto;
    private ArrayList<MedioDeComunicacion> comunicaciones;
    private ArrayList<Perfil> perfiles;

    public Persona() {
        this.nombre = leerCadena("Nombre: ");
        this.apellido = leerCadena("Apellido: ");
        this.foto = new Foto();
        this.comunicaciones = new ArrayList<MedioDeComunicacion>();
        this.perfiles = new ArrayList<Perfil>();
    }

    public void agregarPerfil() {
        Perfil perfil = new Perfil(leerEntero("Tipo de perfil: "), leerCadena("Descripcion: "));
        this.perfiles.add(perfil);
    }

    public boolean quitarPerfil(int indice) {
        try {
            this.perfiles.remove(indice);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void setMedioDeComunicacion(ArrayList<MedioDeComunicacion> comunicaciones){
        this.comunicaciones = comunicaciones;
    }
    public ArrayList<MedioDeComunicacion> getMedioDeComunicacion(){
        return this.comunicaciones;
    }
    
    public void mostrarDatos(){
        this.foto.showFoto();
        System.out.println("Nombre: " + this.apellido.toUpperCase() + ", " + this.nombre);
        System.out.println("Perfiles");
        for(Perfil perfil : this.perfiles){
            System.out.println("\tPerfil " + perfil.getTipoPerfil());
            System.out.println("\tDescripción: " + perfil.getDescripcion());
            System.out.println("");
        }
        System.out.println("Medios de comunicación favoritos");
        for(MedioDeComunicacion medio : this.getMedioDeComunicacion()){
            System.out.println("\tTipo medio: " + medio.getTipoMedio().getDescripcion());
            System.out.println("\tDescripción: " + medio.getDescripcion());
            System.out.println("");
        }
        System.out.println("");
    }
}
