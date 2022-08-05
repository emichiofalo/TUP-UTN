package tp5;

import java.util.Scanner; 

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[20];
        System.out.println("Ingrese 20 valores para cargar el array: ");
        for (int i = 0; i < 20; i++) {
            array[i]=sc.nextInt();
        }
        int[] arrayaux = array.clone();
        
        boolean exit = false;
        do {
            switch(SelectAscDesc()){
                case 1:
                    switch(SelectOrderingType()){
                        case 1: 
                            OrdenamientoSecuencial.OrdenamientoPorInsercionAsc(array);
                            break; 
                        case 2: 
                            OrdenamientoSecuencial.AlgoritmoBurbujaAsc(array);
                            break;
                        case 3: 
                            OrdenamientoSecuencial.OrdenamientoPorSeleccionAsc(array);
                            break;
                        default:
                        System.out.println("Elija una opcion valida.");
                        exit=false;
                    }
                    break;
                case 2:
                    switch(SelectOrderingType()){
                        case 1: 
                            OrdenamientoSecuencial.OrdenamientoPorInsercionDesc(array);
                            break; 
                        case 2: 
                            OrdenamientoSecuencial.AlgoritmoBurbujaDesc(array);
                            break;
                        case 3: 
                            OrdenamientoSecuencial.OrdenamientoPorSeleccionDesc(array);
                            break;
                        default:
                        System.out.println("Elija una opcion valida.");
                        exit=false;
                    }
                    break;
                default:
                    System.out.println("Elija una opcion valida.");
                    exit=false; 
            }
            PrintArrayDesordenado(arrayaux);
            PrintArrayOrdenado(array);
            exit = Exit();
        } while (!exit);
    }
    
    public static int SelectAscDesc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la tipo de orden del arreglo: ");
        System.out.println("1. Ascendente.");
        System.out.println("2. Descendente.");
        int n = sc.nextInt();
        return n;
    }
    
    public static int SelectOrderingType(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el metodo de ordenamiento que desea aplicar:");
        System.out.println("1. Insercion");
        System.out.println("2. Burbuja");
        System.out.println("3. Seleccion");
        int m = sc.nextInt();
        return m;
    }
    
    public static void PrintArrayDesordenado(int[] array){
        System.out.println("Array desordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    public static void PrintArrayOrdenado(int[] array){
        System.out.println("Array ordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    public static boolean Exit(){
        Scanner sc = new Scanner(System.in);
        boolean exit=false;
        int n;
        System.out.println("Desea salir? 1. SI | 2. NO");
        n = sc.nextInt();
        if (n==1) {
            exit=true;
        }else if (n==2){
            exit=false;
        }
        return exit;
    }
        
}
