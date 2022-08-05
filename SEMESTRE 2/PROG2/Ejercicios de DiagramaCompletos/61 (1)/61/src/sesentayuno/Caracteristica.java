package sesentayuno;

import java.util.ArrayList;

/**
 *
 * @author Matias Barreto Legajo: 49215 mail: barretomatias93@gmail.com
 */
public class Caracteristica {
    
    private int idCar;
    private String detalle;
    private ArrayList<DetalleCaracteristica> detalleCaracteristicas = new ArrayList<>();
    
    public Caracteristica() {
    }
    
    public Caracteristica(int idCar, String detalle) {
        this.idCar = idCar;
        this.detalle = detalle;
    }
    
    public int getIdCar() {
        return idCar;
    }
    
    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }
    
    public String getDetalle() {
        return detalle;
    }
    
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    public ArrayList<DetalleCaracteristica> getDetalleCaracteristicas() {
        return detalleCaracteristicas;
    }
    
    public void setDetalleCaracteristicas(DetalleCaracteristica detalleCaracteristicas) {
        this.detalleCaracteristicas.add(detalleCaracteristicas);
    }
    
    @Override
    public String toString() {
        return "Caracteristica{" + "idCar=" + idCar + ", detalle=" + detalle + ", detalleCaracteristicas=" + detalleCaracteristicas + '}';
    }
    
}
