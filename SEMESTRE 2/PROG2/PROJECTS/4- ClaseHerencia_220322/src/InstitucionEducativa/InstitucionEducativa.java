package InstitucionEducativa;

/**
 *
 * @author Emi Chiófalo
 */
public class InstitucionEducativa {
    protected int cantAlumnos; 
    protected int cantDocentes; 
    protected String direccion; 
    protected int anioApertura; 
    
    public InstitucionEducativa(int cantAlumnos, int cantDocentes, String direccion, int anioApertura) {
        this.cantAlumnos = cantAlumnos;
        this.cantDocentes = cantDocentes;
        this.direccion = direccion;
        this.anioApertura = anioApertura;
        }

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }

    public int getCantDocentes() {
        return cantDocentes;
    }

    public void setCantDocentes(int cantDocentes) {
        this.cantDocentes = cantDocentes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnioApertura() {
        return anioApertura;
    }

    public void setAnioApertura(int anioApertura) {
        this.anioApertura = anioApertura;
    }
   
    
}
