/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesabstractas_290322;

/**
 *
 * @author Emi Chiófalo
 */
public abstract class PoligonoRegular {

    protected int numLados;
    protected double lado; // longitud de un lado 

    public PoligonoRegular(int numLados, double lado) {
        this.numLados = numLados;
        this.lado = lado;
    }

    public double perimetro() {
        return numLados * lado;
    }
    // este método lo tiene que hacer cada clase derivada; 
    // depende de cada polígono regular 

    public abstract double area();
}
