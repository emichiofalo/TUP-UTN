/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class ContactoTipo {

    private static int nextID = 1;
    private static ArrayList<ContactoTipo> tipos = new ArrayList<ContactoTipo>();
    //Atributos:
    private int idContactoTipo;
    private String descripcion;

    public ContactoTipo(int idContactoTipo, String descripcion) {
        this.idContactoTipo = idContactoTipo;
        this.descripcion = descripcion;
        nextID++;
    }

    public int getIdCotactoTipo() {
        return idContactoTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Métodos estáticos
    public static int getNextID() {
        return nextID;
    }

    public static ContactoTipo getTipo(String descripcion) {
        for (ContactoTipo tipo : tipos) {
            if (tipo.getDescripcion().equalsIgnoreCase(descripcion)) {
                return tipo;//Devuelve tipo y termina el método
            }//if
        }//for
        //Si no encontró nada, devuelve un nuevo ContactoTipo con la descripción pasada por parámetro
        return new ContactoTipo(nextID, descripcion);
    }

}
