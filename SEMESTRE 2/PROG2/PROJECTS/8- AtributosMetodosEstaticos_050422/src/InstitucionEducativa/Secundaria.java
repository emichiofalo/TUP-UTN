package InstitucionEducativa;

/**
 *
 * @author Emi Chiófalo
 */
public class Secundaria extends InstitucionEducativa{
    private String orientacion;
    private static int cantSecundarias = 0;

    public Secundaria(String orientacion, int cantAlumnos, int cantDocentes, String direccion, int anioApertura) {
        super(cantAlumnos, cantDocentes, direccion, anioApertura);
        this.orientacion = orientacion;
        this.cantSecundarias++;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public static int getCantSecundarias() {
        return cantSecundarias;
    }

    public static void setCantSecundarias(int cantSecundarias) {
        Secundaria.cantSecundarias = cantSecundarias;
    }

    public void Clausurar(){
        System.out.println("Secundaria clausurada.");
    }
    
    public void Habilitar(){
        System.out.println("Secundaria habilitada.");
    }
    
    public void Inspeccionar(){
        System.out.println("Secundaria en proceso de inspección.");
    }
}
