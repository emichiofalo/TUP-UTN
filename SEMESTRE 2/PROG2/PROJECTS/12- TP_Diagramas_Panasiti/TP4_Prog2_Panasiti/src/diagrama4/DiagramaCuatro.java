/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrama4;

import java.util.ArrayList;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class DiagramaCuatro {
    private static int lugaresDelMafioso = 3;
    private static int mediosDeComunicacion = 2;
    private static ArrayList<MedioDeComunicacion> medios = new ArrayList<MedioDeComunicacion>();
    public static void ejecutar(){
        System.out.println("Datos del detective:");
        Detective sherlock = new Detective();
        System.out.println("Datos del mafioso:");
        Mafioso moriarty = new Mafioso();
        System.out.println("Ingrese " + lugaresDelMafioso + " lugares para el mafioso:");
        for(int i = 0; i < lugaresDelMafioso; i++){
            moriarty.agregarLugar(new Lugar());
        }
        System.out.println("Ingrese " + mediosDeComunicacion + " medios de comunicacion:");
        for(int i = 0; i < mediosDeComunicacion; i++){
            medios.add(new MedioDeComunicacion());
        }
        moriarty.setMedioDeComunicacion(medios);
        sherlock.setMedioDeComunicacion(medios);
        if(sherlock.investigatMafioso(moriarty)){
            System.out.println("El detective está investigando al mafioso");
            System.out.println("...");
            System.out.println("Atrapado!");
            System.out.println("Perfil del mafioso atrapado:");
            moriarty.mostrarDatos();
        }
        
    }
}
