/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama4;

import static utilidades.Utilidades.leerCadena;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class Lugar {
    private String nombre;
    private Direccion direccion;

    public Lugar() {
        this.nombre = leerCadena("Nombre del lugar: ");
        this.direccion = new Direccion();
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }
        
    
}
