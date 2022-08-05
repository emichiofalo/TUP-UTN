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
public abstract class Persona {
    private static int nextID = 1;
    //atributos
    private String nombre;
    private String apellido;
    private int idPersona;

    public Persona(int idPersona, String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = idPersona;
        nextID++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdPersona() {
        return idPersona;
    }
    
    //Metodos agregados
    public String getNombreApellido(){
        return (this.nombre + " " + this.apellido);
    }
    
    public String getApellidoNombre(){
        return (this.apellido + ", " + this.nombre);
    }
    
    public void editarDatosPersonales(){
        String nuevoNombre, nuevoApellido;
        println("Editar nombre (Actual: " + this.nombre + ", vacio para no modificar): ");
        nuevoNombre = leerCadena("Nuevo nombre: ");
        if(!nuevoNombre.isEmpty()){
            this.setNombre(nuevoNombre);
        }
        println("Editar Apellido (Actual: " + this.apellido + ", vacio para no modificar): ");
        nuevoApellido = leerCadena("Nuevo apellido: ");
        if(!nuevoApellido.isEmpty()){
            this.setApellido(nuevoApellido);
        }
    }
    
    //Metodos estáticos
    public static int getNextID(){
        return nextID;
    }
    
}//Persona
