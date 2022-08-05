package ClubesDeportivos;

/**
 *
 * @author Emi Chiófalo
 */
public class ClubEquitacion extends ClubDeportivo{
    private int cantVeterinarios;

    public ClubEquitacion(int cantVeterinarios, int cantSocios, int cantEntrenadores, String presidente) {
        super(cantSocios, cantEntrenadores, presidente);
        this.cantVeterinarios = cantVeterinarios;
    }

    public int getCantVeterinarios() {
        return cantVeterinarios;
    }

    public void setCantVeterinarios(int cantVeterinarios) {
        this.cantVeterinarios = cantVeterinarios;
    }
    
}
