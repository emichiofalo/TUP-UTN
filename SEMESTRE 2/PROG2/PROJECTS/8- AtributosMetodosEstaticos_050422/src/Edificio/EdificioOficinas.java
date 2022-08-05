package Edificio;

/**
 *
 * @author Emi Chiófalo
 */
public class EdificioOficinas extends Edificio {
    private int cantOficinas;

    public EdificioOficinas(int cantOficinas, int cantPisos, int cantSalidasEmergencia, int cantAscensores, int cantEspaciosComunes, int valorExpensas, String direccion) {
        super(cantPisos, cantSalidasEmergencia, cantAscensores, cantEspaciosComunes, valorExpensas, direccion);
        this.cantOficinas = cantOficinas;
    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public void Clausurar(){
        System.out.println("Edificio de oficinas clausurado.");
    }
    
    public void Habilitar(){
        System.out.println("Edificio de oficinas habilitado.");
    }
    
    public void Inspeccionar(){
        System.out.println("Edificio de oficinas en proceso de inspección.");
    }
}
