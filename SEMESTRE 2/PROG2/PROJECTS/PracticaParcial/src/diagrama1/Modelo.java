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
public class Modelo {

    private String modeloAuto;

    public Modelo() {
    }

    public Modelo(String modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public String getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(String modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    @Override
    public String toString() {
        return "Modelo{" + "modeloAuto=" + modeloAuto + '}';
    }
    
    
    
}
