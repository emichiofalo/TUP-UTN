package Auditable;

/**
 *
 * @author Emi Chiófalo
 */

import ClubesDeportivos.*;                                                      //el * después del punto, importa todo el paquete
import Edificio.*;
import InstitucionEducativa.*;
        
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClubEquitacion equit1 = new ClubEquitacion(2, 120, 5, "Julio Polito", 5000, 3000);
        ClubNatacion nat1 = new ClubNatacion(4, 100, 15, "Rosa Mosqueta", 3000, 1500);
        EdificioOficinas edif1 = new EdificioOficinas(40, 8, 4, 5, 6, 3000, "Emilio Civit 500");
        EdificioResidencial edif2 = new EdificioResidencial(6, 3, 1, 0, 1, 6000, "Jacinto Suarez 733");
        Secundaria secund1 = new Secundaria("musical", 200, 10, "Patricias Mendocinas 400", 2005);
        Universidad uni1 = new Universidad(10, 400, 50, "Arístides Villanueva 900", 1850);
        
        inspeccionar(equit1);
        clausurar(equit1);
        System.out.println("------------------------------");
        inspeccionar(nat1);
        habilitar(nat1);
        System.out.println("------------------------------");
        inspeccionar(edif1);
        clausurar(edif1);
        System.out.println("------------------------------");
        inspeccionar(edif2);
        habilitar(edif2);
        System.out.println("------------------------------");
        inspeccionar(secund1);
        clausurar(secund1);
        System.out.println("------------------------------");
        inspeccionar(uni1);
        habilitar(uni1);
        
        secund1.Clausurar();
    }
    
    static void clausurar(Auditable institucion){
        institucion.Clausurar();
    } 
    
    static void habilitar(Auditable institucion){
        institucion.Habilitar();
    } 
    
    static void inspeccionar(Auditable institucion){
        institucion.Inspeccionar();
    } 
    
}
