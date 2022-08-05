package tp4;
/**
 * Rellenar golosinas: esta es una función exclusiva de un técnico por lo que para su ejecución nos pedirá una 
contraseña, si el usuario escribe “AdminXYZ” nos autorizara y pedirá la posición de la golosina y la cantidad a 
recargar. La cantidad ingresada se sumara a la cantidad actual existente.
 */

import java.util.Scanner;

public class ExpendingMachineFunctions {

    public static int totalIncome;
    
    public static void BuyCandy(String[][] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de golosina que quiere extraer:");
        ArrayFunctions.ShowColumnArray(array, "Lista de golosinas:",0);
        int option = sc.nextInt();
        StockControl(array, option);
    }
    
    public static void StockControl(String[][] array, int withdrawal){
        if ((Integer.valueOf(array[withdrawal-1][2]))>0) {
            array[withdrawal-1][2]=String.valueOf(Integer.valueOf(array[withdrawal-1][2])-1);
            TotalIncome(array, withdrawal);
        }else{
            System.out.println("Stock insuficiente. Seleccione otra golosina.");
        }
    }
    
    public static void ShowStock(String[][] array){
        System.out.println("Stock actual de golosinas: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] +": "+ array[i][2]);
        }
        System.out.println("");
    }
    
    public static void Refill(String[][] array){
        Scanner sc = new Scanner(System.in);
        
        String pw;
        do {
            System.out.println("Contraseña:");
            pw = sc.nextLine();
        } while (pw == "AdminXYZ");
        
        System.out.println("Ingrese la golosina que quiere rellenar:");
        ArrayFunctions.ShowColumnArray(array, "Lista de golosinas:",0);
        int option = sc.nextInt();
        System.out.println("Cuánto stock va a ingresar?");
        int refill = sc.nextInt();
        array[option-1][2]=String.valueOf(Integer.valueOf(array[option-1][2])+refill);
    }
    
    public static void TotalIncome (String[][] array, int option){
        totalIncome += Integer.valueOf(array[option-1][1]);   
    }
}
