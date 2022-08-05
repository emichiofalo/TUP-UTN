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
public class ContactoTelefono {
    private static int nextID = 1;
    //atributos:
    private int idContactoTelefono;
    private String codigo;
    private String numero;

    public ContactoTelefono(int idContactoTelefono, String codigo, String numero) {
        this.idContactoTelefono = idContactoTelefono;
        this.codigo = codigo;
        this.numero = numero;
        nextID++;
    }

    public int getIdContactoTelefono() {
        return idContactoTelefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    //Metodos agregados
    public String getNumeroCompleto(){
        return ("(" + this.codigo + ") " + this.numero);
    }

    public void editarInfo(){
        String nuevoCodigo, nuevoTelefono;
        println("Editar código (Actual: " + this.codigo + ", vacio para no modificar): ");
        nuevoCodigo = leerCadena("Nuevo domicilio: ");
        if(!nuevoCodigo.isEmpty()){
            this.setCodigo(nuevoCodigo);
        }
        println("Editar número (Actual: " + this.numero + ", vacio para no modificar): ");
        nuevoTelefono = leerCadena("Nuevo domicilio: ");
        if(!nuevoTelefono.isEmpty()){
            this.setNumero(nuevoTelefono);
        }
    }
    //Metodos estáticos
    public static int getNextID(){
        return nextID;
    }
}
