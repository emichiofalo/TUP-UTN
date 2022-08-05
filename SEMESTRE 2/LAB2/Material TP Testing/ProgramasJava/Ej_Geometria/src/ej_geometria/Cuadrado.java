/*
 Labortorio de Computacion II
 */

package ej_geometria;

/**
 *
 * @author jmonetti
 */
public class Cuadrado extends Figura {
    float lado;
    
    public Cuadrado(float lado) {
       this.lado = lado;
    }
    
    float calculaArea() {
      float area=0.0F;
        
      area = lado * lado;
      return area;
    }
    
}
