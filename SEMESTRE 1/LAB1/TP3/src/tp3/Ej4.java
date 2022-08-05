package tp3;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double nums[] = new double[20];
        
        System.out.println("Ingrese números decimales: ");
        for (int i = 0; i < 20; i++) {
            nums[i]=sc.nextDouble();
        }
        
        double mayor = Mayor(nums);
        double menor = Menor(nums);
        Diferencia(mayor,menor);
    }
    
    public static double Mayor(double nums[]){
        double mayor = 0.;
        for (int i = 0; i < 20; i++) {
            if (nums[i]>mayor) {
                mayor=nums[i];
            }
        }
        System.out.println("El mayor numero ingresado es: "+mayor);
        return mayor;
    }
    
    public static double Menor(double nums[]){
        double menor=nums[0];
        for (int i = 0; i < 20; i++) {
            if (nums[i]<menor) {
                menor=nums[i];
            }
        }
        System.out.println("El menor numero ingresado es: "+menor);
        return menor;
    }
    
    public static void Diferencia(double mayor, double menor){
        double dif = mayor-menor;
        System.out.println("La diferencia entre el mayor y el menor es de "+dif);
    }
    
}
