package tp6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String value;
        int line, column;

        System.out.println("Ingrese los datos para las celdas (valor y posicion):");
        System.out.println("Ingrese 'FIN' cuando desee salir.");
        System.out.println("valor:");
        value = sc.nextLine();

        while (!value.equalsIgnoreCase("FIN")) {
            System.out.println("fila:");
            line = sc.nextInt();
            System.out.println("columna:");
            column = sc.nextInt();
            Celda celda = new Celda(line, column, value);
            Matriz.matrizCuadrada.add(celda);
            System.out.println("valor:");
            value = sc.next();
        }

        MostrarMatriz(Matriz.matrizCuadrada);
        System.out.println("");
        System.out.println("Ingrese una fila y columna: ");
        System.out.println("fila: ");
        line = sc.nextInt();
        System.out.println("columna: ");
        column = sc.nextInt();
        System.out.println(MostrarValor(line, column));
    }

    public static void MostrarMatriz(ArrayList<Celda> matriz) {
        System.out.println("");
        System.out.println("Matriz cargada:");
        for (Celda celda : matriz) {
            System.out.println("Valor: " + celda.getValor() + "," + " fila: " + celda.getFila() + "," + " columna: " + celda.getColumna() + ".");
        }
    }

    public static String MostrarValor(int fila, int columna) {
        for (Celda celda : Matriz.matrizCuadrada) {
            if (celda.getFila() == fila && celda.getColumna() == columna) {
                return "El valor almacenado es: " + celda.getValor();
            } else {
                return "La fila y columna indicadas no han sido asignadas.";
            }
        }
        return "";
    }

}
