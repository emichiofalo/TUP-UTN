package InstitucionEducativa;

import InstitucionEducativa.InstitucionEducativa;

/**
 *
 * @author Emi Chiófalo
 */
public class Universidad extends InstitucionEducativa{
    private int cantCarreras;

    public Universidad(int cantCarreras, int cantAlumnos, int cantDocentes, String direccion, int anioApertura) {
        super(cantAlumnos, cantDocentes, direccion, anioApertura);
        this.cantCarreras = cantCarreras;
    }

    public int getCantCarreras() {
        return cantCarreras;
    }

    public void setCantCarreras(int cantCarreras) {
        this.cantCarreras = cantCarreras;
    }
    
    public void Clausurar(){
        System.out.println("Universidad clausurada.");
    }
    
    public void Habilitar(){
        System.out.println("Universidad habilitada.");
    }
    
    public void Inspeccionar(){
        System.out.println("Universidad en proceso de inspección.");
    }
}
