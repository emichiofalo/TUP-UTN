package tp4;
/*
Codifique la siguiente matriz de 2 dimensiones, que se corresponde a una máquina expendedora 
de golosinas donde la columna 1 es la golosina, la columna 2 el precio y la columna 3 la cantidad 
(stock) actual de golosinas
Tendremos un pequeño menú con las siguientes opciones:
a. Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina tiene golosinas en cada posición, 
identificados por su fila y columna, que será lo que introduzca el usuario al pedir una golosina, por ejemplo 
si el usuario teclea 2 significa que está pidiendo la golosina que está en la fila 2. Al seleccionar una golosina 
debe disminuir la cantidad disponible de la golosina. En caso de agotar el stock de la golosina deberá informar 
de la situación al cliente y solicitarle que seleccione otra golosina.
b. Mostrar golosinas: mostrara todas las golosinas con la cantidad actual disponible.
c. Rellenar golosinas: esta es una función exclusiva de un técnico por lo que para su ejecución nos pedirá una 
contraseña, si el usuario escribe “AdminXYZ” nos autorizara y pedirá la posición de la golosina y la cantidad a 
recargar. La cantidad ingresada se sumara a la cantidad actual existente.
d. Apagar maquina: sale del programa, antes de salir mostrara las ventas totales durante la ejecución del programa. 
Es decir la suma de todos los precios de las golosinas seleccionadas desde el inicio del programa.
 */

import java.util.Scanner; 

public class Ej5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] ExpendingMachine = {{"KitKat","32","1"},
                                        {"Chicles","2","50"},
                                        {"Caramelos menta","2","50"},
                                        {"Huevo Kinder","25","10"},
                                        {"Chetoos","30","10"},
                                        {"Twix","26 ","10"},
                                        {"M&M'S","35","10"},
                                        {"Papas Lays","40","20"},
                                        {"Milkbar","30","10"},
                                        {"Alfajor Tofi","20","15"},
                                        {"Lata Coca","50","20"},
                                        {"Chitos","45","10"}};
        
        System.out.println("Eliga una opcion: ");
        System.out.println("Menu: ");
        System.out.println("1. Pedir golosina.");
        System.out.println("2. Mostrar golosinas.");
        System.out.println("3. Rellenar golosinas.");
        System.out.println("4. Apagar máquina.");
        System.out.println("");
        
        int option;
        
        do {
            option = sc.nextInt();
            switch(option){
                case 1:
                    ExpendingMachineFunctions.BuyCandy(ExpendingMachine);
                    System.out.println("Elija otra opcion:");
                    break;
                case 2: 
                    ExpendingMachineFunctions.ShowStock(ExpendingMachine);
                    System.out.println("Elija otra opcion:");
                    break;
                case 3:
                    ExpendingMachineFunctions.Refill(ExpendingMachine);
                    System.out.println("Elija otra opcion:");
                    break; 
                case 4:
                    System.out.println("Total de ventas: $" + ExpendingMachineFunctions.totalIncome);
                    System.out.println("Apagando maquina...");
                    break;
                default: 
                    System.out.println("Elija una opcion valida:");
            }
        } while (option!=4);
    }

}
    

