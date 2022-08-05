/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama2;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public abstract class Persona {
    protected long dni;
    protected String nombre;
    protected String apellido;
    protected long cuit;

    public Persona(long dni, String nombre, String apellido, long cuit) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
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

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }
    
    
}
