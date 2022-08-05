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
public class EstadoDelActa {
    
    private String decripcionEstadoActa; 
    private String nombreEstadoActa; 

    public EstadoDelActa() {
    }

    public EstadoDelActa(String decripcionEstadoActa, String nombreEstadoActa) {
        this.decripcionEstadoActa = decripcionEstadoActa;
        this.nombreEstadoActa = nombreEstadoActa;
    }

    public String getDecripcionEstadoActa() {
        return decripcionEstadoActa;
    }

    public void setDecripcionEstadoActa(String decripcionEstadoActa) {
        this.decripcionEstadoActa = decripcionEstadoActa;
    }

    public String getNombreEstadoActa() {
        return nombreEstadoActa;
    }

    public void setNombreEstadoActa(String nombreEstadoActa) {
        this.nombreEstadoActa = nombreEstadoActa;
    }

    @Override
    public String toString() {
        return "EstadoDelActa{" + "decripcionEstadoActa=" + decripcionEstadoActa + ", nombreEstadoActa=" + nombreEstadoActa + '}';
    }
    
    
    
}
