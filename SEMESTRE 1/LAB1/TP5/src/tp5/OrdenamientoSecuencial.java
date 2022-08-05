package tp5;

import java.util.ArrayList;
import java.util.List;

public class OrdenamientoSecuencial {
    
    public static int[] OrdenamientoPorInsercion(String order, int[] array){
        if (order.equalsIgnoreCase("ASC")) {
            OrdenamientoPorInsercionAsc(array);
        }else if (order.equalsIgnoreCase("DESC")) {
            OrdenamientoPorInsercionDesc(array);
        }
        return array;
    }
    
    public static int[] OrdenamientoPorInsercionAsc(int[] array){
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j=i-1;
                while (j>=0 && array[j]>value){
                    array[j+1]=array[j];
                    j--;
                }
            array[j+1]=value;
        }
        return array;
    }
    
    public static int[] OrdenamientoPorInsercionDesc(int[] array){
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j=i-1;
                while (j>=0 && array[j]<value){
                    array[j+1]=array[j];
                    j--;
                }
            array[j+1]=value;
        }
        return array;
    }
    
    public static int[] AlgoritmoBurbuja(String order, int[] array){
        if (order.equalsIgnoreCase("ASC")) {
            AlgoritmoBurbujaAsc(array);
        }else if (order.equalsIgnoreCase("DESC")) {
            AlgoritmoBurbujaDesc(array);
        }
        return array;
    }
    
    public static int[] AlgoritmoBurbujaAsc(int[] array){
        int n=array.length;
        boolean exchanged;
        do {
            exchanged = false;
            for (int i = 1; i < n; i++) {
                if (array[i-1]>array[i]) {
                    int aux = array[i-1];
                    array[i-1] = array[i];
                    array[i] = aux;
                    exchanged = true;
                }
            }
        } while (exchanged==true);
        return array;
    }
    
    public static int[] AlgoritmoBurbujaDesc(int[] array){
        int n=array.length;
        boolean exchanged;
        do {
            exchanged = false;
            for (int i = 1; i < n; i++) {
                if (array[i-1]<array[i]) {
                    int aux = array[i-1];
                    array[i-1] = array[i];
                    array[i] = aux;
                    exchanged = true;
                }
            }
        } while (exchanged==true);
        return array;
    }
    
    public static int[] OrdenamientoPorSeleccion(String order, int[] array){
        if (order.equalsIgnoreCase("ASC")) {
            OrdenamientoPorSeleccionAsc(array);
        }else if (order.equalsIgnoreCase("DESC")) {
            OrdenamientoPorSeleccionDesc(array);
        }
        return array;
    }
    
    public static int[] OrdenamientoPorSeleccionAsc(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
    
    public static int[] OrdenamientoPorSeleccionDesc(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]<array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
    
    public static String BusquedaSecuencial(int[] array, int element){
        int position = 0;
        boolean found = false; 
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                found = true;
                position = i+1;
            }
        }
        if (found) {
            return "Encontrado: posicion " + position;
        }else{
            return "NO ENCONTRADO";
        }
    }
    
    public static void BusquedaSecuencial(int[][] array, int element){
        boolean found = false; 
        List <Integer> fila = new ArrayList<Integer>();
        List <Integer> columna = new ArrayList<Integer>();
                
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == element) {
                found = true;
                fila.add(i+1);
                columna.add(j+1);
                }
            }
        }
        if (found) {
            System.out.println("Encontrado: ");
            for (int i = 0; i < fila.size(); i++) {
                System.out.println("Posicion: fila " + fila.get(i) + ", columna " + columna.get(i));
            }
        }else{
            System.out.println("NO ENCONTRADO");
        }
    }
    
    public static String BusquedaSecuencial(String[] array, String element){
        int position = 0;
        boolean found = false; 
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(element)) {
                found = true;
                position = i+1;
            }
        }
        if (found) {
            return "Encontrado: posicion " + position;
        }else{
            return "NO ENCONTRADO";
        }
    }
}
