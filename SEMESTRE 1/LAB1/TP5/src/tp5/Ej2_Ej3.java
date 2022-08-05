package tp5;

import java.util.Scanner;

public class Ej2_Ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {5,7,2,4,9,3,1};
        int[] arrayaux = array;
                
        System.out.println("Ingrese el valor que desea encontrar entre 1 y 10:");   
        int value = sc.nextInt();                                                   
        String print = OrdenamientoSecuencial.BusquedaSecuencial(array, value);
        System.out.println(print);
        System.out.println("");
        
        System.out.println("Array desordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        
        //descomentar el metodo que se desea implementar
        System.out.println("Array ordenado: ");
        array = OrdenamientoSecuencial.OrdenamientoPorInsercion("ASC", array);
        //array = OrdenamientoSecuencial.OrdenamientoPorInsercion("DESC", array);
        //array = OrdenamientoSecuencial.AlgoritmoBurbuja("ASC", array);
        //array = OrdenamientoSecuencial.AlgoritmoBurbuja("DESC", array);
        //array = OrdenamientoSecuencial.OrdenamientoPorSeleccion("ASC", array);
        //array = OrdenamientoSecuencial.OrdenamientoPorSeleccion("DESC", array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
}
