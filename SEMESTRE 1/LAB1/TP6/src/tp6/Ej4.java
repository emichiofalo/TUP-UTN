package tp6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Ej4 {

    public static void main(String[] args) {
        HashMap lista = new HashMap <String, Integer>();
        Scanner sc = new Scanner (System.in);
        String palabra ="", stack="";
        Stack<String> palabraMasLarga = new Stack<String>();
        
        while (!palabra.equalsIgnoreCase("salir")){
            palabra = sc.nextLine();
            if (!palabra.equalsIgnoreCase("salir")) {
                if (lista.containsKey(palabra)) {
                    int cuenta = (int) lista.get(palabra);
                    lista.put(palabra, cuenta+1);
                }else {
                    lista.put(palabra, 1);
                }
                stack = PalabraConMasCaracteres(palabraMasLarga, palabra);
            }
        }
        System.out.println("");
        PalabrasAlmacenadas(lista);
        System.out.println("");
        System.out.println("Palabra/s con más caracteres: " + stack);
        System.out.println("");
        ExistenPalabrasRepetidas(lista); 
        
    }
    
    public static void PalabrasAlmacenadas(HashMap <String, Integer> lista) {
        System.out.println("Las palabras ingresadas son: ");
        for (Map.Entry<String, Integer> entry : lista.entrySet()){
            System.out.print(entry.getKey() + " ");
        }
        System.out.println("");
    }
    
    public static String PalabraConMasCaracteres(Stack<String> palabraMasLarga, String palabra) {
        
        if (palabraMasLarga.isEmpty()) {
            palabraMasLarga.push(palabra);
        }else {
            if (palabra.length()==palabraMasLarga.peek().length()) {
                palabraMasLarga.push(palabra);
            }else if (palabra.length()>palabraMasLarga.peek().length()) {
                palabraMasLarga.clear();
                palabraMasLarga.push(palabra);
            }
        }
        return palabraMasLarga.toString();
    }
    
    public static void ExistenPalabrasRepetidas(HashMap <String, Integer> lista) {
        boolean repetidas = false;
        
        for (Map.Entry<String, Integer> entry : lista.entrySet()){
            if (entry.getValue()>1) {
                repetidas = true;
            }
        }
        if (repetidas) {
            System.out.println("Existen palabras repetidas. (palabra - cantidad de repeticiones)");
            MostrarPalabrasRepetidas(lista);
        }else {
            System.out.println("No existen palabras repetidas.");
        }
    }
    
    public static void MostrarPalabrasRepetidas(HashMap <String, Integer> lista) {
        System.out.println("Palabras repetidas y cantidad de repeticiones: ");
        for (Map.Entry<String, Integer> entry : lista.entrySet()){
            if (entry.getValue()>1) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
    }
    
}
