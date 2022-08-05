package tp4;
/*
Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o igual a 10. 
Cree un arreglo de tamaño [X,X] de tipo int. Posteriormente solicite los valores necesarios 
para cargar cada una de las celdas de la matriz. Muestre por pantalla la matriz resultante.
Al finalizar la carga sume cada una de las columnas del array y asigne los resultados en una nueva matriz de 
una dimensión, finalmente sume los valores de esta última matriz y muestre el resultado por pantalla.
 */

import java.util.Scanner; 

public class Ej3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int X;
        
        do {
            System.out.println("Ingrese un numero entre 3 y 10: ");
            X = sc.nextInt();
        } while (!(X>=3 && X<=10));
        
        int [][] array1 = new int [X][X];
        ArrayFunctions.FillArray(array1);
        ArrayFunctions.ShowArray(array1, "Array 1:");
        
        int [] array2 = new int [X];
        for (int j = 0; j < array1[0].length; j++) {
            for (int i = 0; i < array1.length; i++) {
                array2[i]=array2[i]+array1[j][i];
            }
        }
        
        ArrayFunctions.ShowVector(array2, "Array 2:");
        
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum= sum+array2[i];
        }
        System.out.println("La suma del ultimo arreglo es: " + sum);
        
    }
}