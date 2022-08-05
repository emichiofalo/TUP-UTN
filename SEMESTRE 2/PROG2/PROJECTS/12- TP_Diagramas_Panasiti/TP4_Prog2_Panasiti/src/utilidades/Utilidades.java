/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Scanner;

/**
 *
 * @author Juan Marcelo Panasiti
 */
public class Utilidades {

    public static void print(String mensaje) {
        System.out.print(mensaje);
    }//print()

    public static void println(String mensaje) {
        System.out.println(mensaje);
    }//println()

    public static String leerCadena(String mensaje) {
        Scanner key;
        String cadena;
        print(mensaje);
        key = new Scanner(System.in);
        cadena = key.nextLine();
        return cadena;
    } //leerCadena()
    
    public static int leerEntero(String mensaje){
        //Devuelve un entero que se debe ingresar por teclado
        Scanner key;
        int entero;

        while(true){
            println(mensaje);
            key = new Scanner(System.in);
            if (key.hasNextInt()){
                entero = key.nextInt();
                break;
            } else {
                println("Error! no ingresó un número válido. Intente de nuevo.");
            }
        } // FIN While
        return entero;

    }//leerEntero()
    
    public static int leerEnteroEntre(String mensaje, int minimo, int maximo) {
        //Devuelve un entero que se debe ingresar por teclado y debe estar
        //entre los límites pasados por parámetro
        Scanner key;
        int entero;
        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }
        while (true) {
            entero = leerEntero(mensaje);
            if ((entero >= minimo) && (entero <= maximo)) {
                break;
            } else {
                println("Error! El valor ingresado está fuera de los límites.");
                continue;
            }
        } // FIN While
        return entero;
    }//leerEnteroEntre()
}
