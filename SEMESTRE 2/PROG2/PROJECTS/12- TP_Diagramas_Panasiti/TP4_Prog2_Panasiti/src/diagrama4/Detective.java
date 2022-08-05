/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama4;

import java.util.ArrayList;
import static utilidades.Utilidades.leerCadena;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class Detective extends Persona{
    private String numeroPlaca;

    public Detective() {
        super();
        this.numeroPlaca = leerCadena("N° de placa: ");
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }
    public boolean investigatMafioso(Mafioso mafioso){
        return mafioso.investigar();
    }
}
