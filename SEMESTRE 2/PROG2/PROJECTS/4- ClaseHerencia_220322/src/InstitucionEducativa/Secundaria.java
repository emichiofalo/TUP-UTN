package InstitucionEducativa;

import InstitucionEducativa.InstitucionEducativa;

/**
 *
 * @author Emi Chiófalo
 */
public class Secundaria extends InstitucionEducativa{
    private String orientacion;

    public Secundaria(String orientacion, int cantAlumnos, int cantDocentes, String direccion, int anioApertura) {
        super(cantAlumnos, cantDocentes, direccion, anioApertura);
        this.orientacion = orientacion;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
    
}
