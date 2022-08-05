package tp4;
/**
Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o igual a 10. 
Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú con estas opciones:
a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
c) Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
d) Sumar la diagonal principal
e) Sumar la diagonal inversa
f) La media de todos los valores de la matriz
IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se deberán de ejecutar, 
simplemente mostrar un mensaje que diga que debes rellenar la matriz. Mostrar por pantalla el 
resultado de la ejecución de cada una de las opciones del menú.
 */

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X;
        do {
            System.out.println("Ingrese un numero entre 4 y 10: ");
            X = sc.nextInt();
        } while (!(X>=4 && X<=10));
        
        int [][] array = new int [X][X];
        int y;
        boolean exit=false; 
        boolean case1=false;
        
        System.out.println("Eliga una opcion: ");
        System.out.println("Menu: ");
        System.out.println("1. Rellenar la matriz.");
        System.out.println("2. Sumar una fila de la matriz.");
        System.out.println("3. Sumar una columna de la matriz.");
        System.out.println("4. Sumar la diagonal principal de la matriz.");
        System.out.println("5. Sumar la diagnoal inversa de la matriz.");
        System.out.println("6. Calcular la media de los valores de la matriz.");
        System.out.println("7. Salir");
        System.out.println("");
        
        do {
            y = sc.nextInt();
            switch(y){
                case 1:
                    ArrayFunctions.FillArray(array);
                    ArrayFunctions.ShowArray(array, "Array:");
                    case1=true;
                    exit=false;
                    System.out.println("Elija otra opcion:");
                    break;
                case 2:
                    if (case1) {
                        ArrayFunctions.SumLine(array);
                        exit=Exit();
                    }else{
                        System.out.println("Primero debes rellenar la matriz. Elija la opcion 1.");
                        exit=false;
                    }
                    break;
                case 3: 
                    if (case1) {
                        ArrayFunctions.SumColumn(array);
                        exit=Exit();
                    }else{
                        System.out.println("Primero debes rellenar la matriz. Elija la opcion 1.");
                        exit=false;
                    }
                    break;
                case 4:
                    if (case1) {
                        ArrayFunctions.SumMainDiagonal(array);
                        exit=Exit();
                    }else{
                        System.out.println("Primero debes rellenar la matriz. Elija la opcion 1.");
                        exit=false;
                    }
                    break; 
                case 5: 
                    if (case1) {
                        ArrayFunctions.SumInverseDiagonal(array);
                        exit=Exit();
                    }else{
                        System.out.println("Primero debes rellenar la matriz. Elija la opcion 1.");
                        exit=false;
                    }
                    break; 
                case 6: 
                    if (case1) {
                        ArrayFunctions.Average(array);
                        exit=Exit();
                    }else{
                        System.out.println("Primero debes rellenar la matriz. Elija la opcion 1.");
                        exit=false;
                    }
                    break;
                default: 
                    exit=true;
                    break;
            }
        } while (!exit);
    }
    
    public static boolean Exit(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Desea salir?");
        System.out.println("1. SI | 2. NO");
        int option;
        boolean exit = false;
        do {
            option = sc.nextInt();
            if (option==1) {
                exit = true;
            }else if (option==2) {
                exit = false;
                System.out.println("Elija otra opcion:");
            }
        } while (!(option!=1 || option!=2));
        return exit;
    }
}
