package tp3;

import java.util.Scanner;

public class Ej9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero de DNI sin puntos: ");
        int numeroDNI = sc.nextInt();
        
        obtenerLetra(numeroDNI);
        
    }
    
    public static void obtenerLetra(int numeroDNI){
        int resto = numeroDNI%23;
        String tablaCaract[] = {"T","R","Q","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        for (int i = 0; i < 23; i++) {
            if (resto==i){
                System.out.println(numeroDNI+tablaCaract[i]);
            }
        }
    }
}
