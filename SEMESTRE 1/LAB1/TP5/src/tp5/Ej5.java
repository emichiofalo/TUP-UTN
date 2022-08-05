package tp5;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos valores enteros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int[][] array = new int [x][y];
        
        ArrayFunctions.FillArray(array);
        System.out.println("El promedio de los valores ingresados es: ");
        int average = ArrayFunctions.Average(array);
        System.out.println(average);
        
        OrdenamientoSecuencial.BusquedaSecuencial(array, average);
          
    }
    
}
