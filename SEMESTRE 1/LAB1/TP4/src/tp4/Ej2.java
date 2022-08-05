package tp4;

/*
Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un primer array de tamaño [X,Y] 
de tipo entero y almacene en cada posición un valor entero que deberá ser ingresado por el usuario. A continuación 
cree un segundo array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser ingresado por el 
usuario. Finalmente cree un tercer array de tamaño [X,Y] que será el resultante de multiplicar cada una de las 
posiciones de las filas del array uno por cada una de las posiciones de las columnas del array 2.
Muestre por pantalla cada uno de los arrays con sus valores.
*/

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int X,Y;
        System.out.println("Ingrese dos enteros para la dimensión de la matriz:");
        X = sc.nextInt();
        Y = sc.nextInt();
        
        int[][] array1 = new int[X][Y];
        
        System.out.println("Ingrese "+ X*Y +" números:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j]=sc.nextInt();
            }
        }
        
        int[][] array2 = new int[Y][X];
        
        System.out.println("Ingrese "+ X*Y +" números:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                array2[i][j]=sc.nextInt();
            }
        }
        
        int[][] array3 = new int[X][Y];
        
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
                array3[i][j]=array1[i][j]*array2[j][i];
                }
        }  
        
        System.out.println("");
        System.out.println("Array 1:");
        for (int[] fila: array1){
            for (int columna: fila)
                System.out.print(columna+" ");
        System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Array 2:");
        for (int[] fila: array2){
            for (int columna: fila)
                System.out.print(columna+" ");
        System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Array 3:");
        for (int[] fila: array3){
            for (int columna: fila)
                System.out.print(columna+" ");
        System.out.println("");
        }
        System.out.println("");
    }
    
}
