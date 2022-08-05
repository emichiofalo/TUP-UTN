package recuperatorio_parcial_1;

import java.util.Scanner;

public class Recuperatorio_Parcial_1 {

    public static void main(String[] args) {
        
        String[][] tablero = new String[10][10];
        
        System.out.println("Juego: Tres en linea.");
        System.out.println("Objetivo: Conseguir formar una linea de 3 fichas consecutivas verticales u horizontales.");
        System.out.println("Jugador 1. Ficha O.");
        System.out.println("Jugador 2. Ficha X.");
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("");
        
        final String circulo = "O";
        final String cruz = "X";
        boolean winner = false, empate = false;
        int fila = 0, columna = 0;
        
        do {
            while(true){
                System.out.println("Turno jugador 1.");
                System.out.println("Elija una celda.");
                System.out.println("Fila:");
                fila = leerInt();
                System.out.println("Columna:");
                columna = leerInt();
                if (tablero[fila][columna]==null) {
                    tablero[fila][columna]=circulo;
                    imprimirTablero(tablero);
                    break;
                }else{
                    System.out.println("La celda ya está ocupada. Seleccione una celda vacía.");
                }
            }
            empate(tablero);
            winner=winnerO(fila, columna, tablero);
            if (winner || empate) {
                break;
            }
            while(true){
                System.out.println("Turno jugador 2.");
                System.out.println("Elija una celda.");
                System.out.println("Fila:");
                fila = leerInt();
                System.out.println("Columna:");
                columna = leerInt();
                if (tablero[fila][columna]==null) {
                    tablero[fila][columna]=cruz;
                    imprimirTablero(tablero);
                    break;
                }else{
                    System.out.println("La celda ya está ocupada. Seleccione una celda vacía.");
                }
            }
            empate(tablero);
            winnerX(fila, columna, tablero);
            if (winner || empate) {
                break;
            }
        } while (!winner || !empate);
    }
    
    private static int leerInt(){
        int numero = 0;
        while(true){
            numero = new Scanner(System.in).nextInt();
            if(numero <0 || numero >9){
                System.out.println("Fuera del tablero. Elija un número entre 0 y 9.");
            }else{
                break;
            }
        }
        return numero;
    }
    
    private static void imprimirTablero(String[][] tablero){
        for (String[] line: tablero){
            for (String column: line)
                System.out.print(column+" ");
        System.out.println("");
        }
    }
    
    private static boolean empate(String[][] tablero){
        boolean empate = false;
        int cantidadNull=0;
        for (String[] line: tablero){
            for (String column: line)
                if (column == null) {
                    cantidadNull++;
                }
        }
        if (cantidadNull == 0) {
            empate = true;
        }
        return empate;
    }
    
    private static boolean winnerO(int f, int c, String[][] tablero){
        boolean winner = false;
        if (f==0 || c==0){
            if (tablero[f][c]=="O" && tablero[f+1][c]=="O" && tablero[f+2][c]=="O"){
                System.out.println("HAS GANADO!");
                winner = true;
            }else if (tablero[f][c]=="O" && tablero[f][c+1]=="O" && tablero[f][c+2]=="O"){
                System.out.println("HAS GANADO!");
                winner = true;
            }
        }else if(f==9 || c==9){
            if(tablero[f][c]=="O" && tablero[f-1][c]=="O" && tablero[f-2][c]=="O") {
                System.out.println("HAS GANADO!");
                winner = true;
            }else if (tablero[f][c]=="O" && tablero[f][c-1]=="O" && tablero[f][c-2]=="O"){
                System.out.println("HAS GANADO!");
                winner = true;
            }
        }else if(f==1 || c==1 || f==8 || c==8){
            if (tablero[f][c]=="O" && tablero[f+1][c]=="O" && tablero[f-1][c]=="O"){
                System.out.println("HAS GANADO!");
                winner = true;
            }else if (tablero[f][c]=="O" && tablero[f][c+1]=="O" && tablero[f][c-1]=="O"){
                System.out.println("HAS GANADO!");
                winner = true;
            }
        }else{
            if (tablero[f][c]=="O" && tablero[f+1][c]=="O" && tablero[f+2][c]=="O"){
                System.out.println("HAS GANADO!");
                winner = true;
            }else if (tablero[f][c]=="O" && tablero[f][c+1]=="O" && tablero[f][c+2]=="O"){
                System.out.println("HAS GANADO!");
                winner = true;
            }else if(tablero[f][c]=="O" && tablero[f-1][c]=="O" && tablero[f-2][c]=="O") {
                System.out.println("HAS GANADO!");
                winner = true;
            }else if (tablero[f][c]=="O" && tablero[f][c-1]=="O" && tablero[f][c-2]=="O"){
                System.out.println("HAS GANADO!");
                winner = true;
            }
        }
        return winner;
    }
    
    private static boolean winnerX(int f, int c, String[][] tablero){
        boolean winner = false;
        if (f==0 || c==0){
            if (tablero[f][c]=="X" && tablero[f+1][c]=="X" && tablero[f+2][c]=="X"){
                System.out.println("HAS GANADO!");
                winner = true;
            }else if (tablero[f][c]=="X" && tablero[f][c+1]=="X" && tablero[f][c+2]=="X"){
                System.out.println("HAS GANADO!");
                winner = true;
            }
        }else if(f==9 || c==9){
            if(tablero[f][c]=="X" && tablero[f-1][c]=="X" && tablero[f-2][c]=="X") {
                System.out.println("HAS GANADO!");
                winner = true;
            }else if (tablero[f][c]=="X" && tablero[f][c-1]=="X" && tablero[f][c-2]=="X"){
                System.out.println("HAS GANADO!");
                winner = true;
            }
        }else if(f==1 || c==1 || f==8 || c==8){
            if (tablero[f][c]=="X" && tablero[f+1][c]=="X" && tablero[f-1][c]=="X"){
                System.out.println("HAS GANADO!");
                winner = true;
            }else if (tablero[f][c]=="X" && tablero[f][c+1]=="X" && tablero[f][c-1]=="X"){
                System.out.println("HAS GANADO!");
                winner = true;
            }
        }else{
            if (tablero[f][c]=="X" && tablero[f+1][c]=="X" && tablero[f+2][c]=="X"){
                System.out.println("HAS GANADO!");
                winner = true;
            }else if (tablero[f][c]=="X" && tablero[f][c+1]=="X" && tablero[f][c+2]=="X"){
                System.out.println("HAS GANADO!");
                winner = true;
            }else if(tablero[f][c]=="X" && tablero[f-1][c]=="X" && tablero[f-2][c]=="X") {
                System.out.println("HAS GANADO!");
                winner = true;
            }else if (tablero[f][c]=="X" && tablero[f][c-1]=="X" && tablero[f][c-2]=="X"){
                System.out.println("HAS GANADO!");
                winner = true;
            }
        }
        return winner;
    }
}
