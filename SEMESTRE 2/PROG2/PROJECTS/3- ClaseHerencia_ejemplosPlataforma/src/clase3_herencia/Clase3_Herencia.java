/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3_herencia;

/**
 *
 * @author Martin Vargas
 */
public class Clase3_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Camion c1 = new Camion(5550.25, false, 450.66, "Mendoza Capital", "Cordoba", "Iveco", "1995", 18);
        
        System.out.println("=> " + c1.getCantRuedas());
        c1.setCantRuedas(16);
        System.out.println("=> " + c1.getCantRuedas());
        
    }
    
}
