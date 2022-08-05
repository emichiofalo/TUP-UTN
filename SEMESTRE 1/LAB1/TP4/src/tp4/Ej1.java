package tp4;
/*
Crea un programa que pida por pantalla cuatro países y a continuación tres ciudades de cada uno de estos países. 
Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número asignado 
a cada país y el segundo índice el número asignado a cada ciudad. Es decir el array deberá tener un tamaño de 4x4
*/

import java.util.Scanner; 

public class Ej1 {

   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       String[][] CountryCity = new String[4][4];
       
       for (int i = 0; i < CountryCity.length; i++){
           System.out.println("Ingrese un país: ");
           CountryCity[i][0] = sc.nextLine();
           for (int j = 1; j < CountryCity.length; j++) {
               System.out.println("Ingrese una ciudad de ese país:");
               CountryCity[i][j] = sc.nextLine();
           }
        }
        
        for (String [] country : CountryCity) {
            System.out.println("");
            for (String city : country)
                System.out.print(city+" ");
        }   
        System.out.println("");
       }
       
    }  
    
