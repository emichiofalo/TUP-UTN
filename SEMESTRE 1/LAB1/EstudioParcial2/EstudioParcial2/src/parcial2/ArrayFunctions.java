package parcial2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunctions {
    
    public static void FillVector (int [] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese "+ array.length +" números:");
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
    }
    
    public static void ShowVector (int [] array, String name){
        System.out.println("");
        System.out.println(name);
        for (int column: array)
                System.out.print(column+" ");
        System.out.println("");
    }
    
    public static int NumberSearch(int[] array, int num){                       //devuelve la posición del numero en el array
        int i=0;
        boolean exit=false;
        while (exit!=true) {            
            if (i==50) {
                System.out.println("No se encontraron coincidencias.");
                exit = true;
            }else if(num==array[i]) {
                System.out.println("Numero encontrado.");
                exit = true;
            }else if (num!=array[i]) {
                i++;
            } 
        }
        return i;
    }
    
    public static void Ascendente(int array[]){
        int arrayAsc[] = new int[10];
        arrayAsc = array;
        Arrays.sort(arrayAsc);
        
        System.out.println("Arreglo en orden ascendente:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayAsc[i]);
        }
        System.out.println("");
        
        Descendente(arrayAsc);
    } 
    
    public static void Descendente(int arrayAsc[]){
        int arrayDesc[] = new int[10];
        int j=9;
        System.out.println("Arreglo en orden descendente:");
        for (int i = 0; i < 10; i++) {
            arrayDesc[i]=arrayAsc[j];
            j--;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayDesc[i]);
        }
        System.out.println("");
    }
    
    public static void FillArray (int [][] array){                              //MULTIDIMENSIONAL
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
    
    public static void ShowColumn (String [][] array, String name, int column){
        System.out.println("");
        System.out.println(name);
        int nLine = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println(nLine + ". " + array[i][column]);
            nLine++;
        }
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
    
    public static int [] SumColumns (int [][] array){
        int [] array2 = new int [array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                array2[i]=array2[i]+array[j][i];
            }
        }
        return array2;
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
    
    /*
    private static String[] buscarFertilizante(){
         String [] fertilizante = new String[3];
         while(true){
               System.out.println("Ingrese el codigo del fertilizante a ingresar");
               String codigo = leerCadena();

               boolean encontrado = false;
               for(int i=0; i < fertilizantesPermitidos.length; i++){
                   if(fertilizantesPermitidos[i][0].equals(codigo)){
                       fertilizante[0] = fertilizantesPermitidos[i][0];
                       fertilizante[1] = fertilizantesPermitidos[i][1];
                       fertilizante[2] = fertilizantesPermitidos[i][2];      
                       encontrado = true;
                       break;
                   }
               }
               if(!encontrado){
                   System.out.println("El codigo " + codigo + " del fertilizante ingresado no  existe, intente nuevamente.");
               }else{
                   break;
               }
         }
        
        return fertilizante;
    }
    */
}

