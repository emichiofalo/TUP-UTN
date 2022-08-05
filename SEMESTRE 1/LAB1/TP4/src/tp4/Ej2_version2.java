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

public class Ej2_version2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int X,Y;
        System.out.println("Ingrese dos enteros para la dimensión de la matriz:");
        X = sc.nextInt();
        Y = sc.nextInt();
        
        int[][] array1 = new int[X][Y];
        int[][] array2 = new int[Y][X];
        
        ArrayFunctions.FillArray(array1);
        ArrayFunctions.FillArray(array2);
        
        int[][] array3 = new int[X][Y];
        
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++) {
                array3[i][j]=array1[i][j]*array2[j][i];
                }
        }  
                
        ArrayFunctions.ShowArray(array1,"Arreglo 1:");
        ArrayFunctions.ShowArray(array2,"Arreglo 2:");
        ArrayFunctions.ShowArray(array3,"Arreglo 3:");
        System.out.println("");
    }
    
}
