package tp3;

import java.util.Scanner; 

public class Ej8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese numeros separados por guiones medios: ");
        String numeros=sc.nextLine();
        
        String numSplit[]=numeros.split("-");
        int numSplitInt[]=new int [numSplit.length];
        int suma = 0;
        
        for (int i = 0; i < numSplit.length; i++) {
            numSplitInt[i]=Integer.parseInt(numSplit[i]);
            suma=suma+numSplitInt[i];
        }
        
        double sumaD=suma;
        double longitud = numSplit.length;
        double promedio = sumaD/numSplit.length;
        
        System.out.println("Suma de los elementos = "+suma);
        System.out.println("Promedio = "+promedio);
    }
    
}
