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
public class MedioDeComunicacion {
    private String descripcion;
    private TipoMedio tipoMedio;

    public MedioDeComunicacion() {
        this.descripcion = leerCadena("Descripción: ");
        this.tipoMedio = new TipoMedio();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }
    
}
