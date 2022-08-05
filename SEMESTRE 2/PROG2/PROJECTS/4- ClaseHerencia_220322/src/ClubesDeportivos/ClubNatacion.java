package ClubesDeportivos;

/**
 *
 * @author Emi Chiófalo
 */
public class ClubNatacion extends ClubDeportivo{
    private int cantPiletas;

    public ClubNatacion(int cantPiletas, int cantSocios, int cantEntrenadores, String presidente) {
        super(cantSocios, cantEntrenadores, presidente);
        this.cantPiletas = cantPiletas;
    }
    
    public int getCantPiletas() {
        return cantPiletas;
    }

    public void setCantPiletas(int cantPiletas) {
        this.cantPiletas = cantPiletas;
    }

}
