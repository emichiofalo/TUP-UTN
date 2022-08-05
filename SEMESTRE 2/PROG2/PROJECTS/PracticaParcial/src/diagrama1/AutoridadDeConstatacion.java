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
public class AutoridadDeConstatacion extends Persona {
    
    private int idPlaca;
    private int idLegajo; 

    public AutoridadDeConstatacion() {
    }

    public AutoridadDeConstatacion(int idPlaca, int idLegajo, String nombre, String apellido, int dni, String genero) {
        super(nombre, apellido, dni, genero);
        this.idPlaca = idPlaca;
        this.idLegajo = idLegajo;
    }

    public int getIdPlaca() {
        return idPlaca;
    }

    public void setIdPlaca(int idPlaca) {
        this.idPlaca = idPlaca;
    }

    public int getIdLegajo() {
        return idLegajo;
    }

    public void setIdLegajo(int idLegajo) {
        this.idLegajo = idLegajo;
    }

    @Override
    public String toString() {
        return "AutoridadDeConstatacion{" + "\n" + 
                "nombre=" + this.nombre + " apellido=" + this.apellido + "\n" +
                "dni=" + this.dni + " genero=" + this.genero + "\n" +
                "idPlaca=" + idPlaca + ", idLegajo=" + idLegajo + '}';
    }
    
    
    
}
