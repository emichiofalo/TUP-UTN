package tp6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Ej2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        Stack<Double> mayor = new Stack<Double>();
        Stack<Double> menor = new Stack<Double>();
        Double num;
        
        System.out.println("Ingrese numeros decimales: ");
        for (int i = 0; i < 20; i++) {
            num = sc.nextDouble();
            list.add(num);
            if (mayor.isEmpty()) {
                mayor.push(num);
            }else if (num>mayor.peek()) {
                mayor.pop();
                mayor.push(num);
            }
            if (menor.isEmpty()) {
                menor.push(num);
            }else if (num<menor.peek()) {
                menor.pop();
                menor.push(num);
            }
        }
        
        System.out.println("El mayor numero del arreglo es: " + mayor.peek());
        System.out.println("El menor numero del arreglo es: " + menor.peek());
        System.out.println("La diferencia entre ambos valores es de: " + (mayor.peek()-menor.peek()));
        
    }
    
}
