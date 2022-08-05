package tp5;

import java.util.Scanner;

public class ArrayFunctions {
    
    public static void FillArray (int [][] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese "+ array.length*array[0].length +" números:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j]=sc.nextInt();
            }
        }
    }
    
    public static void ShowArray (int [][] array, String name){
        System.out.println("");
        System.out.println(name);
        for (int[] line: array){
            for (int column: line)
                System.out.print(column+" ");
        System.out.println("");
        }
    }
    
    public static void ShowVector (int [] vector, String name){
        System.out.println(name);
        for (int line: vector){
            System.out.print(line+" ");
        }
        System.out.println("");
    }
    
    public static void SumLine (int [][] array){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n;
       
        do {
            System.out.println("Ingrese el numero de fila que desea sumar:");
            n = sc.nextInt();
        } while (!(n>0 && n<=array.length));
        
        for (int i = 0; i < array[0].length; i++) {
            result += array[n-1][i];
        }
        System.out.println("El resultado es: "+result);
    }
    
    public static void SumColumn (int [][] array){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n;
       
        do {
            System.out.println("Ingrese el numero de columna que desea sumar:");
            n = sc.nextInt();
        } while (!(n>0 && n<=array.length));
        
        for (int i = 0; i < array.length; i++) {
            result += array[i][n-1];
        }
        System.out.println("El resultado es: "+result);
    }
    
    public static void SumMainDiagonal (int [][] array){
        int result = 0;
        
        for (int i = 0; i < array.length; i++) {
            result += array[i][i];
        }
        System.out.println("El resultado es: "+result);
    }
    
    public static void SumInverseDiagonal (int [][] array){
        int result = 0;
        int column = array[0].length-1;
        
        for (int i = 0; i < array.length; i++) {
            result += array[i][column];
            column--;
        }
        System.out.println("El resultado es: "+result);
    }
    
    public static int Average (int [][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        int average = sum/(array.length*array[0].length);
        return average;
    }
    
    public static void ShowColumnArray (String [][] array, String name, int column){
        System.out.println("");
        System.out.println(name);
        int nLine = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println(nLine + ". " + array[i][column]);
            nLine++;
        }
    }
       
}

