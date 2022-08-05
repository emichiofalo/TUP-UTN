/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama1;

import static utilidades.Utilidades.*;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class ContactoDomicilio {
    private static int nextID = 1;
    //Atributos:
    private int idContactoDomicilio;
    private String descripcion;

    public ContactoDomicilio(int idContactoDomicilio, String descripcion) {
        this.idContactoDomicilio = idContactoDomicilio;
        this.descripcion = descripcion;
        nextID++;
    }

    public int getIdContactoDomicilio() {
        return idContactoDomicilio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //Metodos agregados
    public void editarInfo(){
        String nuevoDomicilio;
        println("Editar Domicilio (Actual: " + this.descripcion + ", vacio para no modificar): ");
        nuevoDomicilio = leerCadena("Nuevo domicilio: ");
        if(!nuevoDomicilio.isEmpty()){
            this.setDescripcion(nuevoDomicilio);
        }
    }
    //Metodos estáticos
    public static int getNextID(){
        return nextID;
    }
}
