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
public class Cuadrado extends PoligonoRegular {

    public Cuadrado(double lado) {
        super(4, lado);
    }

    public double area() {
        return lado * lado;
    }

}
