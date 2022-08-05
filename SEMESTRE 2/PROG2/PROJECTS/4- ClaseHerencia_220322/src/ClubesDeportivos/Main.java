package ClubesDeportivos;

/**
 *
 * @author Emi Chiófalo
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Club de equitacion.");
        ClubEquitacion equit1 = new ClubEquitacion(2, 120, 5, "Julio Polito");
        System.out.println("Pesidente: " + equit1.getPresidente());
        equit1.setPresidente("Enrique Iglesias");
        System.out.println("Pesidente: " + equit1.getPresidente());
        
        System.out.println("");
        
        System.out.println("Club de natacion");
        ClubNatacion nat1 = new ClubNatacion(4, 100, 15, "Rosa Mosqueta");
        System.out.println("Cantidad de piletas: " + nat1.getCantPiletas());
        nat1.setCantPiletas(5);
        System.out.println("Cantidad de piletas: " + nat1.getCantPiletas());
    }
    
}
