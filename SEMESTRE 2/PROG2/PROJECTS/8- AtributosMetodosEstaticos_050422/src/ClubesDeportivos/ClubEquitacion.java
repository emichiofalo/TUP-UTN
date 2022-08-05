package ClubesDeportivos;

/**
 *
 * @author Emi Chiófalo
 */
public class ClubEquitacion extends ClubDeportivo{
    private int cantVeterinarios;

    public ClubEquitacion(int cantVeterinarios, int cantSocios, int cantEntrenadores, String presidente, int cuota, int inscripcion) {
        super(cantSocios, cantEntrenadores, presidente, cuota, inscripcion);
        this.cantVeterinarios = cantVeterinarios;
    }

    public int getCantVeterinarios() {
        return cantVeterinarios;
    }

    public void setCantVeterinarios(int cantVeterinarios) {
        this.cantVeterinarios = cantVeterinarios;
    }
    
    public void Clausurar(){
        System.out.println("Club de equitacion clausurado.");
    }
    
    public void Habilitar(){
        System.out.println("Club de equitacion habilitado.");
    }
    
    public void Inspeccionar(){
        System.out.println("Club de equitacion en proceso de inspección.");
    }
    
}
