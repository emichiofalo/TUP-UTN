package Controlador;

import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author Emi Chiófalo
 */
public class CalculadoraMVC {

    public static void main(String[] args) {
        Vista v1 = new Vista();
        Modelo m1 = new Modelo();
        Controlador c1 = new Controlador(v1,m1);
        v1.setVisible(true);
    }
    
}
