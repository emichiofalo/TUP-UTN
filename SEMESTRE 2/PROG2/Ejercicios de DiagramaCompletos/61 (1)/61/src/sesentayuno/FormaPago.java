package sesentayuno;

/**
 *
 * @author Matias Barreto
 * Legajo: 49215
 * mail: barretomatias93@gmail.com
 */

public class FormaPago {
    
    private String idFormaPago;
    private String descripcion;
    private boolean estado;

    public FormaPago() {
    }

    public FormaPago(String idFormaPago, String descripcion, boolean estado) {
        this.idFormaPago = idFormaPago;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(String idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "FormaPago{" + "idFormaPago=" + idFormaPago + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }        
}
