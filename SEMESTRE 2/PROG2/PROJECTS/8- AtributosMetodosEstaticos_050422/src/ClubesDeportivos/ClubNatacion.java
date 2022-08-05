package ClubesDeportivos;

/**
 *
 * @author Emi Chiófalo
 */
public class ClubNatacion extends ClubDeportivo{
    private int cantPiletas;

    public ClubNatacion(int cantPiletas, int cantSocios, int cantEntrenadores, String presidente, int cuota, int inscripcion) {
        super(cantSocios, cantEntrenadores, presidente, cuota, inscripcion);
        this.cantPiletas = cantPiletas;
    }
    
    public int getCantPiletas() {
        return cantPiletas;
    }

    public void setCantPiletas(int cantPiletas) {
        this.cantPiletas = cantPiletas;
    }

    public void Clausurar(){
        System.out.println("Club de natacion clausurado.");
    }
    
    public void Habilitar(){
        System.out.println("Club de natacion habilitado.");
    }
    
    public void Inspeccionar(){
        System.out.println("Club de natacion en proceso de inspección.");
    }
}
