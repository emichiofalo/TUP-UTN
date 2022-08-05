package ejerciciosiete;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class Foto {

    private String pathToFile;
    private String nombre;
    private double tamanio;

    public Foto() {
    }

    public Foto(String pathToFile, String nombre, double tamanio) {
        this.pathToFile = pathToFile;
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }        
}
