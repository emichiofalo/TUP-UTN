package ejerciciosiete;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class MedioDeComunicacion {

    private String descripcion;
    private String tipoMedio;

    public MedioDeComunicacion() {
    }

    public MedioDeComunicacion(String descripcion, String tipoMedio) {
        this.descripcion = descripcion;
        this.tipoMedio = tipoMedio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoMedio() {
        return tipoMedio;
    }

    public void setTipoMedio(String tipoMedio) {
        this.tipoMedio = tipoMedio;
    }            
}
