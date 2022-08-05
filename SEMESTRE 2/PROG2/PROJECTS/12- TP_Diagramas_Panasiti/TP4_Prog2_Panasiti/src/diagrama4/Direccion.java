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
public class Direccion {
    private String descripcion;

    public Direccion() {
        this.descripcion = leerCadena("Dirección: ");
    }
    
}
