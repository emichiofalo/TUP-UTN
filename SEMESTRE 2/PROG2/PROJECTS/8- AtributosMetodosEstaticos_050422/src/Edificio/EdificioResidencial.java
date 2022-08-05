package Edificio;

/**
 *
 * @author Emi Chiófalo
 */
public class EdificioResidencial extends Edificio{
    private int cantDepartamentos; 

    public EdificioResidencial(int cantDepartamentos, int cantPisos, int cantSalidasEmergencia, int cantAscensores, int cantEspaciosComunes, int valorExpensas, String direccion) {
        super(cantPisos, cantSalidasEmergencia, cantAscensores, cantEspaciosComunes, valorExpensas, direccion);
        this.cantDepartamentos = cantDepartamentos;
    }

    public int getCantDepartamentos() {
        return cantDepartamentos;
    }

    public void setCantDepartamentos(int cantDepartamentos) {
        this.cantDepartamentos = cantDepartamentos;
    }
    
    public void Clausurar(){
        System.out.println("Edificio residencial clausurado.");
    }
    
    public void Habilitar(){
        System.out.println("Edificio residencial habilitado.");
    }
    
    public void Inspeccionar(){
        System.out.println("Edificio residencial en proceso de inspección.");
    }
    
}
