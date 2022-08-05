package tp6;

import java.util.ArrayList;

public class Ej3 {

    public static void main(String[] args) {
        int min_val = 1;              
        int max_val = 100;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int num = 0;
        
        for (int i = 0; i < 20; i++) {
            num = (int) (Math.random()*(max_val - min_val));
            if (num%2==0) {
                numeros.add(num);
            }else if (num%2!=0) {
                numeros.add(num+1);
            }
        }
        
        System.out.println(numeros);
        
        for (int numero : numeros) {
            num += numero;
        }
        
        int prom = num/20;
        System.out.println("El promedio aritmetico es: " + prom);
        
        int acumuladorIguales = 0, acumuladorMayores = 0, acumuladorMenores = 0;
        for (int numero : numeros) {
            if (numero == prom) {
                acumuladorIguales++;
            }else if (numero < prom) {
                acumuladorMenores++;
            }else{
                acumuladorMayores++;
            }                
        }
        
        System.out.println("Hay " + acumuladorIguales + " numeros iguales al promedio.");
        System.out.println("Hay " + acumuladorMayores + " numeros mayores al promedio.");
        System.out.println("Hay " + acumuladorMenores + " numeros menores al promedio.");
        
        
    }
    
}
