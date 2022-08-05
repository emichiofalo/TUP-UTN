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
public class TipoMedio {
    private String descripcion;

    public TipoMedio() {
        this.descripcion = leerCadena("Tipo de medio: ");
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
