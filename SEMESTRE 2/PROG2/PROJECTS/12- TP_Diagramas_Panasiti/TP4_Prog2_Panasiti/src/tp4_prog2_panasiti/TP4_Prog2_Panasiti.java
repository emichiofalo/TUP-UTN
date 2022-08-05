/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4_prog2_panasiti;

import java.util.Scanner;

//import static diagrama1.DiagramaUno.*;
import static utilidades.Utilidades.*;

/**
 *
 * @author juan
 */
public class TP4_Prog2_Panasiti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option;
        boolean exit = false;
        Scanner key;
        while (true) {
            println("Seleccione una opción:");
            println("1) Diagrama 1: diagrama-de-clases.jpg");
            println("2) Diagrama 2: examenFacturasUTN2018.jpg");
            println("3) Diagrama 3: modelo.jpg");
            println("4) Diagrama 4: Recuperatorio_Noviembre_2014.png");
            println("5) Diagrama 5: diagrama_2013.jpg");
            System.out.println("");
            println("0. Salir");
            System.out.print("$ ");

            key = new Scanner(System.in);
            if (key.hasNextInt()) {
                option = key.nextInt();
            } else {
                key.nextLine();
                option = 99; //No importa el valor, en el switch saldrá por default
            }
            switch (option) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    diagrama1.DiagramaUno.ejecutar();
                    break;
                case 2:
                    diagrama2.DiagramaDos.ejecutar();
                    break;
                case 3:
                    diagrama3.DiagramaTres.ejecutar();
                    break;
                case 4:
                    diagrama4.DiagramaCuatro.ejecutar();
                    break;
                case 5:
                    diagrama5.DiagramaCinco.ejecutar();
                    break;
                default:
                    println("Opción incorrecta, intente de nuevo.");
                    break;
            } //Fin Switch
            if (exit) {
                break;
            } // Fin If
        } //Fin While
    }

}
