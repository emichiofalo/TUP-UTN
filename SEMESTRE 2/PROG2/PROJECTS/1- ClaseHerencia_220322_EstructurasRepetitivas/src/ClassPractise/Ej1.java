package classpractise;

import java.util.Scanner;

/**
 * Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se calcula según el siguiente criterio: 
 * la parte práctica vale el 10%, la parte de problemas vale el 50% y la parte teórica el 40%. El programa leerá el nombre 
 * del alumno, las tres notas obtenidas, mostrará el resultado por pantalla, y a continuacicón volverá a pedir los datos 
 * del siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deber estar comprendidas entre 0 y 10, y si no
 * están dentro de ese rango no se imprimirá el promedio y se mostrará un mensaje de error. 
 */

public class Ej1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombre="hola";
        int nota1, nota2, nota3; 
        double prom; 
        
        while (!nombre.isEmpty()) {
            nombre = PedirNombre();
            if (!nombre.isEmpty()) {
                System.out.println("Nota 1 - práctica:");
                nota1 = sc.nextInt();
                System.out.println("Nota 2 - problemas:");
                nota2 = sc.nextInt();
                System.out.println("Nota 3 - teoría:");
                nota3 = sc.nextInt();
                if (nota1<0 || nota1>10 && nota2<0 || nota2>10 && nota3<0 || nota3>10) {
                    System.out.println("ERROR. Notas ingresadas incorrectas.");
                }else{
                    prom = CalcularProm(nota1,nota2,nota3);
                    System.out.println("El promedio es: " + prom);
                } 
            } 
        }
    }
    
    public static String PedirNombre (){
        Scanner sc = new Scanner(System.in);
        
        String nombre = "";
        
        System.out.println("Ingresar el nombre del alumno: ");
        nombre = sc.nextLine();
        return nombre;
    }
    
    public static double CalcularProm (int n1,int n2,int n3){
        double prom = n1*0.1+n2*0.4+n3*0.5; 
        return prom;
    }
    
    
}
