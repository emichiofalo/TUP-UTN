package claseenum;

import java.util.Scanner;

/**
 *
 * @author Emi Chiófalo
 */
public class ClaseEnum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana:");
        String dia = sc.nextLine();
        
        try{
            DiaSemana diaS = DiaSemana.valueOf(dia.toUpperCase());
            System.out.println(diaS.toString());
        }catch (Exception ex) {
            System.out.println("El día ingresado es incorrecto.");
        }
        
        
//      No es necesario, está en la clase enum
//        try {
//            DiaSemana diaS = DiaSemana.valueOf(dia.toUpperCase());
//            switch (diaS) {
//                case LUNES:
//                case MARTES:
//                case MIERCOLES:
//                case JUEVES:
//                case VIERNES:
//                    System.out.println("El dia " + diaS.name().toLowerCase() + " es laborable.");
//                    break;
//                case SABADO:
//                case DOMINGO:
//                    System.out.println("El dia " + diaS.name().toLowerCase() + " no es laborable.");
//                    break;
//            }
//        } catch (Exception e){
//            System.out.println("El día es incorrecto.");
//        }
       
    }
    
}
