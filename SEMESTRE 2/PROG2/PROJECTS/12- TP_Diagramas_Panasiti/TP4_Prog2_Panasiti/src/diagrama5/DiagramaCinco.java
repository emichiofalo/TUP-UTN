/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama5;

import java.util.ArrayList;
import java.util.Scanner;
import static utilidades.Utilidades.*;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class DiagramaCinco {

    public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public static void ejecutar() {
        int option;
        boolean exit = false;
        Scanner key;
        while (true) {
            println("Seleccione una opción:");
            println("1) Agregar una bici");
            println("2) Agregar un auto");
            println("3) Agregar una moto");
            println("4) Mostrar todo");
            System.out.println("");
            println("0. Volver");
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
                    println("Nueva bici");
                    vehiculos.add(new Bicicleta(2, leerCadena("Dueño: ")));
                    break;
                case 2:
                    println("Nuevo auto");
                    vehiculos.add(new Auto(4, leerEnteroEntre("Cantidad de puertas: ",2,5), leerCadena("Dueño: ")));
                    break;
                case 3:
                    println("Nueva moto");
                    vehiculos.add(new Moto(2, leerCadena("Dueño: ")));
                    break;
                case 4:
                    for(Vehiculo vehiculo : vehiculos){
                        vehiculo.mostrarDatos();
                    }
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
